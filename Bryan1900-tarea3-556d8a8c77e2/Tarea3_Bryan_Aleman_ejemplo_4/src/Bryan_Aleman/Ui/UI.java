package Bryan_Aleman.Ui;

import Bryan_Aleman.Bl.Triangulo;
import Bryan_Aleman.Bl.Figura;

import java.util.ArrayList;

public class UI {
    public static void main(String[] args) {

        Triangulo c = new Triangulo();
        c.calcularArea();
        Figura f;
        f = new Triangulo();
        f.calcularArea();
        ArrayList<Figura> figuras = new ArrayList<>();
        Triangulo c1 = new Triangulo();
        figuras.add(c1);

    }
}
