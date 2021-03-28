package EjerciciosIntegradores.Ejercicio3;

public class InvitadoMeli extends Invitado {
    private int legajo;

    public InvitadoMeli(String nombre, int dni, int legajo){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setLegajo(legajo);
    }


    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
