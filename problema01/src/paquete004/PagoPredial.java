package paquete004;
/**
 *
 * @author reroes
 */
public class PagoPredial {
    public double calcularPago(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        double pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
        return pago;
    }
}
