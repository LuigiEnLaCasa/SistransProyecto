package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO empleados (login, tipo, oficina) VALUES ( bancAndes_seq.nextval , :login,:tipo, :oficina)", nativeQuery = true)
        void insertarEmpleado(@Param("login") String login, @Param("tipo") String tipo, @Param("oficina") String oficina);


       
}