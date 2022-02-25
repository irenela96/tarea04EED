/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;


public class Main {

    /**
     * Método main en el cual se ingresa la cuenta del usuario con sus respectivos valores
     * se muestra el saldo actual de la cuenta del usuario y
     * se realiza la operación de "operativa_cuenta" de la cuenta para ingresar y retirar
     * cierta cantida de dinero de la cuenta
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 2300.0f);
    }

    /**
     * Método en el cual se realiza el ingreso y la retirada de una cantidad en una cuenta
     * @param cuenta1 especifica la cuenta de la que se va a ingresar y retirar dicha cantidad
     * @param cantidad especifica la cantidad a ingresar y retirar
     * En el caso de que se de un fallo al retirar, se lanzará un mensaje de "Fallo al retirar" y
     * en el caso de que se de un fallo al ingresar, se lanzará un mensaje de "Fallo al ingresar"
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            System.out.println("Retirada de dinero en cuenta");
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
