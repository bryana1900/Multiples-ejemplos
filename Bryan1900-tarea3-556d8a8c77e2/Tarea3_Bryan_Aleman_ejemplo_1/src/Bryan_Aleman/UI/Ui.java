package Bryan_Aleman.UI;

import Bryan_Aleman.Bl.Bl;
import Bryan_Aleman.Bl.Cliente;
import Bryan_Aleman.Bl.Empleado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ui {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Bl bl = new Bl();

    public static void main(String args[]) throws java.io.IOException {
        int opcion = -1;
        do {opcion = menu();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    static int menu() throws java.io.IOException {
        int opcion;
        opcion = 0;
        out.println("===Bienvenido a NEWTELEGO===");
        out.println("  =======================");
        out.println("|| 1. Registrar Cliente  ||");
        out.println("|| 2. Listar Clientes    ||");
        out.println("|| 3. Registrar Empleado ||");
        out.println("|| 4. Listar Empleados   ||");
        out.println("  =======================");
        out.println("0. Salir del sistema");
        out.println("Digite la opción");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    static void procesarOpcion(int opcion) throws java.io.IOException {
        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                listarCliente();
                break;
            case 3:
                registrarEmpleado();
                break;
            case 4:
                listarEmpleado();
                break;
            case 0:
                out.println("Fin del programa !!");
                break;
            default:
                out.println("Opcion inválida");
        }
    }

    static void registrarCliente() throws java.io.IOException{
        String nombre;
        String identificacion;
        LocalDate fechaNacimiento;
        int edad;
        String tipocliente;

        out.println("Digite su nombre");
        nombre = in.readLine();
        out.println("Digite su identificación");
        identificacion = in.readLine();
        out.println("Digite la fecha de Nacimiento Año-Mes-Dia");
        fechaNacimiento = LocalDate.parse(in.readLine());
        out.println("Digite su edad");
        edad = Integer.parseInt(in.readLine());
        out.println("Digite si usted es cliente [Regular] [Nuevo]");
        tipocliente = in.readLine();

        Cliente tpc = new Cliente(nombre,identificacion,fechaNacimiento,edad,tipocliente);
        bl.registrarCliente(tpc);
    }

    static void registrarEmpleado() throws java.io.IOException{
        String nombre;
        String identificacion;
        LocalDate fechaNacimiento;
        int edad;
        String tipoempleado;

        out.println("Digite su nombre");
        nombre = in.readLine();
        out.println("Digite su identificación");
        identificacion = in.readLine();
        out.println("Digite la fecha de Nacimiento Año-Mes-Dia");
        fechaNacimiento = LocalDate.parse(in.readLine());
        out.println("Digite su edad");
        edad = Integer.parseInt(in.readLine());
        out.println("Digite si usted es empleado [Interno] [Externo]");
        tipoempleado = in.readLine();

        Empleado tme = new Empleado(nombre,identificacion,fechaNacimiento,edad,tipoempleado);
        bl.registrarEmpleado(tme);
    }

    static void listarCliente(){
        out.println("***Clientes actuales***");
        ArrayList<Cliente> clientes = bl.listarClientes();
        for(Cliente cliente:clientes) {out.println(cliente.toString());
        }
    }

    static void listarEmpleado(){
        out.println("***Empleados actuales***");
        ArrayList<Empleado> empleados = bl.listarEmpleado();
        for(Empleado empleado:empleados) {out.println(empleado.toString());
        }
    }
}
