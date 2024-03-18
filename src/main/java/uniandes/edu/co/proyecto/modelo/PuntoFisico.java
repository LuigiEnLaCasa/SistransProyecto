package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "puntos_fisicos")
public class PuntoFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private PuntoDeAtencion id_puntoDeAtencion;

    @OneToOne
    @JoinColumn(name="id_oficina",referencedColumnName = "id")
    private Oficina id_oficina;

    private String tipo;

    public PuntoFisico(){;}
    public PuntoFisico(String tipo) {
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

    public Oficina getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(Oficina id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
