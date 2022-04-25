package Bryan_Aleman.Bl;

import java.time.LocalDate;

public class Cliente extends Persona{
    private String tipoCliente;

    public String getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(String tipoCliente) {this.tipoCliente = tipoCliente;}

    public Cliente(String nombre, String identificacion, LocalDate fechaNacimiento, int edad, String tipoCliente) {
        super(nombre, identificacion, fechaNacimiento, edad);
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString()
                +
                " [Cliente '" + tipoCliente + '\'' +
                ']';
    }
}
