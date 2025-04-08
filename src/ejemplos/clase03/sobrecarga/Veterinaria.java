
package ejemplos.clase03.sobrecarga;

public class Veterinaria {
    private String nombre;
    private String domicilio;
    private boolean tieneGuardiaNocturna;
    private double precioPorConsulta;
    private int cantConsultorios;

    public Veterinaria(String nombre, String domicilio, double precioPorConsulta, int cantConsultorios) {
        setNombre(nombre);
        setDomicilio(domicilio);
        setPrecioPorConsulta(precioPorConsulta);
        setCantConsultorios(cantConsultorios);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setPrecioPorConsulta(double precioPorConsulta) {
        this.precioPorConsulta = precioPorConsulta;
    }

    public void setCantConsultorios(int cantConsultorios) {
        this.cantConsultorios = cantConsultorios;
    }

    public int getCantConsultorios() {
        return cantConsultorios;
    }
    
    public void abrirConsultorio() {
        this.cantConsultorios++;
    }
    
    public void abrirConsultorio(int cuantos) {
        this.cantConsultorios += cuantos;
    }

    @Override
    public String toString() {
        return "Veterinaria{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", tieneGuardiaNocturna=" + tieneGuardiaNocturna + ", precioPorConsulta=" + precioPorConsulta + ", cantConsultorios=" + cantConsultorios + '}';
    }
    
    
    
}
