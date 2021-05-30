/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.util.Scanner;

/**
 *
 * @author sarg
 */
public class Fecha {
    private int dia, mes, anio;
    Scanner scan;
    
    public Fecha(){
        scan=new Scanner(System.in);
    }
    
    private void Setdia(){
        dia=scan.nextInt();
    }
    private void Setmes(){
        mes=scan.nextInt();
    }
    private void Setanio(){
        anio=scan.nextInt();
    }
    
    private int Getdia(){
        return dia;
    }
    private int Getmes(){
        return mes;
    }
    private int Getanio(){
        return anio;
    }
    
    public void leer_fecha( ){
        System.out.println("==================================================================================");
        System.out.println("Introduzca el dia de la fecha");
        Setdia();
        System.out.println("==================================================================================");
        System.out.println("Introduzca el mes de la fecha");
        Setmes();
        System.out.println("==================================================================================");
        System.out.println("Introduzca el anio de la fecha");
        Setanio();
        System.out.println("==================================================================================");
    }
    public int validar_fecha( ){
        boolean biciesto;
        int diaMax=28, Validado=1;
        biciesto=((Getanio()%4==0 && Getanio()%100!=0) || Getanio()%400==0);
        System.out.println(biciesto);
        if(Getmes()<=12 && Getmes()>=1){
            if(Getmes()==1 || Getmes()==3 || Getmes()==5 || Getmes()==7 || Getmes()==8 || Getmes()==10 || Getmes()==12){
                diaMax=31;
            }
            if(Getmes()==4 || Getmes()==6 || Getmes()==9 || Getmes()==11){
                diaMax=30;
            }
            if(Getmes()==2 && biciesto){
                diaMax=29;
            }else if(Getmes()==2){
                diaMax=28;
            }
            if(Getdia()>=1 && Getdia()<=diaMax){
            }else{
                Validado=0;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        }else{
            Validado=0;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        return Validado;
    }
    
    public void imprimir_fecha_corta( ){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("==================================================================================");
        System.out.println("La fecha es: "+Getdia()+"/"+Getmes()+"/"+Getanio());
    }
    public void imprimir_fecha_larga( ){
        System.out.print("La fecha es: "+Getdia()+" de ");
        switch(Getmes()){
            case 1:
                System.out.print("Enero");
                break;
            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
        }
        System.out.print(" de "+Getanio());
        System.out.println("\n==================================================================================");
    }
}
