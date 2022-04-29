package edu.ilp.jatoccsa.entity;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
   private String calle;
   private String ciudad;
   private  String estado;
   @Column(name = "codigo_postal",length = 50)
   private  String codigopostal;
   private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String estado, String codigopostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
