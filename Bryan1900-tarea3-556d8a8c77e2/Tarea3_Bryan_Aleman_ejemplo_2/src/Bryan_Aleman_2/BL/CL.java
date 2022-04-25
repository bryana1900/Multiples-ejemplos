package Bryan_Aleman_2.BL;
import java.util.ArrayList;


public class CL {
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Cuenta> cuentas;

    public static void registrarCliente(Cliente emp){
        if(clientes == null){clientes = new ArrayList<>();}
        clientes.add(emp);
    }

    public static ArrayList<Cliente> listarClientes(){
        return  clientes;
    }

    public static void registrarCuentas(Cuenta cb){
        if(cuentas == null){cuentas = new ArrayList<>();}
        cuentas.add(cb);
    }

    public static ArrayList<Cuenta> listarCuentas(){return  cuentas;}
}
