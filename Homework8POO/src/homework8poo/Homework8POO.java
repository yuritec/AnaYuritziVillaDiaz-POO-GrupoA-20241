
package homework8poo;

import java.util.ArrayList;
import java.util.Scanner;


public class Homework8POO {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        ArrayList<Usuario> users = new ArrayList<>();
        Libreria libreria1 = new Libreria();

        boolean salir = true;
        while (salir == true) {
            System.out.println("Bienvenido a la libreria");
            System.out.println("1: Registrar usuario");
            System.out.println("2: Registrar libro");
            System.out.println("3: Rentar libro");
            System.out.println("4: Mostrar usuarios registrados");
            System.out.println("5: Mostrar libros registrados");
            System.out.println("6: Mostrar usuarios que han rentado un libro");
            System.out.println("7: Mostrar libros no rentados");
            System.out.println("8. Mostrar libros rentados");
            System.out.println("9: Salir");

            System.out.println("Que desea hacer?");
            int op = leer.nextInt();

            switch (op) {
                case 1:
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del usuario que desea agregar: ");
                    String name = leer.nextLine();
                    System.out.println("Ingrese la edad del usuario que desea agregar: ");
                    int age = leer.nextInt();
                    int id = (int) (Math.random() * 1000 + 1);
                    Usuario usuario = new Usuario(id, name, age);
                    users.add(usuario);
                    System.out.println("REGISTRADO EXITOSAMENTE\nEl ID del usuario es: " +usuario.getId()+"\nEl nombre del usuario es: " 
                            +usuario.getName()+"\nLa edad del usuario es: " +usuario.getAge());
                    break;

                case 2:
                    leer.nextLine();
                    System.out.println("Introduzca el nombre del libro que desea agregar: ");
                    String nameBook = leer.nextLine();
                    System.out.println("Introduzca el autor del libro: ");
                    String author = leer.nextLine();
                    int idBook = (int) (Math.random() * 1000 + 1);
                    libreria1.registerBook(idBook, nameBook, author);
                    break;

                case 3:
                    System.out.println("Lista de usuarios existentes:");
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println(String.format(" %s, Nombre: %s, id: %d, edad: %d",
                                i, users.get(i).getName(), users.get(i).getId(), users.get(i).getAge()));
                    }

                    System.out.println("Ingrese el id del usuario que va  a rentar el libro: ");
                    int userId = leer.nextInt();

                    for (int j = 0; j < users.size(); j++) {
                        if (users.get(j).getId() == userId) {
                            Usuario usuarioRent = users.get(j);
                            libreria1.listBook();
                            System.out.println("Ingrese el id del libro que desea rentar: ");
                            int BookId = leer.nextInt();
                            libreria1.rentedBooks(BookId, usuarioRent);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Usuarios registrados:");
                    for (int i = 0; i < users.size(); i++) {
                          System.out.println(String.format("nombre: %s Edad: %d Id: %d",
                                  users.get(i).getName(),users.get(i).getAge(), users.get(i).getId()));
                    }
                    break;
                case 5:
                    System.out.println("Libros registrados:");
                    libreria1.listBook();
                    break;
                case 6:
                    System.out.println("Usuarios que rentaron al menos un libro:");
                    libreria1.listusersRent();
                    break;
                case 7: 
                    System.out.println("Lista de libros no rentados");
                    for (int i = 0; i < libreria1.getBooks().size(); i++) {
                        Libro libro = libreria1.getBooks().get(i);
                        if(libro.getEsRentado() == false){
                            System.out.println("El libro "+libro.getName()+" no ha sido rentado aun");
                        }
                    }
                    break;
                case 8:
                    System.out.println("Lista de libros rentados");
                    libreria1.listRentedBooks();
                    break;
                case 9:
                    salir = false;
                    break;

            }
        }

        
        
        
    }
    
}
