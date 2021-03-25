package Clase4.Figuras;

public abstract class FiguraGeometrica {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double area();
}
