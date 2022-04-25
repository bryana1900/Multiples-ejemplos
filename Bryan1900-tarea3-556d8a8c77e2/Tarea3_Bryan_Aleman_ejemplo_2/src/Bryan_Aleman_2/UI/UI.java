package Bryan_Aleman_2.UI;

import Bryan_Aleman_2.BL.CL;
import Bryan_Aleman_2.BL.Cliente;
import Bryan_Aleman_2.BL.Cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class UI {
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL datos = new CL();

    public static void main(String[] args) throws IOException {
        int opcion = -1;
        do {
            menu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    static void menu() {
        out.println(ANSI_BLUE + "Bienvenido al cajero automatico");
        out.println("      ===Snowtopex===" + ANSI_RESET);
        out.println(ANSI_BLACK+" =============================");
        out.println("|| ---Escoga una opcion---   ||");
        out.println("|| 1.Registrar Cliente.      ||");
        out.println("|| 2.Listar clientes.        ||");
        out.println("|| 3.Realizar Transacciones. ||");
        out.println("|| 4.Lista de transacciones. ||");
        out.println("|| 0.Salir.                  ||");
        out.println(" ============================="+ ANSI_RESET);
    }

    static void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                listar();
                break;
            case 3:
                Deposito();
                break;
            case 4:
                listarCuentas();
                break;
            case 0:
                out.println(ANSI_CYAN+"Gracias por usar el programa"+ANSI_RESET);
                break;
            default:
                out.println(ANSI_RED+"Opción inválida"+ANSI_RESET);
                break;
        }
    }

    static int seleccionarOpcion() throws IOException {
        out.println("Digite la opción");
        return Integer.parseInt(in.readLine());
    }

    static void registrarCliente() throws IOException {
        out.println("Ingrese su nombre");
        String nombre = in.readLine();

        out.println("Ingrese su identificacion");
        int id = Integer.parseInt(in.readLine());

        out.println("Ingrese su edad");
        int edad = Integer.parseInt(in.readLine());

        Cliente tmp = new Cliente(id, nombre, edad);
        datos.registrarCliente(tmp);
        out.println(ANSI_CYAN+"=====================================================");
        out.println("Su registro a sido exitoso gracias por usar Snowtopex");
        out.println("====================================================="+ ANSI_RESET);
    }

    static void Deposito() throws IOException {
        out.println("Ingrese un deposito a la cuenta");
        int saldoc = Integer.parseInt(in.readLine());
        saldoc = saldoc;
        int op = -1;
        Cuenta ahor = new Cuenta(saldoc);
        int as=ahor.sal(saldoc);
        out.println("Su saldo es: "+ANSI_YELLOW+as+ANSI_RESET);
       do {
            out.println(ANSI_CYAN+"===QUE TRANSFERENCIA DESEA HACER ACONTINUACION==="+ANSI_RESET);
            out.println(ANSI_BLACK+"  ================================");
            out.println("||  1:RETIRO                     ||");
            out.println("||  2:DEPOSITO                   ||");
            out.println("||  0:salir                      ||");
            out.println("  ================================"+ANSI_RESET);
            op=Integer.parseInt(in.readLine());
            switch(op){
                case 1:
                    out.println("ingrese el retiro");
                    int ret=Integer.parseInt(in.readLine());
                    if(ret<=saldoc){
                        int retiro=ahor.reti(ret);
                        saldoc=retiro;
                        out.println("Su retiro fue realizado.");
                        out.println("Su saldo actual es: ");
                        out.println(ANSI_YELLOW+saldoc+ANSI_RESET);
                        out.println("");
                    }else{
                        out.println(ANSI_RED+"Su retiro es ivalido"+ANSI_RESET);
                    }
                    break;
                case 2:
                    out.println("ingrese la cantidad de deposito");
                    int d=Integer.parseInt(in.readLine());
                    int r=ahor.depos(d);
                    saldoc=r;
                    out.println("su deposito a sido realizado");
                    out.println("Su saldo actual es: ");
                    out.println(ANSI_YELLOW+saldoc+ANSI_RESET);
                    break;
                case 0:
                    out.println(ANSI_CYAN+"Gracias por usar el programa"+ANSI_RESET);
                    break;
                default:
                    break;
            }
           Cuenta cbCuenta = new Cuenta(saldoc);
           datos.registrarCuentas(cbCuenta);
       }while (op!=0);
    }

    static void listar() {
        out.println(ANSI_GREEN+" --LISTA DE CLIENTES-- ");
        ArrayList<Cliente> clientes = CL.listarClientes();
        for (Cliente cliente : clientes) {out.println(cliente.toString());}
        out.println(ANSI_RESET);
    }

    static void listarCuentas() {
        out.println(ANSI_GREEN+" --LISTA DE CUENTAS-- ");
        ArrayList<Cuenta> cuentas = datos.listarCuentas();
        for (Cuenta cuenta : cuentas) {out.println(cuentas.toString());}
        out.println(ANSI_RESET);
    }

}




