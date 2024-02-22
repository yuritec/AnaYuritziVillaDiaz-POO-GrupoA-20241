
package prueba.poo.a;

public class Rectangle {
    
 private double ancho;
 private double altura;

    public Rectangle(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
 
    public double calculateArea(){
      return this.ancho*this.altura;  
    }
    
    public double calculateperimeter(){
        return ((2*this.ancho)+(2*this.altura));
    }
    
}
