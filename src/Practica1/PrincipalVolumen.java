/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;
import Practica1.Figura;
/**
 *
 * @author sarg
 */
public class PrincipalVolumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura objFigura1=new Figura();
        objFigura1.leer_medida();
        objFigura1.imprimir_medidas();
        System.out.println("-->> El Volumen es: "+objFigura1.obtener_volumen());
    }
    
}
