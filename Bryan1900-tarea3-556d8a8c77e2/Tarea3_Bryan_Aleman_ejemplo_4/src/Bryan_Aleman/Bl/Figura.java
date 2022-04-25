package Bryan_Aleman.Bl;

public abstract class Figura {
    private double area;

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public Figura() {
    }

    public abstract double calcularArea();

}
