/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.*;
import Eslabon.*;
import java.io.IOException;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Farmer> granjas = new ArrayList<>();
        Farmer granja = new Farmer("Granja 1","Granja lechera", new Direccion(477,350));
        granjas.add(granja);
        
        ArrayList<Manufacturer> manufactureras = new ArrayList<>();
        Manufacturer manufacturer = new Manufacturer("Manufacturera 1", "Manufacturera de alimentos de calidad", new Direccion(250,250));
        manufactureras.add(manufacturer);
        
        ArrayList<DistributionCenter> distCenters = new ArrayList<>();
        DistributionCenter distCenter = new DistributionCenter("Centro de distribucion 1", "Centro de distribucion de mercancia para el mercado", new Direccion(123,756));
        distCenters.add(distCenter);
        
        ArrayList<Retail> retails = new ArrayList<>();
        Retail establecimiento = new Retail("Establecimiento 1", "Mercado de la canasta familiar a los mejores precios", new Direccion(345,578));
        retails.add(establecimiento);
        
        granjas.get(0).cultivarProducto("Leche");
        granjas.get(0).cultivarProducto("Harina");
        manufactureras.get(0).producir("Pan", 0, granjas, granjas.get(0).getProductos());
        distCenters.get(0).recibirProductos(manufactureras.get(0));
        retails.get(0).recibir(distCenters.get(0));
        retails.get(0).venderProductos();
    }
}
