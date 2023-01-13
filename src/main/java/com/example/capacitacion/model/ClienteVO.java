package com.example.capacitacion.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prueba")
public class ClienteVO {

    @Id
    private Integer id;

    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String contrasena;
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
