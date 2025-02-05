package cuentas;

public class Main {

    public static void main(String[] args) {
    CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
    float cantidad = 0;
    operativa_cuenta(cuenta1, cantidad);
}

    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
    double saldoActual;
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es " + saldoActual);

    try {
        cuenta1.retirar(cantidad);  // No modificamos este valor fijo
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }
    
    try {
        System.out.println("Ingreso en cuenta");
        cuenta1.ingresar(cantidad);  // No modificamos este valor fijo
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
}
}
