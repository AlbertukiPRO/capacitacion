package com.example.capacitacion.model;

import java.util.Date;
import java.util.Map;

public class ClienteDTO {

    private Integer idcuenta;
    private String correo;
    private String nombre;
    private String contrasena;
    private Date fecharegistro;
    private String imagen;

    public ClienteDTO(Integer idcuenta, String correo, String nombre, String contrasena, Date fecharegistro, String img) {
        this.idcuenta = idcuenta;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fecharegistro = fecharegistro;
        this.nombre = nombre;
        this.imagen = img;
    }

    public ClienteDTO(Integer idcuenta){
        this.idcuenta = idcuenta;
    }

    public ClienteDTO(Map<String, Object> datosform){
//        this.idcuenta = datosform.get("")
    }

    public Integer getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(Integer idcuenta) {
        this.idcuenta = idcuenta;
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

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "idcuenta=" + idcuenta +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", fecharegistro=" + fecharegistro +
                '}';
    }
}
