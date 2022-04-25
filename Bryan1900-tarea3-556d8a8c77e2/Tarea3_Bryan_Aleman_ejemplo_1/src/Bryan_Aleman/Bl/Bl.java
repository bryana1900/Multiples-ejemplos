package Bryan_Aleman.Bl;

import java.util.ArrayList;

public class Bl {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public void registrarEmpleado(Empleado empleado) {
        Persona persona = new Persona();
        if (empleados == null) {empleados = new ArrayList<>();}empleados.add(empleado);
    }

    public void registrarCliente(Cliente cliente) {
        Persona persona = new Persona();
        if (clientes == null) {clientes = new ArrayList<>();}clientes.add(cliente);
    }

    public ArrayList<Empleado> listarEmpleado() {return empleados;}

    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }
}
