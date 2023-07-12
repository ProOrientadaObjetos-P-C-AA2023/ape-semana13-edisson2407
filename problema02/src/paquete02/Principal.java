/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Televisor t1 = new Televisor();
        t1.setMarca("LG-14 pulgadas");
        t1.setPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.setMarca("SAMSUMG-21 pulgadas");
        t2.setPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.setMarca("RIVIERA-29 pulgadas");
        t3.setPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        VentasTvs ventas = new VentasTvs();
        ventas.establecerTelevisores(tvs);
        System.out.println("-------------------------------");
        System.out.printf("%.2f\n", ventas.calcularPrecioTotal());
        System.out.println(ventas.obtenerMarcasVendidas());
        // System.out.printf("%s\n", t1.listaMarcasVendidas(tvs));

    }
}
