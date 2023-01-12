package com.example.capacitacion.model;

import java.util.Date;

public class ClienteDTO {

    private Integer idcuenta;
    private String correo;
    private String contrasena;
    private Date fecharegistro;

    public ClienteDTO(Integer idcuenta, String correo, String contrasena, Date fecharegistro) {
        this.idcuenta = idcuenta;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fecharegistro = fecharegistro;
    }

    public ClienteDTO(Integer idcuenta){
        this.idcuenta = idcuenta;
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
