package Ejercicio23_cuentasBancariasHerencia;

public class Main {
    public static void main(String[] args) {
        CajaAhorro ahorro = new CajaAhorro("CA-001", "Julia Soto", 100000.0, 3.0);
        CuentaCorriente corriente = new CuentaCorriente("CC-001", "Julia Soto", 20000.0, 50000.0);

        ahorro.aplicarIntereses();
        ahorro.mostrarEstado();
        System.out.println("Caja de ahorro: extraer 150000 -> " + (ahorro.extraer(150000.0) ? "OK" : "RECHAZADO"));

        System.out.println("Cuenta corriente: extraer 60000 (usa sobregiro) -> " + (corriente.extraer(60000.0) ? "OK" : "RECHAZADO"));
        corriente.mostrarEstado();
        System.out.println("Cuenta corriente: extraer 20000 (supera el sobregiro) -> " + (corriente.extraer(20000.0) ? "OK" : "RECHAZADO"));
        corriente.mostrarEstado();
    }
}
