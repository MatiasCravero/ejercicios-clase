package EjerciciosIntegradores.Ejercicio3;


public abstract class Invitado {
    private String nombre;
    private int dni;

    public Invitado() {

    }

    public void gritar(){
        System.out.println("Viva la chiqui!!!");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
