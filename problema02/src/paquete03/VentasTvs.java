/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {
    private ArrayList<Televisor> televisores;
    
    public void establecerTelevisores(ArrayList<Televisor> t){
        televisores = t;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return televisores;
    }
    public double calcularPrecioTotal(){
        double total =0;
        for (Televisor tv : televisores) {
            total += tv.getPrecio();            
        }
        return total;
    }
    public String obtenerMarcasVendidas(){
        StringBuilder marcas = new StringBuilder();
        for (Televisor tv : televisores) {
            marcas.append(tv.getMarca()).append("\n");
        }
        return marcas.toString();
    }
    
}
