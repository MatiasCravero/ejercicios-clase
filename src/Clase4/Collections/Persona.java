package Clase4.Collections;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private Integer dni;

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){

    }
    public Persona(String nombreInit, Integer dniInit){
        nombre = nombreInit;
        dni = dniInit;
    }

    public Persona(Persona personaInit){
        if(personaInit != null)
            nombre = personaInit.getNombre();
            dni = personaInit.getDni();
    }

    @Override
    public int PrecedeA(Persona t) {
        // Si precede retorna 1, si no precede retorna -1;
        //boolean precedeA = this.dni < t.dni;
       // boolean noPrecedeA = this.dni > t.dni;
       // if(precedeA){
       //     return 1;
       // }
       // if (noPrecedeA){
       //     return -1;
       // }
        // Si ninguna de las dos condiciones se cumple, significa que son iguales y retorna 0
        //return 0;

        return this.dni.compareTo(t.dni);
    }
}
