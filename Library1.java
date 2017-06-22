import java.util.*;
class Library1 
{
 
   
    private final List<Book> books;
     
    Library1(List<Book> books)
    {
        this.books = books; 
    }
     
    public List<Book> getTotalBooksInLibrary(){
         
       return books;  
    }
     
}