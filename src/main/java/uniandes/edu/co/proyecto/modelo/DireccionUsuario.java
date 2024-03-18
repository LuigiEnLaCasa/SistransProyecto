package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones-usuarios")

public class DireccionUsuario {

    @EmbeddedId
    private DireccionUsuarioPK pk;

    public DireccionUsuario(){;}

    public DireccionUsuario(Usuario id_Usuario, DireccionFisica id_DireccionFisica) {
        super();
        this.pk = new DireccionUsuarioPK(id_Usuario,id_DireccionFisica);
    }

    public DireccionUsuarioPK getPk() {
        return pk;
    }

    public void setPk(DireccionUsuarioPK pk) {
        this.pk = pk;
    }


}
