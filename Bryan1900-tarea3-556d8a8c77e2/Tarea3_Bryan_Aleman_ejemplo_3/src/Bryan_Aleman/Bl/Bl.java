package Bryan_Aleman.Bl;

import java.util.ArrayList;

public class Bl {
    private static ArrayList<Cuadrado> cuadrados;


    public static void registrar(Cuadrado emp){
        if(cuadrados == null){cuadrados = new ArrayList<>();}
        cuadrados.add(emp);
    }

    public static ArrayList<Cuadrado> listar(){
        return  cuadrados;
    }
}
