
package homework8poo;

public class LibroRentado {
   
    private Usuario user;
    private Libro book;

    public LibroRentado(Usuario user, Libro book) {
        this.user = user;
        this.book = book;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Libro getBook() {
        return book;
    }

    public void setBook(Libro book) {
        this.book = book;
    }
    
}
