/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import Eslabon.Farmer;
import java.util.*;
/**
 *
 * @author ELKIN RAMIREZ
 */
public class Producido extends Producto{
    private int numLote;
    private ArrayList<Cultivado> matPrima;
    private ArrayList<Farmer> granjas;
    
    public Producido(String nombre, int numLote, ArrayList<Cultivado> matPrima, ArrayList<Farmer> granjas) {
        super(nombre);
        this.numLote = numLote;
        this.matPrima = matPrima;
        this.granjas = granjas;
    }

    public int getNumLote() {
        return numLote;
    }

    public ArrayList<Cultivado> getMatPrima() {
        return matPrima;
    }

    public ArrayList<Farmer> getGranjas() {
        return granjas;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public void setMatPrima(ArrayList<Cultivado> matPrima) {
        this.matPrima = matPrima;
    }

    public void setGranjas(ArrayList<Farmer> granjas) {
        this.granjas = granjas;
    }
    
}
