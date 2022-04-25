package Bryan_Aleman_2.BL;

public class Cuenta {
    private int cuenta;
    private int saldoc;

    public int getCuenta() {return cuenta;}
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldoc() {
        return saldoc;
    }
    public void setSaldoc(int saldoc) {
        this.saldoc = saldoc;
    }

    public Cuenta() {
    }

    public Cuenta(int cuenta, int saldoc) {
        this.cuenta = cuenta;
        this.saldoc = saldoc;
    }

    public Cuenta(int saldoc){this.saldoc = saldoc ;}
    public int sal (int saldoc){this.saldoc = saldoc;return this.saldoc;}
    public int reti (int retiro){this.saldoc =this.saldoc -retiro;return this.saldoc;}
    public int depos (int deposito){this.saldoc =this.saldoc +deposito;return saldoc;}

    @Override
    public String toString() {
        return "CuentaCliente[   " +
                "Saldo: " + cuenta +
                "Cuenta: " + saldoc +
                ']';
    }
}
