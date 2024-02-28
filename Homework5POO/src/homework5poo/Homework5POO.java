
package homework5poo;

import java.util.Scanner;

public class Homework5POO {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
      
       Rectangulo rectangulo=new Rectangulo();     
        System.out.println("Ingresa la base:"); 
        double base=leer.nextDouble();
        System.out.println("Ingresa la Altura:"); 
        double altura=leer.nextDouble();
        System.out.println("Area: "+rectangulo.area(base, altura));
        System.out.println("Perimetro: "+rectangulo.perimetro(base, altura)); 
        
       
        Empleado empleado=new Empleado();
        System.out.println("Ingrese sueldo base: ");
        double sueldoBase=leer.nextDouble();
        System.out.println("Ingrese bonificaciones: ");
        double bonificaciones=leer.nextDouble();
        System.out.println("Ingrese horasExtra: ");
        double horasExtras=leer.nextDouble();
        System.out.println("Salario total de la persona: "+empleado.calcularSalario(sueldoBase, bonificaciones, horasExtras));
       
        
        CalculadoraImpuestos calculo = new CalculadoraImpuestos();
        System.out.println("Ingrese Ingresos para calcular impuestos: ");  
        int ingresos=leer.nextInt();
        System.out.println("Ingrese Porcentaje de impuestos: ");
        double porcentajeImpuestos=leer.nextDouble();
        System.out.println("Ingrese Dividendos: ");
        double dividendos=leer.nextDouble();
        System.out.println("Ingrese Exenciones: ");
        double exenciones=leer.nextDouble();
        System.out.println("El ingreso es de: "+calculo.calcularImpuestos(ingresos, dividendos, porcentajeImpuestos, exenciones));
        
        
       
                
                
    }
    
}
