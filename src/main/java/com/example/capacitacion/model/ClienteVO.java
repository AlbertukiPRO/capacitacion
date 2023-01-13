package com.example.capacitacion.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prueba")
@NamedQueries({
        @NamedQuery(name="ClienteVO.findAll", query = "select c from prueba c"),
        @NamedQuery(name = "ClienteVO.findById", query ="")
})
public class ClienteVO {

    @Id
    private Integer id;

    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String cotrasena;
    @Column
    private Date fecha;

    public Integer getId() {
        return id;
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

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
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
                ", cotrasena='" + cotrasena + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
