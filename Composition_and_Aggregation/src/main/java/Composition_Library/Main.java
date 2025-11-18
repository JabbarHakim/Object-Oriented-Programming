/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Composition_Library;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        
        Book book001 = new Book("Java for Beginner");
        Book book002 = new Book("Java for Intermediate");
        Book book003 = new Book("Java for Senior");
        
        library.addBook(book001);
        library.addBook(book002);
        library.addBook(book003);
        
        library.infoLibrary();
        
        
    }
}
