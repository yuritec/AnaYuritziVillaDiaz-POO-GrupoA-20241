
package homework5poo;

public class CalculadoraImpuestos2 {
    double calcularImpuestos2(int ingreso){
       return ingreso+0.15; 
    }
    
    double calcularImpuestos2(int ingreso, double porcentajeImpuesto){
        return ingreso*(porcentajeImpuesto/100);
    }
    
    double calcularImpuestos2(double dividendos, double porcentajeImpuesto, double exencion){
        double impuestos=dividendos*(porcentajeImpuesto/100);
        if(impuestos>exencion){
        return impuestos-exencion;    
        }
        else{
            return 0;
        }
        
    }
    
    
}
