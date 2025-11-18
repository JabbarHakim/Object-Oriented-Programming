/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition_Library;

/**
 *
 * @author acer
 */
public class Book {
    private String title;
    
    public Book(String title){
        this.title = title;
    }
    
    public void infoBook(){
        System.out.println("Book title : " + title);
    }
    
}
