
package resueltos.guia1.ej05;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = 1; // Sino por default sería cero, que resulta una indeterminación.
        setDenominador(denominador);
    }

    private void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        }        
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }  
    
    public double valorDecimal() {
        return numerador / (double) denominador;
    }  
    
    public void sumarEntero (int entero) {
        numerador = numerador + entero * denominador;
    }
    
    public void sumarFraccion(Fraccion otra) {
        this.numerador = this.numerador * otra.getDenominador()
                       + otra.getNumerador() * this.denominador;
        this.denominador = this.denominador * otra.getDenominador();
    }
    
    public void simplificar() {
        /* A REALIZAR POR L@S ALUMN@S */
    }
    
    public TipoFraccion getTipo() {
        TipoFraccion tipo;
        if (denominador % numerador == 0) {
            tipo = TipoFraccion.APARENTE;
        } else if(numerador > denominador) {
            tipo = TipoFraccion.IMPROPIA;
        } else {
            tipo = TipoFraccion.PROPIA;
        }
        return tipo;
    }    
}
