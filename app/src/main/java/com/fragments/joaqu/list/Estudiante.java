package com.fragments.joaqu.list;

/**
 * Created by joaqu on 3/4/2017.
 */

public class Estudiante {
    String cedula;

    public Estudiante(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    String Nombre;
    String Apellido;

}
