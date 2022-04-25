package Bryan_Aleman.Bl;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String identificacion;
    private LocalDate fechaNacimiento;
    private int edad;

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getIdentificacion() {return identificacion;}
    public void setIdentificacion(String identificacion) {this.identificacion = identificacion;}

    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public Persona() {
    }

    public Persona(String nombre, String identificacion, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona[" +
                "Nombre: " + nombre + '\'' +
                ", ID: " + identificacion + '\'' +
                ", Fecha Nacimiento: " + fechaNacimiento +
                ", Edad: " + edad +
                ']';
    }
}
