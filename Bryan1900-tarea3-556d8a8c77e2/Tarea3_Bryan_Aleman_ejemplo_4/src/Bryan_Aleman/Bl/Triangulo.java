package Bryan_Aleman.Bl;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public Triangulo(double base) {
        this.base = base;
    }

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public Triangulo() {
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }
}
