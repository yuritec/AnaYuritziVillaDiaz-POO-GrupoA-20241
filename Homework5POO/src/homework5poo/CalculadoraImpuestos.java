/*
 Realizar una clase llamada CalculadoraImpuestos que cuente con un método llamado calcularImpuestos.
Este método puede recibir hasta 4 parámetros, ingresos (int), porcentajeImpuestos (double), dividendos (double) y exención (double).
Si el usuario manda solo los ingresos, retornar ingresos + 0.15
Si el usuario manda ventas y porcentajeImpuesto retornar ventas * (porcentajeImpuesto / 100)
Si el usuario manda dividendos, porcentajeImpuesto y exención.
Calcular los impuestos = dividendos * (porcentajeImpuesto / 100)
Si los impuestos son mayores que la exención retornar los impuestos menos la exención, sino retornar 0.
 */
package homework5poo;

public class CalculadoraImpuestos {
 
   
    double calcularImpuestos(int ingresos, double porcentajeImpuesto,double dividendos, double exencion){
        if(porcentajeImpuesto==0 && dividendos==0 && exencion==0){
            return ingresos+0.15; 
        }
        else if (dividendos>=0 || exencion>=0){   
            return ingresos*(porcentajeImpuesto/100);
        }
         else {
            double impuestos = dividendos * (porcentajeImpuesto/ 100);
            if (impuestos > exencion) {
                return impuestos - exencion;
            } 
            else {
                return 0;
            }
        }
    }
    
    
    
    
    
    
    
    /*
    double calcularImpuestos(int ingresos){
       return ingresos+0.15; 
    }
    
    double calcularImpuestos(int ingresos, double porcentajeImpuesto){
        return ingresos*(porcentajeImpuesto/100);
    }
    
    double calcularImpuestos(int ingresos, double dividendos, double porcentajeImpuesto, double exencion){
        double impuestos=dividendos*(porcentajeImpuesto/100);
        if(impuestos>exencion){
        return impuestos-exencion;    
        }
        else{
            return 0;
        }
        
    }*/


        
          
}
