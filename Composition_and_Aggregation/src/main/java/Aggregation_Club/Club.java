/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation_Club;

import java.util.List;
import java.util.ArrayList;

public class Club {
    private String nameClub;
    private List<Member> memberList;
    
    public Club(String nameClub){
        this.nameClub = nameClub;
        this.memberList = new ArrayList<>();
    }
    
    public void addMember(Member member){
        memberList.add(member);
    }
    
    public void infoClub(){
        System.out.println("Club name : " + nameClub);
        for (Member member : memberList){
            member.infoMember();
        }
    }
    
}
