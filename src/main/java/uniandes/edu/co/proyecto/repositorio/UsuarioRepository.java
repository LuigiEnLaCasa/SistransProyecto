package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Usuario;




public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO usuarios (login, clave, documento_identidad, tipo_documento, nombre, nacionalidad, direccion_electronica, telefono) VALUES ( bancAndes_seq.nextval , :login,:clave, :documento_identidad,:tipo_documento,:nombre, :nacionalidad, :direccion_electronica, :telefono)", nativeQuery = true)
        void insertarUsuario(@Param("login") String login,@Param("clave") String clave, @Param("documento_identidad") String documento_identidad, @Param("tipo_documento") String tipo_documento, @Param("nombre") String nombre,
        @Param("nacionalidad") String nacionalidad, @Param("telefono") Integer telefono, @Param("direccion_electronica") String direccion_electronica);

       
}