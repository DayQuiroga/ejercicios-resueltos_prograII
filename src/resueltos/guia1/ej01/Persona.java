
package resueltos.guia1.ej01;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    // Esto es un constructor

    public Persona(String nombre, String apellido, int anioNacimiento) {
        setNombre(nombre);
        setApellido(apellido);
        setAnioNacimiento(anioNacimiento);
    }
    
    public Persona(int anioNacimiento) {
        this("", "", anioNacimiento);
    }
        
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado () {
        System.out.println( toString() );
    }
    
    public int getEdad() {
        // Hubo que importar la clase 'LocalDate'
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > 0) {
            this.anioNacimiento = anioNacimiento;
        }        
    }      
    
    public boolean esMayorQue(int unaEdad) {
        return getEdad() >= unaEdad;
    }
    
    public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido) {
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);        
    }

    public void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3) {
           this.nombre = nombre; 
        }
    }

    public void setApellido(String apellido) {
        if(apellido != null && apellido.length() >= 2) {
           this.apellido = apellido; 
        }
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", anioNacimiento=" + anioNacimiento + '}';
    }
    
    
    
}
