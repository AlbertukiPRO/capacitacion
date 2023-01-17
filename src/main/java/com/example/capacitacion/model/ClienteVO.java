package com.example.capacitacion.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prueba")
@NamedQueries({
        @NamedQuery(name = "ClienteVO.findAll", query = "SELECT c FROM ClienteVO as c"),
        @NamedQuery(name = "ClienteVO.findByName", query = "SELECT c FROM ClienteVO as c where c.nombre LIKE CONCAT('%',:name,'%')")
})
public class ClienteVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String contrasena;
    @Column
    private Date fecha;
    @Column(name="img")
    private String imagen;

    public Integer getId() {
        return id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ClienteVO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", corre='" + correo + '\'' +
                ", cotrasena='" + contrasena + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
