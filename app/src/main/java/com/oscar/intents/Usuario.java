package com.oscar.intents;

import java.io.Serializable;

/**
 * Created by oemy9 on 29/10/2017.
 */

public class Usuario implements Serializable {

    private String nombre = "";
    private String telefononumber = "";
    private String email = "";
    private String hobi = "";
    private String lugartrabajo = "";

    public Usuario(String nombre, String telefononumber, String email, String hobi, String lugartrabajo) {
        this.nombre = nombre;
        this.telefononumber = telefononumber;
        this.email = email;
        this.hobi = hobi;
        this.lugartrabajo = lugartrabajo;
    }

    public Usuario()
    {}

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", telefononumber='" + telefononumber + '\'' +
                ", email='" + email + '\'' +
                ", hobi='" + hobi + '\'' +
                ", lugartrabajo='" + lugartrabajo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefononumber() {
        return telefononumber;
    }

    public void setTelefononumber(String telefononumber) {
        this.telefononumber = telefononumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getLugartrabajo() {
        return lugartrabajo;
    }

    public void setLugartrabajo(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }






}
