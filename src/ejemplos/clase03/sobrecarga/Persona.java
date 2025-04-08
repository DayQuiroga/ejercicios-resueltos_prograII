
package ejemplos.clase03.sobrecarga;

import java.time.Year;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    // Modelá la clase Persona, la cual posea como atributos nombre, apellido y año de nacimiento. 
    
    // Atributos    
    private String nombre;
    private String apellido;
    private int anioDeNacimiento;
    
    /* Constructor de la clase
        Debe llamarse igual que la clase
        No retorna nada (ni si quiera void)
        Se ejecuta por única vez en el momento del 'new'
    */

    public Persona(String nombre, String apellido, int anioDeNacimiento) {
        setNombre(nombre);
        setApellido(apellido);
        setAnioDeNacimiento(anioDeNacimiento);
        System.out.println("Nacio la persona " + this);
    }
    
    
    // Métodos
    // Devolver el nombre completo de la persona.
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    // Mostrar su estado en la consola.
    // Obtener su edad actual.
    public int edad() {
        // final int ANIO_ACTUAL = Year.now().getValue();
        return anioActual() - anioDeNacimiento;
    }
    
    private int anioActual() {
        return Year.now().getValue();
    }
    
    // Saber si es mayor que una edad dada.
    public boolean esMayorQue(int unaEdadDada) {
        // Reutilizo el método edad(), no vuelvo a hacer el calculo
        return edad() > unaEdadDada;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        if (anioDeNacimiento > 1900 && anioDeNacimiento < anioActual() ) {
            this.anioDeNacimiento = anioDeNacimiento;  
        }
    }      
    // Cambiar su nombre.
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    // Cambiar su apellido.
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Cambiar su nombre y su apellido.

    
}
