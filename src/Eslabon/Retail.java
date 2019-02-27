package Eslabon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import Productos.*;
import java.io.*;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Retail extends Eslabon{
    private ArrayList<Vendido> productos;
    private ArrayList<DistributionCenter> distCenters;

    public Retail(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.productos = new ArrayList<>();
        this.distCenters = new ArrayList<>();
    }
    
    public float setPrecio(String nombre){
        if(nombre.equals("Pan")){
            return 5000;
        }else return 3000;
    }
    
    public void recibir(DistributionCenter distCenter){
        this.distCenters.add(distCenter);
        for(int i = 0; i < distCenter.getManufacturers().size(); i++){
            for(int j = 0; j < distCenter.getManufacturers().get(i).getProductos().size(); j++){
                this.productos.add(new Vendido(distCenter.getManufacturers().get(i).getProductos().get(j).getNombre(),
                        setPrecio(distCenter.getManufacturers().get(i).getProductos().get(j).getNombre()),j,distCenter));
            }
        }
        
    }
    
    public void venderProductos() throws IOException{
        ArrayList<FileWriter> trazas = new ArrayList<>();
        for(int i = 0; i < this.productos.size(); i++){
            trazas.add(new FileWriter("src/Trazas/Recibo_" + this.productos.get(i).getNombre() + ".txt"));
            trazas.get(i).write("Nombre.........................." + this.productos.get(i).getNombre() + '\n'
                              + "Precio.........................." + Float.toString(this.productos.get(i).getPrecio()) + '\n'
                              + "Codigo.........................." + Integer.toString(this.productos.get(i).getCodigo()) + '\n'
                              + "Granja.........................." + this.productos.get(i).getDistCenter().getManufacturers().get(i).getGranjas().get(i).getNombre() + '\n'
                              + "                                " + this.productos.get(i).getDistCenter().getManufacturers().get(i).getGranjas().get(i).getDescripcion() + '\n'
                              + "                                " + Float.toString(this.productos.get(i).getDistCenter().getManufacturers().get(i).getGranjas().get(i).getDireccion().getLatitud()) + "," + Float.toString(this.productos.get(i).getDistCenter().getManufacturers().get(i).getGranjas().get(i).getDireccion().getLongitud()) + '\n'
                              + "Manufacturera..................." + this.productos.get(i).getDistCenter().getManufacturers().get(i).getNombre() + '\n'
                              + "                                " + this.productos.get(i).getDistCenter().getManufacturers().get(i).getDescripcion() + '\n'
                              + "                                " + Float.toString(this.productos.get(i).getDistCenter().getManufacturers().get(i).getDireccion().getLatitud()) + "," + Float.toString(this.productos.get(i).getDistCenter().getManufacturers().get(i).getDireccion().getLongitud()) + '\n'
                              + "Centro de distribucion.........." + this.productos.get(i).getDistCenter().getNombre() + '\n'
                              + "                                " + this.productos.get(i).getDistCenter().getDescripcion() + '\n'
                              + "                                " + Float.toString(this.productos.get(i).getDistCenter().getDireccion().getLatitud()) + "," + Float.toString(this.productos.get(i).getDistCenter().getDireccion().getLongitud()) + '\n'
                              + "Establecimiento................." + this.nombre + '\n'
                              + "                                " + this.descripcion + '\n'
                              + "                                " + Float.toString(this.direccion.getLatitud()) + "," + Float.toString(this.direccion.getLongitud()));
            trazas.get(i).close();
        }
    }

    public ArrayList<Vendido> getProductos() {
        return productos;
    }

    public ArrayList<DistributionCenter> getDistCenters() {
        return distCenters;
    }
    
}
