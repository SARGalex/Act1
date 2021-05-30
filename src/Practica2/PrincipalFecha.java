/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;
import Practica2.Fecha;
/**
 *
 * @author sarg
 */
public class PrincipalFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fec=new Fecha();
        do{
            fec.leer_fecha();
            if(fec.validar_fecha()!=0){
                break;
            }else{
                System.out.println("Formato de fecha erroneo");
            }
        }while(true);
        fec.imprimir_fecha_corta();
        fec.imprimir_fecha_larga();
        
    }
    
}
