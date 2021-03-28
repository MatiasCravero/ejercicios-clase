package EjerciciosIntegradores.Ejercicio3;

public abstract class FuegoArtificial {
    private String ruido;
    private String nombre;
    private String marca;

    public FuegoArtificial(){

    }

    public abstract void explotar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }
}
