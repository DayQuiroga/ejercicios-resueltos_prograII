package resueltos.guia1.ej02;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(41823445, "Juan", "Dominguez", 10000, EstadoCivil.CASADO, 4);

        System.out.println(empleado);
        System.out.println("Salario Final: " + empleado.obtenerSalarioFinal());
    }
}
