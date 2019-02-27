package Eslabon;
import Productos.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELKIN RAMIREZ
 */
public class DistributionCenter extends Eslabon{
    private ArrayList<Manufacturer> manufacturers;

    public DistributionCenter(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.manufacturers = new ArrayList<>();
    }
    
    public void recibirProductos(Manufacturer manufacturer){
        this.manufacturers.add(manufacturer);
    }

    public ArrayList<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(ArrayList<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }
    
}
