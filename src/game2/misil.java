package game2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class misil extends JLabel implements Runnable {

    //posicion misil
    int posx;
    int posy;
    //limites en eje x del misil
    int inix;
    int finx;
    //limites en eje y del misil
    int iniy;
    int finy;
    JPanel panel;
    //velocidad del misil
    int velocidad;

    public misil(JLabel personaje, int inix, int finx, int velocidad,JPanel panel) {
        this.posx=personaje.getX();
        this.inix = inix;
        this.finx = finx;
        this.velocidad = velocidad;
        this.panel=panel;
        this.setIcon(new ImageIcon("/home/teodoro/NetBeansProjects/Fifa/src/game2/misil.png"));
        this.setBounds(posx, 0, 75, 75);
        this.panel.add(this);
    }

    public void run() {
        for (int i = 0; i < 200; i++) {
            posy = posy + 10;
            this.setBounds(posx, posy, 75, 75);

            try {
                Thread.sleep(velocidad);
            } catch (Exception e) {

            }
        }

    }

}
