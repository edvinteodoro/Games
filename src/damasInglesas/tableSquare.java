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
public class tableSquare {

    JButton boton;
    int idGamer;

    public tableSquare(JButton boton, int idGamer) {
        this.boton = boton;
        this.idGamer = idGamer;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public int getIdGamer() {
        return idGamer;
    }

    public void setIdGamer(int idGamer) {
        this.idGamer = idGamer;
    }

}
