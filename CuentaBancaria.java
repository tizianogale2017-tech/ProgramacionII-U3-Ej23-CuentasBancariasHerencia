package Ejercicio23_cuentasBancariasHerencia;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false;
        }
        saldo += monto;
        return true;
    }

    public boolean extraer(double monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarEstado() {
        System.out.println(numeroCuenta + " - " + titular + " - saldo: " + saldo);
    }
}
