/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;



import javax.swing.JFrame;
/**
 *
 * @author daniel
 */
public class Pacman extends JFrame{
    
    public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new tablero());
        setTitle("Pacman Daniel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(384, 424);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

//    public static void main(String[] args) {
//
//        EventQueue.invokeLater(new Runnable() {
// Nuevos comentarios
    
//            @Override
//            public void run() {
//                Pacman ex = new Pacman();
//                ex.setVisible(true);
//            }
//        });
//    }
}
