/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class Main {

    public static void main(String[] args) {
        Electronic product_electronic_1 = new Electronic("Processor Ryzen 7 7600X", 399.99, 4);
        Foods product_foods_1 = new Foods("Hamburger", 2, "2 Days");
        PermanentEmployee permanent_employee_1 = new PermanentEmployee("Hakim", 1250, 300);
        ContractEmployee contract_employee_1 = new ContractEmployee("Dante", 860, 6);
        
        System.out.println("+++ Information item's in Product! +++");
        product_electronic_1.displayInfo();
        product_foods_1.displayInfo();
        
        System.out.println("+++ Employee Information! +++");
        permanent_employee_1.displayInfo();
        contract_employee_1.displayInfo();
        
        
    }
}
