package Bryan_Aleman.Bl;

import java.time.LocalDate;

public class Empleado extends Persona {
    private String tipoEmpleado;

    public String getTipoEmpleado() {return tipoEmpleado;}
    public void setTipoEmpleado(String tipoEmpleado) {this.tipoEmpleado = tipoEmpleado;}

    public Empleado(String nombre, String identificacion, LocalDate fechaNacimiento, int edad, String tipoEmpleado) {
        super(nombre, identificacion, fechaNacimiento, edad);
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado " + super.toString()
                +
                "[Empleado '" + tipoEmpleado + '\'' +
                ']';
    }
}
