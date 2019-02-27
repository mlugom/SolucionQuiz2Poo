package Eslabon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import Productos.*;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Manufacturer extends Eslabon{
    private ArrayList<Farmer> granjas;
    private ArrayList<Producido> productos;
    
    public Manufacturer(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.granjas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
   
    public void producir(String nombre, int numLote, ArrayList<Farmer> granjas, ArrayList<Cultivado> matPrima){
        this.productos.add(new Producido(nombre,numLote,matPrima,granjas));
        for(int i = 0; i < granjas.size(); i++){
            this.granjas.add(granjas.get(i));
        }  
    }

    public ArrayList<Farmer> getGranjas() {
        return granjas;
    }

    public ArrayList<Producido> getProductos() {
        return productos;
    }

    public void setGranjas(ArrayList<Farmer> granjas) {
        this.granjas = granjas;
    }

    public void setProductos(ArrayList<Producido> productos) {
        this.productos = productos;
    }
    
}
