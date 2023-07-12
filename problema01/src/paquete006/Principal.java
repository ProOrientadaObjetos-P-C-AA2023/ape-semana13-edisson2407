/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
     double[][] datosAguaCasa = DatosAgua.datosCasas();
     double[][] datosAguaComercinate = DatosAgua.datosComerciales();
        System.out.println("Datos de Agua para Casa: ");
        imprimirDatos(datosAguaCasa);
        System.out.println("\nDatos de Agua Comerciante:");
        imprimirDatos(datosAguaComercinate);        
     double[][] datoLuz1 = DatosLuz.datosGeneral();
     double[][] datosLuz2 = DatosLuz.datosLoja();
        System.out.println("Datos de Luz 1: ");
        imprimirDatos(datoLuz1);
        System.out.println("Datos de Luz 2: ");
        imprimirDatos(datosLuz2);
     double[][] datosPropiedades = DatosPropiedades.datos();
        System.out.println("Datos para la Propiedad: ");
        imprimirDatos(datosPropiedades);
     double[][] datosTelefono = DatosTelefono.datos();
        System.out.println("Datos para el Telefon:");
        imprimirDatos(datosTelefono);        
    }
    public static void imprimirDatos(double[][] datos) {
         for (double[]fila : datos) {
             for (double dato : fila) {
                 System.out.println(dato + "");
             }
             System.out.println();
            
        }
    }
}
