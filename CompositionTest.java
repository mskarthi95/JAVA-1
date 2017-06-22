 
import java.util.*;
class CompositionTest 
{
    public static void main (String[] args) 
    {
         
        
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
         
       
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
         
        Library1 library = new Library1(books);
         
        List<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){
             
            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
        }
    }
}