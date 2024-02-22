
package calculatorpoo;

public class CalculatorPOO {

    public static void main(String[] args) {
    
        calculadora calculadora= new calculadora(8,9);
        System.out.println(calculadora.suma());
        System.out.println(String.format("\nSuma: %f", calculadora.suma()));
        System.out.println(String.format("\nResta: %f", calculadora.resta()));
        System.out.println(String.format("\nMultiplicacion: %f", calculadora.multiplicacion()));
        System.out.printf("\nDivision: %f", calculadora.division());
        
        
    }
    
}
