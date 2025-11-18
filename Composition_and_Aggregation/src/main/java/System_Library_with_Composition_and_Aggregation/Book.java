/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Library_with_Composition_and_Aggregation;

/**
 *
 * @author acer
 */
public class Book {
    private String title;
    private Author author;
    
    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }
    
    public void infoBook(){
        System.out.println("Book Title : " + title);
        if (author != null){
            author.infoAuthor();
        } else{
            System.out.println("Author not found!");
        }
    }
    
}
