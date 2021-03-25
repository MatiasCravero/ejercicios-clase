package Clase4.Figuras;

public class Triangulo extends FiguraGeometrica {
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;
    @Override
    public double area() {
        setArea((base * altura)/2);
        return getArea();
    }
}
