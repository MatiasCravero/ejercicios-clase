package Clase3;

public class Contador {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Contador(){

    }
    public Contador(double valorInicial){
        valor = valorInicial;
    }
    public  Contador(Contador contadorInit){
        this.valor = contadorInit.getValor();
    }
    public void IncrementarValor(double monto){
        this.valor += monto;
    }
    public void DecrementarValor(double monto){
        this.valor += monto;
    }

}
