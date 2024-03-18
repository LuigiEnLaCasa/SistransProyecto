package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "puntosDeAtencion")
public class PuntoDeAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public PuntoDeAtencion(){;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
