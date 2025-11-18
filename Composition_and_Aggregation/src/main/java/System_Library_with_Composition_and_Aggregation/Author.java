/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Library_with_Composition_and_Aggregation;

/**
 *
 * @author acer
 */
public class Author {
    private String AuthorName;
    
    public Author(String AuthorName){
        this.AuthorName = AuthorName;
    }
    
    public void infoAuthor(){
        System.out.println("Author Name : " + AuthorName);
    }
    
}
