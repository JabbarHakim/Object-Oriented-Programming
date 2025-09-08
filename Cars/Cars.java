/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars;

/**
 *
 * @author ER-HA
 */
public class Cars {
    private String brand;
    private String model;
    private int years;
    private String colors;
    
    public Cars(String brand, String model, int years, String colors){
        this.brand = brand;
        this.model = model;
        this.years = years;
        this.colors = colors;
    }
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getColors() {
        return colors;
    }
    public void setColors(String colors) {
        this.colors = colors;
    }
    
    public void displayInfo() {
        System.out.println("Brand = " + getBrand());
        System.out.println("Model = " + getModel());
        System.out.println("Years = " + getYears());
        System.out.println("Colors = " + getColors());
        System.out.println(" ");
    }
    
    public void StartEngine() {
        System.out.println(brand + (" ") + model + " has started the Engine");
    }
}
