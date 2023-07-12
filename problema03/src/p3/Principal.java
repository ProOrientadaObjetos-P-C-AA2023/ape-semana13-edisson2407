/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        tipos.setMatriculaCampamento(mcamp);
        tipos.setMatriculaColegio(mcolegio);
        tipos.setPromedioTarifa();
        System.out.printf("%.2f\n",tipos.getPromedioTarifa());
        
    }
}
