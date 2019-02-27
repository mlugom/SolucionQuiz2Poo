package Eslabon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELKIN RAMIREZ
 */
public class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected Direccion direccion;

    public Eslabon(String nombre, String descripcion, Direccion direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}
