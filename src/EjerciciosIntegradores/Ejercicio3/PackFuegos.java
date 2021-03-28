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

    private ArrayList<FuegoIndividual> fuegos;
    private ArrayList<PackFuegos> packs;
}
