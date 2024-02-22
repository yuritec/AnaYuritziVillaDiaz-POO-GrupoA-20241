
package calculatorpoo;

public class calculadora {
    
    int numeroUno;
    int numeroDos;
   

    public calculadora(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    double suma(){
      return numeroUno+numeroDos;  
    }
    
    double resta(){
        return this.numeroUno-this.numeroDos;
    }
    
    double multiplicacion(){
        return this.numeroUno*this.numeroDos;
    }
    
    double division(){
        return this.numeroUno/this.numeroDos;
    }
    
    
}
