/*
 Crear una clase Empleado y crear métodos llamados calcularSalario para poder calcular el salario de la persona.
El / Los métodos pueden recibir hasta 3 parámetros: sueldoBase, bonificación y horas extras.
Si el usuario manda por parámetro solo el sueldo, retornar solo eso.
Si el usuario manda por parámetro sueldo y bonificación, retornar sueldo + bonificación.
Si el usuario manda por parámetro sueldo, bonificación y horas extras, retornar sueldo + bonificación + (horas * 20)
Todos los métodos deben de llamarse igual por lo que tienes que usar la sobrecarga de métodos.
 */
package homework5poo;

public class Empleado {
    
    double calcularSalario(double sueldoBase){
        return sueldoBase;
    }
    
    double calcularSalario(double sueldoBase, double bonificaciones){
        return sueldoBase+bonificaciones;
    }
    
    double calcularSalario(double sueldoBase, double bonificaciones, double horasExtra){
        return sueldoBase+bonificaciones+(horasExtra*20);
    }
    
    
    
}
