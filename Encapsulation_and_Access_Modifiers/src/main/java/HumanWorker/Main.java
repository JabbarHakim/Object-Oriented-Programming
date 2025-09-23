/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HumanWorker;

/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker worker1 = new Worker("Paul", 26, "Web Designer", 8000000);
        
        System.out.println(worker1.toString());
        
        worker1.setName("Paul Phoenix");
        
        System.out.println("\n-After change Name-\n\n" + worker1.toString());
    }
        
    
    
    
}
