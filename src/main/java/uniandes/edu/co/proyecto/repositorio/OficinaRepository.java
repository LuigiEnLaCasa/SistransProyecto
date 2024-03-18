package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Oficina;




public interface OficinaRepository extends JpaRepository<Oficina, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO Oficinas (id_Oficina, nombre, num_atencion_posibles, direccion, ciudad, deptartamento) VALUES ( bancAndes_seq.nextval , id_oficina,:nombre,:num_atencion_posibles,:direccion,:ciudad,:deptartamento)", nativeQuery = true)
        void insertarOficina(@Param("id_Oficina") Integer id_Oficina, @Param("nombre") String nombre, @Param("num_atencion_posibles") Integer num_atencion_posibles, @Param("direccion") String direccion, @Param("ciudad") String ciudad, @Param("deptartamento") String deptartamento);

     
}