/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.product;

/**
 *
 * @author acer
 */
import java.util.ArrayList;

public class Shopping_cart {
    ArrayList<Product> productList = new ArrayList<>();
    
    public void addProduct (Product product){
        productList.add(product);
    }
    
    public double countTotalPrice(){
        double total = 0;
        for (Product product : productList){
            total += product.price - product.countDiscount();
        }
        return total;
    }
    
}
