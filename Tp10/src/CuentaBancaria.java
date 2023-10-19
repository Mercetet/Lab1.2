public class CuentaBancaria {
    private double saldo;
    private int nro_cuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo, int nro_cuenta) {
        this.saldo = saldo;
        this.nro_cuenta = nro_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(int nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", nro_cuenta=" + nro_cuenta +
                '}';
    }


}

