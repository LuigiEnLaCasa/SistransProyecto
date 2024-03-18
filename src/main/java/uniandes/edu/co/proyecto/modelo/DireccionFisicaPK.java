package uniandes.edu.co.proyecto.modelo;
import java.io.Serializable;


import jakarta.persistence.Embeddable;


@Embeddable
public class DireccionFisicaPK implements Serializable {

    private String direccion;
    private String ciudad;
    private String departamento;

    public DireccionFisicaPK()
    {
        super();
    }

    public DireccionFisicaPK(String direccion, String ciudad, String departamento) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
