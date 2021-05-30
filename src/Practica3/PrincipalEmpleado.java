/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;
import Practica3.Empleado;
/**
 *
 * @author sarg
 */
public class PrincipalEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado objEmpleado=new Empleado();
        objEmpleado.capturar_datos_trabajador();
        objEmpleado.imprimir_datos_trabajador();
    }
    
}
