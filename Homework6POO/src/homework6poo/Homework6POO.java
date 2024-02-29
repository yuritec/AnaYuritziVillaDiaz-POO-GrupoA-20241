
package homework6poo;

public class Homework6POO {

    public static void main(String[] args) {
        
        Producto producto = new Producto("Pan",45,10);
        System.out.println("Nombre: "+producto.getNombre());
        System.out.println("Precio: "+producto.getPrecio());
        System.out.println("Stock:"+producto.getStock());
        System.out.println("Stock mas aumento: "+producto.aumentarStock(6));
        System.out.println("Stock menos disminucion: "+producto.reducirStock(10));
        producto.setNombre("leche");
        producto.setPrecio(60);
        producto.setStock(100);
        System.out.println("Nombre: "+producto.getNombre());
        System.out.println("Precio: "+producto.getPrecio());
        System.out.println("Stock: "+producto.getStock());
         System.out.println("Stock mas aumento: "+producto.aumentarStock(2));
        System.out.println("Stock menos disminucion: "+producto.reducirStock(110));
    }
    
}
