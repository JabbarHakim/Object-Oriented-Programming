/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Library_with_Composition_and_Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    
    public Library(){
        this.bookList = new ArrayList<>();
    }
    
    public void addBook(Book book){
        bookList.add(book);
    }
    
    public void infoLibrary(){
        System.out.println("Information Library\n");
        for (Book book : bookList){
            book.infoBook();
            System.out.println("-------------------------------------");
        }
    }
    
}
