
package ejemplos.clase03.relaciones1a1;

public class Veterinaria {
    private String nombre;
    private Domicilio domicilio;
    private Persona veterinario;
    private boolean tieneGuardiaNocturna;
    private double precioPorConsulta;
    private int cantConsultorios;

    public Veterinaria(String nombre, Domicilio domicilio, Persona veterinario, double precioPorConsulta, int cantConsultorios) {
        setNombre(nombre);
        setDomicilio(domicilio);
        setVeterinario(veterinario);
        setPrecioPorConsulta(precioPorConsulta);
        setCantConsultorios(cantConsultorios);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setPrecioPorConsulta(double precioPorConsulta) {
        this.precioPorConsulta = precioPorConsulta;
    }

    public void setCantConsultorios(int cantConsultorios) {
        this.cantConsultorios = cantConsultorios;
    }

    public void setVeterinario(Persona veterinario) {
        this.veterinario = veterinario;
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
        return "Veterinaria{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", veterinario=" + veterinario + ", tieneGuardiaNocturna=" + tieneGuardiaNocturna + ", precioPorConsulta=" + precioPorConsulta + ", cantConsultorios=" + cantConsultorios + '}';
    }
    
    
}
