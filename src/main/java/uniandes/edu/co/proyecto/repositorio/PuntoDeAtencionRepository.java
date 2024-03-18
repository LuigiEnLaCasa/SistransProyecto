package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.PuntoDeAtencion;




public interface PuntoDeAtencionRepository extends JpaRepository<PuntoDeAtencion, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO PuntosAtencion (id) VALUES ( bancAndes_seq.nextval , :id)", nativeQuery = true)
        void insertarPuntoDeAtencion(@Param("id") Integer id);

     
}