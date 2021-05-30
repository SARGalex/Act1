/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.util.Scanner;

/**
 *
 * @author sarg
 */
public class Empleado {
    String nombre, puesto;
    double pagoHora, horasTrabajadasMes, salarioMensual;
    Scanner scan;
    
    public Empleado(){
        scan=new Scanner(System.in);
    }
    
    private void Setnombre(){
        nombre=scan.next();
    }
    private void Setpuesto(){
        puesto=scan.next();
    }
    private void SetpagoHora(){
        pagoHora=scan.nextDouble();
    }
    private void SethorasTrabajadasMes(){
        horasTrabajadasMes=scan.nextDouble();
    }
    private void SetsalarioMensual(double salario){
        salarioMensual=salario;
    }
    
    private String Getnombre(){
        return nombre;
    }
    private String Getpuesto(){
        return puesto;
    }
    private Double GetpagoHora(){
        return pagoHora;
    }
    private Double GethorasTrabajadasMes(){
        return horasTrabajadasMes;
    }
    private Double GetsalarioMensual(){
        return salarioMensual;
    }
    
    public void capturar_datos_trabajador(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "==================================================================================");
        System.out.println("Ingrese el nombre del empleado");
        Setnombre();
        System.out.println("\nIngrese el puesto del empleado");
        Setpuesto();
        System.out.println("\nIngrese el pago por hora del empleado");
        SetpagoHora();
        System.out.println("\nIngrese la cantidad de horas trabajadas en el mes por el empleado");
        SethorasTrabajadasMes();
        System.out.println("==================================================================================");
    }
    
    public double obtener_salario_mensual(){
        SetsalarioMensual(GetpagoHora()*GethorasTrabajadasMes());
        if(GethorasTrabajadasMes()>=100 && GethorasTrabajadasMes()<=200){
            SetsalarioMensual(GetsalarioMensual()*1.10);
        }
        if(GethorasTrabajadasMes()>=201 && GethorasTrabajadasMes()<=220){
            SetsalarioMensual(GetsalarioMensual()*1.20);
        }
        if(GethorasTrabajadasMes()>=221 && GethorasTrabajadasMes()<=230){
            SetsalarioMensual(GetsalarioMensual()*1.30);
        }
        SetsalarioMensual(GetsalarioMensual()*0.84);
        return GetsalarioMensual();
    }
    
    public void imprimir_datos_trabajador(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "==================================================================================");
        System.out.println("Nombre: "+Getnombre());
        System.out.println("Puesto: "+Getpuesto());
        System.out.println("Pago por hora: "+GetpagoHora());
        System.out.println("Horas trabajadas: "+GethorasTrabajadasMes());
        System.out.println("Salario: "+obtener_salario_mensual());
        System.out.println("==================================================================================");
    }
}
