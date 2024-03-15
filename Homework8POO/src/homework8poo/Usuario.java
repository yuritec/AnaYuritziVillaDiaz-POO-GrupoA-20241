
package homework8poo;

import java.util.ArrayList;

public class Usuario {
  private int id = (int)(Math.random()*1000+1);
    private String name;
    private int age;
    private ArrayList<Libro> librosRentados = new ArrayList<>();

    public Usuario(int id, String name, int age) {
        this.id = (int)(Math.random()*1000+1);
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void setLibrosRentados(ArrayList<Libro> librosRentados) {
        this.librosRentados = librosRentados;
    }
    
    

     
    
    
    
    
    
    
    
}
