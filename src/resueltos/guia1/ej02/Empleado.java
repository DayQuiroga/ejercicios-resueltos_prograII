package resueltos.guia1.ej02;

public class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private double salarioBase;
    private EstadoCivil estadocivil;
    private int hijos;

    public Empleado(int DNI, String nombre, String apellido, double salariobase, EstadoCivil estadocivil, int hijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salariobase;
        this.estadocivil = estadocivil;
        this.hijos = hijos;
    }

    public double obtenerSalarioFinal() {        
        double salario = salarioBase + plusPorHijos();
        return dctoPorEstadoCivil(salario);
    }
    
    private double plusPorHijos() {
        final double PORC_PLUS_X_HIJO = 0.03;
        final double PORC_TOPE_INCR = 0.1;        
        double porc = PORC_PLUS_X_HIJO * hijos;
        if (porc > PORC_TOPE_INCR){
            porc = PORC_TOPE_INCR;
        } 
        return salarioBase * porc;
    }

    private double dctoPorEstadoCivil(double salario) {
        final double DCTO_POR_SOLTERIA = 0.04;  
        double dcto = estadocivil != EstadoCivil.SOLTERO ? 0 : DCTO_POR_SOLTERIA;
        return salario - salario * dcto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadocivil=" + estadocivil + ", hijos=" + hijos + '}';
    }

    
    
}
