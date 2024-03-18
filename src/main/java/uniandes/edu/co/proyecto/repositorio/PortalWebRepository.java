package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.PortalWeb;




public interface PortalWebRepository extends JpaRepository<PortalWeb, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO PortalesWeb (id_PortalWeb	,tipo) VALUES ( bancAndes_seq.nextval , ,:id_PortalWeb,:tipo)", nativeQuery = true)
        void insertarPortalWeb(@Param("id_PortalWeb") Integer id_PortalWeb, @Param("tipo") String tipo);

     
}