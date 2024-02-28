/*
 Crear una clase llamada Rectangulo la cual pueda calcular el área y el perimetro. 
Debes de considerar que el usuario puede ingresarte enteros o doubles, por lo que debes utilizar la sobrecarga 
de métodos para que existan funciones con el mismo nombre pero realicen una función diferente.
 */
package homework5poo;

public class Rectangulo {
    
    int area(int base, int altura){
     return base*altura;
    }
   
    double area(double base, double altura){
      return base*altura;
    }
    
    int perimetro(int base2, int altura2){
     return ((2*base2)+(2*altura2));
    }

    double perimetro(double base2, double altura2){
      return ((2*base2)+(2*altura2));
    }
  
  
  
}
