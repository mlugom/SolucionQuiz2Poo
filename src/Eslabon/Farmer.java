package Eslabon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Productos.*;
import java.util.*;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Farmer extends Eslabon{
    private ArrayList<Cultivado> productos;
    
  
    public Farmer(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.productos = new ArrayList<>();
    }
    
    public void cultivarProducto(String nombre){
        this.productos.add(new Cultivado(nombre));
    }

    public ArrayList<Cultivado> getProductos() {
        return productos;
    }
    
}
