/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damasInglesas;

/**
 *
 * @author angelrg
 */
public class coin {
    int number;
    int xPosicion;
    int yPosicion;
    boolean queen;
    boolean alive;

    public coin(int xPosicion, int yPosicion, boolean alive) {
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.alive = alive;
        this.queen = false;
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

    public boolean isQueen() {
        return queen;
    }

    public void setQueen(boolean queen) {
        this.queen = queen;
    }
    
}
