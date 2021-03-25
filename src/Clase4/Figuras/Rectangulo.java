package Clase4.Figuras;

public class Rectangulo extends FiguraGeometrica{
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        setArea(base * altura);
        return getArea();
    }
}
