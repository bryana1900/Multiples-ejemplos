package Bryan_Aleman.Bl;

public class Cuadrado implements Figura{
    private double lado;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public double calcularArea() {
        return this.lado*this.lado;
    }

    public double calcularPerimetro() {
        return this.lado*4;
    }

    @Override
    public String toString() {
        return "Cuadrado[" +
                "Calculo De Area = " + calcularArea() +
                ",  Calculo De Perimetro = " + calcularPerimetro() +
                ']';
    }
}
