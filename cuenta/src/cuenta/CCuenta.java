/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;


public class CCuenta {

    /**
     * ATRIBUTOS DE LA CLASE CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * METODOS
     */
    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros
     * @param nom nombre del usuario de la cuenta
     * @param cue numero de la cuenta del usuario
     * @param sal cantidad de dinero que hay en la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método que asigna un nombre a la cuenta
     * @param nom String que indica el nombre del usuario de la cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método por el que se obtiene el nombre del usuario de la Cuenta
     * @return devuelve el nombre del usuario de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que indica la cantidad de dinero que tiene la cuenta
     * @return decuelve el saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que ingresa dinero en la cuenta.
     * @param cantidad es la cantidad a ingresar en la cuenta
     * @throws Exception en el caso de que se inserte un número negativo, se lanza la excepción "Exception"
     */
    public void ingresar(double cantidad) throws Exception
    {   cantidad = 300; 
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que retira dinero de la cuenta.
     * @param cantidad
     * @throws Exception en el caso de que no haya suficiente saldo en la cuenta, se lanza la excepción "Exception"
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método para obtener los datos de la cuenta
     * @return cuenta devuelve los datos de la cuenta, que son: 
     * String nombre;
       String cuenta;
       double saldo;
       double tipoInterés;
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
     * Método por el que se obtiene el nombre del usuario de la Cuenta
     * @return nombre devuelve el nombre del usuario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método por el que se asigna el nombre del usuario de la Cuenta
     * @param nombre es el nombre del usuario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método por el que se devuelve el tipo de interés de la Cuenta
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método por el que se asigna el tipo de interés de la Cuenta
     * @param tipoInterés es el tipo de interés del usuario de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método por el que se devuelve el estado de la Cuenta
     * @return devuelve el estado de la cuenta del usuario
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Método por el que se le asignan valores a la Cuenta
     * @param cuenta es la cuenta del usuario con todos sus parémetros
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método por el que se devuelve la cantidad de dinero de la cuenta del usuario
     * @return devuelve la cantidad de dinero de la cuenta del usuario
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método por el que se asigna la cantidad de dinero que tiene la cuenta del usuario
     * @param saldo es la cantidad de dinero de la cuenta del usuario
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
