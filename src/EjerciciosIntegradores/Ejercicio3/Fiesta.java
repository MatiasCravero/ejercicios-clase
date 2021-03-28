package EjerciciosIntegradores.Ejercicio3;

import java.util.ArrayList;

public class Fiesta {
    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegos;

    public void servirTorta(){
        for (Invitado i: invitados){
            i.gritar();
        }
        for (FuegoArtificial fuegos: fuegos){
            fuegos.explotar();
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
