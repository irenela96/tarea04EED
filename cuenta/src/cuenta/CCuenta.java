/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class CCuenta {

    /**
     * Metodo que pide el número de cuenta del usuario
     * @return cuenta número de cuenta del usuario
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo que asigna el número de cuenta del usuario
     * @param cuenta número de cuenta del usuario
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo de la cuenta del cliente
     * @return saldo la cantidad de dinero que tiene el usuario en su cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que asigna el saldo de la cuenta del cliente
     * @param saldo la cantidad de dinero que tiene el usuario en su cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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
     * @param cue número de la cuenta del usuario
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
        return getSaldo();
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
        setSaldo(getSaldo() + cantidad);
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
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodo que pide el número de cuenta del usuario
     * @return cuenta número de cuenta del usuario
     */
    public String obtenerCuenta()
    {
        return getCuenta();
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
    
}
