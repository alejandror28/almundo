/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaalmundo.callcenter;

/**
 *
 * @author User
 */
public class Empleado {
    private Boolean libre;
    private String perfil;
    private String nombre;

    public Empleado(Boolean libre, String perfil, String nombre){
        setLibre(libre);
        setPerfil(perfil);
        setNombre(nombre);
    }
    /**
     * @return the libre
     */
    public Boolean getLibre() {
        return libre;
    }

    /**
     * @param libre the libre to set
     */
    public void setLibre(Boolean libre) {
        this.libre = libre;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
