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
    
    framePrincipalGame1 frame;

    public playerController(framePrincipalGame1 frame) {
        this.frame = frame;
    }
    
    
    
    ArrayList<player> listOfPlayers = new ArrayList<>();
    ArrayList<frameEntryGame1> listOfEntryFrames = new ArrayList<>();
    
    
    public void enterPlayer(String name, String icon){
        player newPlayer = new player(name, icon, 1);
        listOfPlayers.add(newPlayer);
    }
    
    public void showAllThePlayers(){
        int number = 1;
        for (int i = 0; i < listOfPlayers.size(); i++) {
            System.out.println(i+")  name: "+listOfPlayers.get(i).getName() + "  icon: "+listOfPlayers.get(i).getIcon() + 
                    "  position: "+listOfPlayers.get(i).getPosition() );
            
            frame.selectInsertion(number, listOfPlayers.get(i).getIcon(), listOfPlayers.get(i).getName(), listOfPlayers.get(i).getPosition());
            number++;
            
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
    
    
    
    
    
    public int returnPosition(int playerNumber){
        int position = 0;
        
        position = listOfPlayers.get(playerNumber).getPosition();
        
        
        return position;
    }
    
    
    public String returnName(int playerNumber){
        String position = "";
        
        position = listOfPlayers.get(playerNumber).getName();
        
        
        return position;
    }
    
    
    
    public void setPosition(int playerNumber, int newPosition){
        
        listOfPlayers.get(playerNumber).setPosition(newPosition);
        
    }
    
    
    

    
    
    
    
    
    
    public int moveABoxToTheRight(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX + 90;
        
        return posicionX;
    }
    
    public int moveABoxToTheLeft(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 90;
        
        return posicionX;
    }
    

    public int moveABoxUP(int actualPositionY){
        int posicionY = 0;
        
        posicionY = actualPositionY - 65;
        
        return posicionY;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int moveABoxStairOneY(int actualPositionY){
        int posicionY = 0;
        
        posicionY = actualPositionY - 65;
        
        return posicionY;
    }
    
    
    public int moveABoxStairOneX(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 36;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    public int moveABoxStairTwoY(int actualPositionY){
        int posicionY = 0;
        
        posicionY = actualPositionY - 39;
        
        return posicionY;
    }
    
    
    public int moveABoxStairTwoX(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX + 36;
        
        return posicionX;
    }
    
    
    
    
    
    public int moveABoxStairThreeAndFourY(int actualPositionY){
        int posicionY = 0;
        
        posicionY = actualPositionY - 65;
        
        return posicionY;
    }
    
    
    public int moveABoxStairThreeX(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX + 45;
        
        return posicionX;
    }
    
    
    
    
    
    
    public int moveABoxStairFourX(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 45;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    public int moveABoxSnakeOneX1(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 90;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneY1(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    public int moveABoxSnakeOneX2(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneY2(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneX3(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneY3(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneX4(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneY4(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneX5(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 25;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeOneY5(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    public int moveABoxSnakeTwoX(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeTwoY(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    
    public int moveABoxSnakeThreeX1(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX +65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeY1(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    public int moveABoxSnakeThreeX2(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeY2(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeX3(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX +90;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeY3(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeX4(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeY4(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeX5(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX + 25;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeThreeY5(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int moveABoxSnakeFourX1(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 90;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourY1(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    public int moveABoxSnakeFourX2(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourY2(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourX3(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourY3(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourX4(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourY4(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourX5(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 25;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFourY5(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int moveABoxSnakeFiveX1(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 90;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveY1(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    public int moveABoxSnakeFiveX2(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveY2(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveX3(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 155;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveY3(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveX4(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveY4(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY + 65;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveX5(int actualPositionX){
        int posicionX = 0;
        
        posicionX = actualPositionX - 25;
        
        return posicionX;
    }
    
    
    public int moveABoxSnakeFiveY5(int actualPositionY){
        int posicionX = 0;
        
        posicionX = actualPositionY;
        
        return posicionX;
    }
    
    
    
    
    
    
    
    
    
}
