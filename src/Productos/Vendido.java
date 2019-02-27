/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import Eslabon.*;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Vendido extends Producto{
    private float precio;
    private int codigo;
    private DistributionCenter distCenter;

    public Vendido(String nombre, float precio, int codigo, DistributionCenter distCenter) {
        super(nombre);
        this.precio = precio;
        this.codigo = codigo;
        this.distCenter = distCenter;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public DistributionCenter getDistCenter() {
        return distCenter;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDistCenter(DistributionCenter distCenter) {
        this.distCenter = distCenter;
    }
    
}
