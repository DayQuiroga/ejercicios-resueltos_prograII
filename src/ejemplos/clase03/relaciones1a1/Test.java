
package ejemplos.clase03.relaciones1a1;

public class Test {

    public static void main(String[] args) {
        
        Domicilio dondeViveElVet = new Domicilio("Callao", 300, "Balvanera"); // Puedo tener al domicilio asociado a una variable para despues pasárselo al constructor de Persona
        
        Persona elVet = new Persona("John", "Dolittle", 1990, dondeViveElVet); // Creo una persona y le asigno el domicilio creado anteriormente
        
        // También pueda instanciar el domicilio en el momento en que lo necesita el constructor de Veterinaria
        Veterinaria v = new Veterinaria("PichichusFelices", new Domicilio("Gaona", 3345, "Flores"), elVet, 2000, 10);
        
        System.out.println(elVet); // Clase Persona no tiene sobrescrito el toString. Hacelo si querés ver su estado.
        System.out.println(dondeViveElVet); // Clase Domicilio tiene sobrescrito el toString
        // No puedo mostrar el domicilio de la veterinaria, su referencia solo la tiene ella, pues no la asocié a una variable en el main. La única forma de obtenerla aquí sería que la Veterinaria provea un getDomicilio.
        System.out.println(v); // Clase Veterinaria tiene sobrescrito el toString
    }

}
