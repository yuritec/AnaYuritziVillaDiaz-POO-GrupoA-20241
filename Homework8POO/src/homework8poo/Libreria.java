
package homework8poo;

import java.util.ArrayList;

public class Libreria {
  
   private ArrayList<Libro> books = new ArrayList<>();
    private ArrayList<LibroRentado> booksRented = new ArrayList<>();
    public ArrayList<Libro> getBooks (){
        return books;
    }
    public void registerBook(int id, String name, String author) {
        Libro book = new Libro(id, name, author);
        books.add(book);
        System.out.println("Libro agregado exitosamente");
    }

    public void listBook() {
        System.out.println("Lista de libros disponibles");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(String.format("Nombre: %s id: %d Autor: %s",
                    books.get(i).getName(), books.get(i).getIdBook(), books.get(i).getAuthor()));
        }
    }

    public ArrayList<LibroRentado> getRentedBooks() {
        return booksRented;
    }

    public void listRentedBooks() {
        for (int i = 0; i < booksRented.size(); i++) {
            Libro libro = booksRented.get(i).getBook();
            System.out.println("El libro " + libro.getName()+ " se encuentra rentado");

        }
    }

    public void listusersRent() {
        for (int i = 0; i < booksRented.size(); i++) {
            Usuario usuario = booksRented.get(i).getUser();
            System.out.println(String.format("Nombre: %s Edad: %d Id: %d",
             usuario.getName(),usuario.getAge(), usuario.getId()));
        }

    }

    public void rentedBooks(int bookId, Usuario user) {
        boolean foundFlag = false;
        for (int i = 0; i < books.size(); i++) {
            if (bookId == books.get(i).getIdBook()) {

                foundFlag = true;
                if (books.get(i).getEsRentado() == true) 
                {
                    System.out.println("Ese libro ya se encuentra rentado");

                    break;
                } 
                else {
                    books.get(i).setEsRentado(true);
                    Libro book = books.get(i);
                    LibroRentado rentedBook = new LibroRentado(user, book);
                    booksRented.add(rentedBook);
                    System.out.println("El libro ha sido rentado con exito");
                    break;
                }
            } else {
                foundFlag = false;
            }
        }

        if (foundFlag == false) {
            System.out.println("Error, libro no encontrado");
        }

    } 
    
    
    
}
