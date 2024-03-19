package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Cuenta;




public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO Cuentas (id_cuenta,tipo,saldo,estado) VALUES ( bancAndes_seq.nextval , :id_Cuenta,:tipo,:saldo,:estado)", nativeQuery = true)
        void insertarCuenta(@Param("id_Cuenta") Integer id_Cuenta, @Param("tipo") String tipo, @Param("saldo") Integer saldo, @Param("estado") String estado);

     
        @Modifying
        @Transactional
        @Query(value = "SELECT usuario.cuenta"  + //
        "FROM cuentas where usuarios.login = cuentas.login", nativeQuery = true)
        Cuenta darInformacionCuenta(@Param("login") String login);


}