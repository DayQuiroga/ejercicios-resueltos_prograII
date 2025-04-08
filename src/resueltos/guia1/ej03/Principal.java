/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resueltos.guia1.ej03;

/**
 *
 * @author karol
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("corriente");
        CuentaBancaria cuenta2 = new CuentaBancaria("ahorro");
        
        //ingreso el CBU:
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();
        
        
//        cuenta1.depositar(3570);
//        
//        cuenta1.mostrarDatos();
//        
//        cuenta1.extraer(370);
//        
//        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
//        
//        cuenta1.extraer(5000);
//        
//        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
//        cuenta1.depositar(860);
//        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
//        cuenta1.getUltimosTresCBU();
//        System.out.println("Tipo de cuenta: " + cuenta1.getTipoCuenta());
//        
//        cuenta2.mostrarDatos();
//        cuenta2.depositar(1650);
//        cuenta2.mostrarDatos();
//        
//        cuenta2.extraer(1800);
//        cuenta2.mostrarDatos();
    }
    
}
