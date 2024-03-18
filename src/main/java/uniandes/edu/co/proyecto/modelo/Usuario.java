package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String login;

    private String clave;

    private String documento_identidad;

    private String tipo_documento;

    private String nombre;
    private String nacionalidad;
    private String direccion_electronica;
    private String telefono;
    private String ciudad;
    private String departamento;

    
    

    public Usuario(){;}

    public Usuario(String login, String clave, String documento_identidad, String tipo_documento, String nombre,
        String nacionalidad, String direccion_electronica, String telefono, String ciudad, String departamento) {
    this.login = login;
    this.clave = clave;
    this.documento_identidad = documento_identidad;
    this.tipo_documento = tipo_documento;
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
    this.direccion_electronica = direccion_electronica;
    this.telefono = telefono;
    this.ciudad = ciudad;
    this.departamento = departamento;
    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion_electronica() {
        return direccion_electronica;
    }

    public void setDireccion_electronica(String direccion_electronica) {
        this.direccion_electronica = direccion_electronica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    
}


