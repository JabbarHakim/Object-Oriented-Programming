/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Library_with_Composition_and_Aggregation;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String [] args){
        
        Author author001 = new Author("Ervira");
        Author author002 = new Author("Hakim");
        
        Library library = new Library();
        
        Book book001 = new Book("Basic Knowing of Tourism", author001);
        Book book002 = new Book("Java Programming Beginner", author002);
        Book book003 = new Book("Java Programming Intermediate", author002);
        
        library.addBook(book001);
        library.addBook(book002);
        library.addBook(book003);
        
        library.infoLibrary();
        
    }
    
}
