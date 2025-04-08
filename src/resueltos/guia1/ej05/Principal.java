
package resueltos.guia1.ej05;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion(2,3);
//        Fraccion f2 = new Fraccion(3,2);
//        Fraccion f3 = new Fraccion(8,2);
//        Fraccion f4 = new Fraccion(5,0);
//        Fraccion f5 = new Fraccion(3,7);
        
//        f1.mostrar();
//        System.out.println(f1.valorDecimal());
//        f1.sumarEntero(2);
//        f1.mostrar();
//        System.out.println(f1.valorDecimal());

        f1.sumarFraccion( new Fraccion(3,4) );
        f1.mostrar();
        System.out.println(f1.valorDecimal());
    }

}
