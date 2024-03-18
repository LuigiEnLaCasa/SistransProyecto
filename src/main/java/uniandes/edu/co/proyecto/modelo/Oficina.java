package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "oficinas")
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer num_atencion_posibles;
    @ManyToOne
    @JoinColumn(name = "direccion", referencedColumnName = "direccion")
    @JoinColumn(name = "ciudad", referencedColumnName = "ciudad")
    @JoinColumn(name = "departamento", referencedColumnName = "departamento")
    private DireccionFisica id_DireccionFisica;

    public Oficina(){;}
    public Oficina(String nombre, Integer num_atencion_posibles) {
        this.nombre = nombre;
        this.num_atencion_posibles = num_atencion_posibles;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNum_atencion_posibles() {
        return num_atencion_posibles;
    }
    public void setNum_atencion_posibles(Integer num_atencion_posibles) {
        this.num_atencion_posibles = num_atencion_posibles;
    }
    public DireccionFisica getId_DireccionFisica() {
        return id_DireccionFisica;
    }
    public void setId_DireccionFisica(DireccionFisica id_DireccionFisica) {
        this.id_DireccionFisica = id_DireccionFisica;
    }

    

}
