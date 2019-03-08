/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

import java.util.ArrayList;

/**
 *
 * @author charly
 */
public class playerController {
    
    ArrayList<player> listOfPlayers = new ArrayList<>();
    ArrayList<frameEntryGame1> listOfEntryFrames = new ArrayList<>();
    
    
    public void enterPlayer(String name, String icon){
        player newPlayer = new player(name, icon, 0);
        listOfPlayers.add(newPlayer);
    }
    
    public void showAllThePlayers(){
        for (int i = 0; i < listOfPlayers.size(); i++) {
            System.out.println(i+")  name: "+listOfPlayers.get(i).getName() + "  icon: "+listOfPlayers.get(i).getIcon() + 
                    "  position: "+listOfPlayers.get(i).getPosition() );
        }
    }
    
    public int returnNumberOfPlayersInList(){
        int number;
        number = listOfPlayers.size();
        return number;
    }
    
    public void saveEntryFrame(frameEntryGame1 frame){
        listOfEntryFrames.add(frame);
    }
    
    public void closeEntryFrames(){
        for (int i = 0; i < listOfEntryFrames.size(); i++) {
            listOfEntryFrames.get(i).dispose();
        }
        listOfEntryFrames.clear();
        
    }
    
    
}
