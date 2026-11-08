public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo no válido");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
 class PruebaCuentaBancaria {
     static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 500000, "Ahorros");

        System.out.println("Tipo: " + cuenta.tipoCuenta);

        cuenta.setSaldo(800000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        cuenta.mostrarDetalles();

        // System.out.println(cuenta.numeroCuenta);
    }
}

