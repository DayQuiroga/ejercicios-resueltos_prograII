
package ejemplos.clase03.sobrecarga;

public class Test {

    public static void main(String[] args) {
        Veterinaria v = new Veterinaria("PichichusFelices", "Calle Falsa 123", 2000, 10);
        
        System.out.println( v.getCantConsultorios() );
        v.abrirConsultorio(); // Suma uno solo
        System.out.println( v.getCantConsultorios() );
        v.abrirConsultorio(5); // Suma la cantidad que indica el argumento
        System.out.println( v.getCantConsultorios() );
        
        // El substring está sobrecargado en la clase String
        System.out.println("SACACORCHOS".substring(4, 6));
        System.out.println("SACACORCHOS".substring(4));
        
        System.out.println(v); // Como está sobrescrito el toString, muestra el estado del objeto
        System.out.println(v.hashCode()); // La identidad del objeto (como entero)
        System.out.println(Integer.toHexString(v.hashCode())); // La identidad del objeto (convertido a hexadecimal, como lo muestra el toString que viene por default)
    }

}
