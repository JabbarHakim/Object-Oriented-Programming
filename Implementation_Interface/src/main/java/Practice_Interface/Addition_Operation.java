/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Interface;

/**
 *
 * @author ER-HA
 */
public class Addition_Operation implements Arithmetic_Operation{
    @Override
    public int count(int a, int b){
        return a + b;
    }
    
}
