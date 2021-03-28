package EjerciciosIntegradores.Ejercicio3;

import java.util.ArrayList;

public class PackFuegos extends FuegoArtificial{
    public void explotar(){
        if(fuegos.size() > 0){
            for (FuegoArtificial fg: fuegos) {
                fg.explotar();
            }
        }
        if(packs.size() > 0){
            for(PackFuegos p: packs){
                for(FuegoArtificial fa: packs){
                    fa.explotar();
                }
            }
        }
    }

    public ArrayList<FuegoArtificial> getFuegos() {
        return fuegos;
    }

    public void setFuegos(ArrayList<FuegoArtificial> fuegos) {
        this.fuegos = fuegos;
    }

    public ArrayList<PackFuegos> getPacks() {
        return packs;
    }

    public void setPacks(ArrayList<PackFuegos> packs) {
        this.packs = packs;
    }

    private ArrayList<FuegoArtificial> fuegos;
    private ArrayList<PackFuegos> packs;
}
