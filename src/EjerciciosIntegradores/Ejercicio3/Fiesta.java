package EjerciciosIntegradores.Ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fiesta {
    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegos;
    private ArrayList<FuegoArtificial> packFuegos;

    public ArrayList<FuegoArtificial> getPackFuegos() {
        return packFuegos;
    }

    public void setPackFuegos(ArrayList<FuegoArtificial> packFuegos) {
        this.packFuegos = packFuegos;
    }


    public void servirTorta(){
        for (Invitado i: invitados){
            i.gritar();
        }
        for (FuegoArtificial fuegos: fuegos){
            fuegos.explotar();
        }
        for(FuegoArtificial p: packFuegos){
            p.explotar();
        }
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    public void setInvitados(ArrayList<Invitado> invitados) {
        this.invitados = invitados;
    }

    public ArrayList<FuegoArtificial> getFuegos() {
        return fuegos;
    }

    public void setFuegos(ArrayList<FuegoArtificial> fuegos) {
        this.fuegos = fuegos;
    }
}
