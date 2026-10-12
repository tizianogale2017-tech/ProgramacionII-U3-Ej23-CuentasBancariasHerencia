package Ejercicio23_cuentasBancariasHerencia;

public class CajaAhorro extends CuentaBancaria {
    private double tasaInteresMensual;

    public CajaAhorro(String numeroCuenta, String titular, double saldoInicial, double tasaInteresMensual) {
        super(numeroCuenta, titular, saldoInicial);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public void aplicarIntereses() {
        saldo += saldo * tasaInteresMensual / 100;
    }
}
