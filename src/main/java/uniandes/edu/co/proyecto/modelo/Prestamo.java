package uniandes.edu.co.proyecto.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name="fechaDeCreacion",referencedColumnName = "fechaDecreacion")
    private Producto id_producto;

    private String tipo;
    private Integer valor_total;
    private Integer saldo_pendiente;
    private Integer cuotas;
    private Integer cuotas_pendientes;
    private Integer valor_cuota;
    private Integer dia_corte;
    private Integer interes;

    public Prestamo(){;}

    public Prestamo(String tipo, Integer valor_total, Integer saldo_pendiente, Integer cuotas,
            Integer cuotas_pendientes, Integer valor_cuota, Integer dia_corte, Integer interes) {
        this.tipo = tipo;
        this.valor_total = valor_total;
        this.saldo_pendiente = saldo_pendiente;
        this.cuotas = cuotas;
        this.cuotas_pendientes = cuotas_pendientes;
        this.valor_cuota = valor_cuota;
        this.dia_corte = dia_corte;
        this.interes = interes;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Producto getProducto() {
        return id_producto;
    }
    public void setProducto(Producto producto) {
        this.id_producto = producto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getValor_total() {
        return valor_total;
    }
    public void setValor_total(Integer valor_total) {
        this.valor_total = valor_total;
    }
    public Integer getSaldo_pendiente() {
        return saldo_pendiente;
    }
    public void setSaldo_pendiente(Integer saldo_pendiente) {
        this.saldo_pendiente = saldo_pendiente;
    }
    public Integer getCuotas() {
        return cuotas;
    }
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }
    public Integer getCuotas_pendientes() {
        return cuotas_pendientes;
    }
    public void setCuotas_pendientes(Integer cuotas_pendientes) {
        this.cuotas_pendientes = cuotas_pendientes;
    }
    public Integer getValor_cuota() {
        return valor_cuota;
    }
    public void setValor_cuota(Integer valor_cuota) {
        this.valor_cuota = valor_cuota;
    }
    public Integer getDia_corte() {
        return dia_corte;
    }
    public void setDia_corte(Integer dia_corte) {
        this.dia_corte = dia_corte;
    }
    public Integer getInteres() {
        return interes;
    }
    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    

    
}