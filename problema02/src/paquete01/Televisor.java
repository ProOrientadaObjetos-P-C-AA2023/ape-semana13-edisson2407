/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Televisor {

    private String marca;
    private double precio;
    
    public void setMarca(String m){
        marca = m;
    }
    
    public void setPrecio(double m){
        precio = m;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getPrecio(){
        return precio;
    }   
    
    @Override
    public String toString(){
        return String.format("TV:%s\n%s\n",
                getMarca(),
                getPrecio());
    }
    
    
}
