package Clase3;

public class Libro {
    private String nombre;
    private String codigo;
    private String autor;
    private boolean estaPrestado;

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(){

    }

    public Libro(String nombreInit, String codigoInit, String autorInit){
        this.autor = autorInit;
        this.codigo = codigoInit;
        this.nombre = nombreInit;
    }

    public Libro(Libro libroInit){
        this.nombre = libroInit.getNombre();
        this.codigo = libroInit.getCodigo();
        this.autor = libroInit.getAutor();
    }

    @Override
    public String toString() {
        return this.nombre + "," + this.codigo + "," + this.autor;
    }

    public void Prestamo(){
        this.estaPrestado = true;
    }
    public void Devolución(){
        this.estaPrestado = false;
    }

    public boolean EstaDisponible(){
        if(estaPrestado){
            return false;
        }
        return  true;
    }

}
