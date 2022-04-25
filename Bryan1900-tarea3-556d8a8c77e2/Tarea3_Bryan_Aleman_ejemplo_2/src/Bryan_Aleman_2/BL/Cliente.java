package Bryan_Aleman_2.BL;

public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private int cuenta;

    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCuenta() {return cuenta;}
    public void setCuenta(int cuenta) {this.cuenta = cuenta;}

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "ID: " + id +
                ", Nombre: " + nombre + '\'' +
                ", Edad: " + edad +
                ']';
    }
}
