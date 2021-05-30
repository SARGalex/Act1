/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.Scanner;

/**
 *
 * @author sarg
 */
public class Figura {
    private float largo, alto, ancho, volumen;
    private Scanner scan;

    public Figura() {
        scan=new Scanner(System.in);
    }
    private void Setlargo(){
        largo=scan.nextFloat();
    }
    private void Setalto(){
        alto=scan.nextFloat();
    }
    private void Setancho(){
        ancho=scan.nextFloat();
    }
    private void Setvolumen(){
        volumen=scan.nextFloat();
    }
    
    private float Getlargo(){
        return largo;
    }
    private float Getalto(){
        return alto;
    }
    private float Getancho(){
        return ancho;
    }
    private float Getvolumen(){
        return volumen;
    }
    
    public void leer_medida(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "==================================================================================");
        System.out.println("Introduzca el largo de la figura");
        Setlargo();
        System.out.println("==================================================================================");
        System.out.println("Introduzca el alto de la figura");
        Setalto();
        System.out.println("==================================================================================");
        System.out.println("Introduzca el ancho de la figura");
        Setancho();
        System.out.println("==================================================================================");
    }
    public void imprimir_medidas(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "==================================================================================");
        System.out.println("Las medidas son:");
        System.out.println("\t-->> largo: "+largo);
        System.out.println("\t-->> alto: "+alto);
        System.out.println("\t-->> ancho: "+ancho);
        System.out.println("==================================================================================");
    }
    public double obtener_volumen(){
        return (Getlargo()*Getalto()*Getancho());
    }
}

