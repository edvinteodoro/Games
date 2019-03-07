/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damasInglesas;

import javax.swing.JButton;

/**
 *
 * @author angelrg
 */
public class coin {
    int number;
    int xPosicion;
    int yPosicion;
    String image;
    boolean queen;
    JButton boton;

    public coin(int number, int xPosicion, int yPosicion, String image, boolean queen, JButton boton) {
        this.number = number;
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.image = image;
        this.queen = queen;
        this.boton = boton;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public boolean isQueen() {
        return queen;
    }

    public void setQueen(boolean queen) {
        this.queen = queen;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
}
