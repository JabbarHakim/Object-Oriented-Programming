/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_animal;

/**
 *
 * @author ER-HA
 */
public class Cat extends Animal {
    private String fur_type;
    
    public Cat(String name, String species, String fur_type){
        super(name,species);
        this.fur_type = fur_type;
    }
    
    @Override
    public String displayInfo(){
        return "Cat name : " + name + "\nSpecies: " + species + "\nFur Type: " + fur_type +("\n");
    }
    
    @Override
    public String sound(){
        return "Meow! Meow!!";
    }
    
    public String getFur_Type(){
        return fur_type;
    }
    public void setFur_Type(String fur_type){
        this.fur_type = fur_type;
    }
}
