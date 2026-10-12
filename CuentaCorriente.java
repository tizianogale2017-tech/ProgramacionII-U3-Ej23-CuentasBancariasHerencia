package Ejercicio23_cuentasBancariasHerencia;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, titular, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean extraer(double monto) {
        if (monto <= 0 || saldo - monto < -limiteSobregiro) {
            return false;
        }
        saldo -= monto;
        return true;
    }
}
