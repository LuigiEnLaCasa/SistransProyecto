package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class DireccionUsuarioPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario id_usuario;

    @ManyToOne
    @JoinColumn(name = "direccion", referencedColumnName = "direccion")
    @JoinColumn(name = "ciudad", referencedColumnName = "ciudad")
    @JoinColumn(name = "departamento", referencedColumnName = "departamento")
    private DireccionFisica id_DireccionFisica;

    public DireccionUsuarioPK()
    {
        super();
    }

    public DireccionUsuarioPK(Usuario id_usuario, DireccionFisica id_DireccionFisica) {
        super();
        this.id_usuario = id_usuario;
        this.id_DireccionFisica = id_DireccionFisica;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public DireccionFisica getId_DireccionFisica() {
        return id_DireccionFisica;
    }

    public void setId_DireccionFisica(DireccionFisica id_DireccionFisica) {
        this.id_DireccionFisica = id_DireccionFisica;
    }

    
    
}
