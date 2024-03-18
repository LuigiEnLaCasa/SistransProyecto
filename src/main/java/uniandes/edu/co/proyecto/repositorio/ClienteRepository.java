package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

import uniandes.edu.co.proyecto.modelo.Cliente;




public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO clientes (login)VALUES ( bancAndes_seq.nextval , :login)", nativeQuery = true)
        void insertarCliente(@Param("login") String login);

        @Query(value = "SELECT usuario.tipo_documento"  + //
        "FROM usuarios INNER JOIN cliente ON usuarios.login = clientes.login WHERE  = :login", nativeQuery = true)
        Cliente darInformacioncliente(@Param("login") String login);

       
}