/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resueltos.guia1.ej04;

/**
 *
 * @author karol
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Fecha date1 = new Fecha(21,8,2023);
        Fecha date2 = new Fecha(11,2,1986);
        Fecha date3 = new Fecha(4,12,1973);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        System.out.println("¿Es Navidad?: " + date2.esNavidad()); //1
        //1 es equivalente a 2.1+2.2
        Boolean natal = date2.esNavidad(); //2.1
        System.out.println("¿Es Navidad?: " + natal); //2.2
        
        date3.sumarMes();
        System.out.println(date3);
        
    }
    
}
