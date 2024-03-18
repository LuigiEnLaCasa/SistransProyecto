package uniandes.edu.co.proyecto.repositorio;
import java.sql.Date;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Operacion;




public interface OperacionRepository extends JpaRepository<Operacion, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO Operaciones (id_operacion,fecha,monto,saldo_final_salida,saldo_final_entrada,id_cuenta_llegada,producto_salida,punto_atencion) VALUES ( bancAndes_seq.nextval , :id_operacion,:fecha,:monto,:saldo_final_salida,:saldo_final_entrada,:id_cuenta_llegada,:producto_salida,:punto atencion)", nativeQuery = true)
        void insertarOperacion(@Param("id_Operacion") Integer id_Operacion, @Param("fecha") Date fecha, @Param("monto") Integer monto, @Param("saldo_final_salida") Integer saldo_final_salida, @Param("saldo_final_entrada") Integer saldo_final_entrada, @Param("id_cuenta_llegada") Integer id_cuenta_llegada, @Param("producto_salida") Integer producto_salida, @Param("punto_atencion") Integer punto_atencion);

     
}