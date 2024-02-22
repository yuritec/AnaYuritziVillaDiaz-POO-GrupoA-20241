
package prueba.poo.a;

public class PruebaPOOA {

    public static void main(String[] args) {
        
        System.out.println("PERSON 1:");
        //crear instancia
        Person firstPerson = new Person("Maria", 15, "Mujer"); 
        //imprimir clases
        System.out.println("NAME: "+firstPerson.name+"\n"+"AGE: "+firstPerson.age+"\n"+"GENDER:"+firstPerson.gender);
        
        System.out.println(".....................................");
        System.out.println("PERSON 2:");
        Person secondPerson = new Person("Juan", 18, "Hombre"); 
        System.out.println("NAME: "+secondPerson.name+"\n"+"AGE: "+secondPerson.age+"\n"+"GENDER:"+secondPerson.gender);
        
        System.out.println(".....................................");
        System.out.println("PERSON 3:");
        Person thirdPerson = new Person("Pedro", 20, "Hombre"); 
        System.out.println("NAME: "+thirdPerson.name+"\n"+"AGE: "+thirdPerson.age+"\n"+"GENDER:"+thirdPerson.gender);
        
         System.out.println(".....................................");
         System.out.println("PERSON 4:");
        Person fourthPerson = new Person("Juana", 30, "Mujer"); 
        System.out.println("NAME: "+fourthPerson.name+"\n"+"AGE: "+fourthPerson.age+"\n"+"GENDER:"+fourthPerson.gender);
        
        System.out.println(".....................................");
        
        System.out.println("BOOK 1:");
        Book firstBook =new Book();
        System.out.println("TITLE: "+firstBook.title+"\n"+"AUTHOR: "+firstBook.author+"\n"+"YEAR OF PUBLICATION: "+firstBook.year_of_publication);
        
        System.out.println(".....................................");
         System.out.println("BOOK 2:");
        Book secondBook =new Book();
        secondBook.title="El Alquimista";
        secondBook.author="GPaulo Coelho";
        secondBook.year_of_publication=1967;
        System.out.println("TITLE: "+secondBook.title+"\n"+"AUTHOR: "+secondBook.author+"\n"+"YEAR OF PUBLICATION: "+secondBook.year_of_publication);
        
        System.out.println("....................................."); 
         System.out.println("BOOK 3:");
        Book thirdBook =new Book();
        thirdBook.title="Harry Potter";
        thirdBook.author="J.K. Rowling";
        thirdBook.year_of_publication=2000;
        System.out.println("TITLE: "+thirdBook.title+"\n"+"AUTHOR: "+thirdBook.author+"\n"+"YEAR OF PUBLICATION: "+thirdBook.year_of_publication);
        
        System.out.println("....................................."); 
         System.out.println("BOOK 4:");
        Book fourthBook =new Book();
        fourthBook.title="Crepusculo";
        fourthBook.author="Stephenie Meyer";
        fourthBook.year_of_publication=1971;
        System.out.println("TITLE: "+fourthBook.title+"\n"+"AUTHOR: "+fourthBook.author+"\n"+"YEAR OF PUBLICATION: "+fourthBook.year_of_publication);
        
        System.out.println(".....................................");
        System.out.println("RECTANGLE 1:");
        Rectangle rectangle1 = new Rectangle(8, 9);
        System.out.println("Area: "+rectangle1.calculateArea()+"\n"+"Perimeter: "+rectangle1.calculateperimeter());
        
       System.out.println(".....................................");
        System.out.println("RECTANGLE 2:");
        Rectangle rectangle2 = new Rectangle(8, 9);
        System.out.println("Area: "+rectangle2.calculateArea()+"\n"+"Perimeter: "+rectangle1.calculateperimeter());
        
        System.out.println("....................................."); 
        System.out.println("RECTANGLE 3:");
        Rectangle rectangle3 = new Rectangle(8, 9);
        System.out.println("Area: "+rectangle3.calculateArea()+"\n"+"Perimeter: "+rectangle1.calculateperimeter());
        
        System.out.println(".....................................");
        System.out.println("RECTANGLE 4:");
        Rectangle rectangle4 = new Rectangle(8, 9);
        System.out.println("Area: "+rectangle4.calculateArea()+"\n"+"Perimeter: "+rectangle1.calculateperimeter());
        
    }
    
}
