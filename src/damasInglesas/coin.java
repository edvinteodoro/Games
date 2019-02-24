/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damasInglesas;

import java.awt.Color;

/**
 *
 * @author angelrg
 */
public class coin {
    int number;
    int xPosicion;
    int yPosicion;
    Color colorCoin;
    boolean queen;

    public coin(int number, int xPosicion, int yPosicion, Color colorCoin, boolean queen) {
        this.number = number;
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.colorCoin = colorCoin;
        this.queen = queen;
    }

    public coin() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getxPosicion() {
        return xPosicion;
    }

    public void setxPosicion(int xPosicion) {
        this.xPosicion = xPosicion;
    }

    public int getyPosicion() {
        return yPosicion;
    }

    public void setyPosicion(int yPosicion) {
        this.yPosicion = yPosicion;
    }

    public Color getColorCoin() {
        return colorCoin;
    }

    public void setColorCoin(Color colorCoin) {
        this.colorCoin = colorCoin;
    }

    public boolean isQueen() {
        return queen;
    }

    public void setQueen(boolean queen) {
        this.queen = queen;
    }
    
}
