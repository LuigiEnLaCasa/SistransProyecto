package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Producto;




public interface ProductoRepository extends JpaRepository<Producto, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO Productos (id_producto, fechaDeCreacion, id_cliente, id_oficina) VALUES ( bancAndes_seq.nextval , :id_producto,:fechaDeCreacion,:id_cliente,:id_oficina)", nativeQuery = true)
        void insertarProducto(@Param("id_producto") Integer id_producto, @Param("fechaDeCreacion") String fechaDeCreacion, @Param("id_cliente") String id_cliente, @Param("id_oficina") Integer id_oficina);

     
}