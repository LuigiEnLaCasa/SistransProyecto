package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.DireccionUsuario;





public interface DireccionUsuarioRepository extends JpaRepository<DireccionUsuario, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO direccion_fisica (direccion,ciudad,deptartamento,id_usuario) VALUES (bancAndes_seq.nextval, :direccion,:ciudad,:deptartamento,:id_usuario)", nativeQuery = true)
        void insertarDireccionFisica(@Param("direccion") String direccion, @Param("ciudad") String ciudad, @Param("deptartamento") String deptartamento, @Param("id_usuario") String id_usuario);
              
}