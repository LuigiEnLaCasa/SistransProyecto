package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.GerenteGeneral;




public interface GerenteGeneralRepository extends JpaRepository<GerenteGeneral, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO empleados (login) VALUES ( bancAndes_seq.nextval , :login)", nativeQuery = true)
        void insertarGerente(@Param("login") String login);


       }