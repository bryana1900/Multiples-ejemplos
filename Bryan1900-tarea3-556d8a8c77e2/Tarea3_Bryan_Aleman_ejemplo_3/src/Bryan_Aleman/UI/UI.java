package Bryan_Aleman.UI;

import Bryan_Aleman.Bl.Bl;
import Bryan_Aleman.Bl.Cuadrado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        Double cuadrad;

        System.out.println("Digite base");
        cuadrad = Double.parseDouble(in.readLine());
        Cuadrado cb = new Cuadrado(cuadrad);
        Bl.registrar(cb);

        Cuadrado c = new Cuadrado();
        c.calcularArea();

        Cuadrado f;
        f = new Cuadrado();

        f.calcularArea();

        ArrayList<Cuadrado> cuadrados = Bl.listar();
        for (Cuadrado cuadrado : cuadrados) {System.out.println(cuadrado.toString());}

        Cuadrado c1 = new Cuadrado();
        cuadrados.add(c1);

    }
}
