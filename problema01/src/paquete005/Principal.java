/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;
import paquete001.Persona;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        BilleteraPagos pago = new BilleteraPagos();
        pago.persona =new Persona();
        pago.persona.nombre = "Jhon Whick ";
        pago.persona.apellido = "Lowstik";
        pago.mes = "Septiembre";
        pago.aguaCasa = new PagoAguaPotable();
        pago.aguaComercio = new PagoAguaPotable();
        pago.luzCasa = new PagoLuzElectrica();
        pago.luzComercio = new PagoLuzElectrica();
        pago.casa1 = new PagoPredial();
        pago.casa2 = new PagoPredial();
        pago.telefonoCasa = new PagoTelefonoConvencional();
        pago.telefonoFinca = new PagoTelefonoConvencional();
        
        pago.gastoPagos = pago.aguaCasa.calcularPago("residencial") + 
                pago.aguaComercio.calcularPago("comercial") + pago.luzCasa.calcularPago() +
                pago.luzComercio.calcularPago() + pago.casa1.calcularPago() + pago.casa2.calcularPago() +
                pago.telefonoCasa.calcularPago() + pago.telefonoFinca.calcularPago();
        
        String reporte = pago.generarReprote();
        System.out.println(reporte);
        
        
        
    }
}
