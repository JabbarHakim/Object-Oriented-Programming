/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Practice_Interface;

/**
 *
 * @author ER-HA
 */
public class Main {

    public static void main(String[] args) {
        Arithmetic_Operation addition = new Addition_Operation();
        System.out.println("Addition : " + addition.count(10,5));
        
        Arithmetic_Operation substraction = new Subtraction_Operation();
        System.out.println("Substraction : " + substraction.count(10,5));
        
    }
}


