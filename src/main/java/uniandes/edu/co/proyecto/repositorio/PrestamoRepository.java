package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Prestamo;




public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO Prestamos (id_prestamo,,tipo,valor_total,saldo_pendiente	cuotas,cuotas_pendientes,valor_cuota,dia_corte,interes) VALUES ( bancAndes_seq.nextval , :id_Prestamo,:tipo,:valor_total,:saldo_pendiente	,:cuotas,:cuotas_pendientes,:valor_cuota,:dia_corte,:interes)", nativeQuery = true)
        void insertarPrestamo(@Param("id_Prestamo") Integer id_Prestamo, @Param("tipo") String tipo, @Param("valor_total") Integer valor_total, @Param("saldo_pendiente") Integer saldo_pendiente, @Param("cuotas") Integer cuotas, @Param("cuotas_pendientes") Integer cuotas_pendientes, @Param("valor_cuota") Integer valor_cuota, @Param("dia_corte") Integer dia_corte, @Param("interes") Integer interes);

     
}