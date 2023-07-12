/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes;
    public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;
    
    public String generarReprote(){
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de pago para ").append(persona.nombre).append("").append(persona.apellido).append("\n");
        reporte.append("Mes: ").append(mes).append("\n");
        reporte.append("Gasto total en pagos: ").append(gastoPagos).append("\n\n");
        reporte.append("Detalles de los pagos:\n");
        reporte.append("Agua casa: ").append(aguaCasa.calcularPago("residencial")).append("\n");
        reporte.append("Agua Comercio: ").append(aguaComercio.calcularPago("comercial")).append("\n");
        reporte.append("Luz Casa: ").append(luzCasa.calcularPago()).append("\n");
        reporte.append("Luz Comercio: ").append(luzComercio.calcularPago()).append("\n");
        reporte.append("Predial Casa 1: ").append(casa1.calcularPago()).append("\n");
        reporte.append("Predial Casa 2: ").append(casa2.calcularPago()).append("\n");
        reporte.append("Telefono Casa: ").append(telefonoCasa.calcularPago()).append("\n");
        reporte.append("Telefono Finca: ").append(telefonoFinca.calcularPago()).append("\n");
        
        return reporte.toString();
    }
    
}
