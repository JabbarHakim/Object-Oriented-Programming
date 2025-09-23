/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_animal;

/**
 *
 * @author ER-HA
 */
public class Dog extends Animal{
    private String race;
    
    public Dog(String name,String species, String race){
        super(name, species);
        this.race = race;
    }
    
    @Override
    public String displayInfo(){
        return "Dog name: " + name + "\nSpecies: "+ species + "\nRace: " + race +("\n");
    }
    
    
    @Override
    public String sound(){
        return "Woof! Woof!!";
    }
    
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race = race;
    }
}
