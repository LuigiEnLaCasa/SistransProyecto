package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "portales_Web")
public class PortalWeb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private PuntoDeAtencion id_puntoDeAtencion;

    private String tipo;

    public PortalWeb(){;}

    public PortalWeb(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PuntoDeAtencion getId_puntoDeAtencion() {
        return id_puntoDeAtencion;
    }

    public void setId_puntoDeAtencion(PuntoDeAtencion id_puntoDeAtencion) {
        this.id_puntoDeAtencion = id_puntoDeAtencion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
