package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "operaciones")
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date fecha;
    private Integer monto;
    private Integer saldo_final_salida;
    private Integer saldo_final_entrada;

    @OneToOne
    @JoinColumn(name="id_cuenta_llegada",referencedColumnName = "id")
    private Cuenta id_cuenta;

    @OneToOne
    @JoinColumn(name="id_producto_salida",referencedColumnName = "id")
    private Producto id_producto;

    @OneToOne
    @JoinColumn(name="id_punto_de_atencion",referencedColumnName = "id")
    private PuntoDeAtencion id_puntoDeAtencion;

    public Operacion(){;}
    public Operacion(Date fecha, Integer monto, Integer saldo_final_salida, Integer saldo_final_entrada) {
        this.fecha = fecha;
        this.monto = monto;
        this.saldo_final_salida = saldo_final_salida;
        this.saldo_final_entrada = saldo_final_entrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getSaldo_final_salida() {
        return saldo_final_salida;
    }

    public void setSaldo_final_salida(Integer saldo_final_salida) {
        this.saldo_final_salida = saldo_final_salida;
    }

    public Integer getSaldo_final_entrada() {
        return saldo_final_entrada;
    }

    public void setSaldo_final_entrada(Integer saldo_final_entrada) {
        this.saldo_final_entrada = saldo_final_entrada;
    }

    public Cuenta getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(Cuenta id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public PuntoDeAtencion getId_puntoDeAtencion() {
        return id_puntoDeAtencion;
    }

    public void setId_puntoDeAtencion(PuntoDeAtencion id_puntoDeAtencion) {
        this.id_puntoDeAtencion = id_puntoDeAtencion;
    }

    
}
