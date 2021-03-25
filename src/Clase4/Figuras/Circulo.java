package Clase4.Figuras;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
       setArea(Math.PI * Math.pow(radio, 2));
       return getArea();
    }
}
