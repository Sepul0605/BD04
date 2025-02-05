package cuentas;
/**
 * Clase encargada de representar una cuenta bancaria con operaciones para ingresar y retirar dinero.
*/
public class CCuenta {
    
    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    
    /**
     * Número de la cuenta bancaria del titular.
     */
    private String cuenta;
    
    /**
     * Saldo del titular de la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta del titular.
     */
    private double tipoInterés;

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Eestablece el nombre del titular de la cuenta.
     * 
     * @param nombre  El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta del titular.
     * 
     * @return El número de la cuenta del titular.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta del titula.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el sado de la cuenta.
     * 
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interes de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta. 
     * 
     * @param tipoInterés Tipo de interes de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor de la clase CCuenta por defecto.
     */

    public CCuenta() {
    }
    
    /**
     * Constructor con parámetros para poder inicializar una cuenta bancaria.
     * 
     * @param nom nombre del titular de la cuenta bancaria. 
     * @param cue número de la cuenta del titular.
     * @param sal saldo de la cuenta bancaria.
     * @param tipo tipo de interés de la cuenta bancaria. 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }
    
    /**
     * Ingresa una cantidad de dinero a la cuenta superior a 0.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception  Si la cantidad es menor a 0.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
