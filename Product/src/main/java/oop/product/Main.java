/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.product;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        Books books001 = new Books("Object Oriented Programming", 250000);
        Clothing clothing001 = new Clothing("Stussy Longsleeve", 3750000);
        Electronic electronic001 = new Electronic("Monitor ASUS ROG 244hz", 4790000);
        Shopping_cart shoppingcart001 = new Shopping_cart();
        
        shoppingcart001.addProduct(books001);
        shoppingcart001.addProduct(clothing001);
        shoppingcart001.addProduct(electronic001);
        
        System.out.println("+++ NORMAL PRICE PRODUCT +++");
        books001.normalPrice();
        clothing001.normalPrice();
        electronic001.normalPrice();
        
        System.out.println("\n+++ PRICE AFTER DISCOUNT +++");
        System.out.println("This product " + books001.name + " got Discount and for Total : " + (books001.price - books001.countDiscount()));
        System.out.println("This product " + clothing001.name + " got Discount and for Total : " + (clothing001.price - clothing001.countDiscount()));
        System.out.println("This product " + electronic001.name + " got Discount and for Total : " + (electronic001.price - electronic001.countDiscount()));
        
        System.out.println("\n+++ TOTAL PRODUCT +++");
        double total = shoppingcart001.countTotalPrice();
        System.out.println("Total price for all product with Discount : " + total);
    }   

}

