/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition_Library;

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
        for (Book book : bookList){
            book.infoBook();
        }
    }
    
}
