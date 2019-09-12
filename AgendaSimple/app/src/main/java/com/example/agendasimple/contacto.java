package com.example.agendasimple;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class contacto implements Serializable {

    private String Usuario;
    private String Email;
    private String Twitter;
    private String Telefono;
    private String Fecha;


    public contacto(String usuario, String email, String twitter, String telefono, String fecha) {
        Usuario = usuario;
        Email = email;
        Twitter = twitter;
        Telefono = telefono;
        Fecha = fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String regresa(){
        return this.getUsuario()+"\n"+this.Twitter;
    }

}
