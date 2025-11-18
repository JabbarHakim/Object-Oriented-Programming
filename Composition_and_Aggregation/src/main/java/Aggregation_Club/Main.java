/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation_Club;

/**
 *
 * @author acer
 */
public class Main {
    
    public static void main(String[] args){
        
        Club club = new Club("Hell Paradise");
        
        Member member001 = new Member("Beelzebub");
        Member member002 = new Member("Abaddon");
        Member member003 = new Member("Lucifer");
        
        club.addMember(member001);
        club.addMember(member002);
        club.addMember(member003);
        
        club.infoClub();
        
        
        
        
    }
    
}
