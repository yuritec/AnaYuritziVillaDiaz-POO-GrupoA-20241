
package homework6poo;

public class Producto {
    
    private String nombre;
    private float precio;
    private int stock;
   

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, float precio) {
        this.stock=0;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        if(nombre!=null){
        this.nombre = nombre;
        }
    }

    public void setPrecio(float precio) {
        if(precio>0){
        this.precio = precio;
         }
        else{
            System.out.println("No puedes ingresar numeros negativos");
        }
    }

    public void setStock(int stock) {
        if(stock>0){
        this.stock = stock;
         }
        else{
            System.out.println("No puedes ingresar numeros negativos");
        }
        
    }
    
    int aumentarStock(int cantidad){    
        if(cantidad>0){
            stock+=cantidad;
            return stock;
        }
        else{
            return stock;
        }
    }   
    
     int reducirStock(int cantidad){
        if(cantidad>0 && cantidad<=stock){
           stock-=cantidad;
           return stock;
        }
        else{
            System.out.println("ERROR EN LA CANTIDAD DE REDUCCION, No puedes reducir una cantidad mayor al stock por ende");
             return stock;
        }
    }   
             
        
    }
  

