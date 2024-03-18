package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name="direcciones_fisicas")
public class DireccionFisica {

    @EmbeddedId
    private DireccionFisicaPK pk;

    private String codigo_postal;

    public DireccionFisica(){;}

    public DireccionFisica(String direccion, String ciudad, String departamento, String codigo_postal) {
        this.pk = new DireccionFisicaPK(direccion,ciudad,departamento);
        this.codigo_postal = codigo_postal;
    }

    public DireccionFisicaPK getPk() {
        return pk;
    }

    public void setPk(DireccionFisicaPK pk) {
        this.pk = pk;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    

}
