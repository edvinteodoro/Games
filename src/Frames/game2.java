package Frames;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class game2 extends javax.swing.JFrame {

    public int posy;
    public int posx;
    public int xmax = 12;
    public int posMisily;
    public int posMisilx;

    public game2() {
        initComponents();
        //comenzar();
    }

    public void comenzar() {
        while (true) {
            moverMisil();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cuadrado = new javax.swing.JLabel();
        izquierda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        misil = new javax.swing.JLabel();

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 179, 71));

        jPanel2.setBackground(new java.awt.Color(28, 27, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cuad.png"))); // NOI18N

        izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fleIz.png"))); // NOI18N
        izquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izquierdaMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fleDer.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        misil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(izquierda)
                .addGap(242, 242, 242)
                .addComponent(cuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(misil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(misil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadrado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(izquierda, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            moverIzquierda();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            moverDerecha();
        }
    }//GEN-LAST:event_formKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //moverMisil();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //JOptionPane.showMessageDialog(null, "botonDerecho");
        moverDerecha();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void izquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izquierdaMouseClicked
        //JOptionPane.showMessageDialog(null, "botonIzquierdo");
        moverIzquierda();
    }//GEN-LAST:event_izquierdaMouseClicked

    public void moverMisil() {
        posMisily = this.misil.getY() + 20;
        posMisilx = this.misil.getX();
        this.misil.setBounds(posMisilx, posMisily, 75, 75);
    }

    public void moverIzquierda() {
        if (xmax > 0) {
            posy = this.cuadrado.getY();
            posx = this.cuadrado.getX() - 20;
            this.cuadrado.setBounds(posx, posy, 75, 75);
            moverMisil();
            xmax--;
        } else {

        }

    }

    public void moverDerecha() {
        if (xmax < 24) {
            posy = this.cuadrado.getY();
            posx = this.cuadrado.getX() + 20;
            this.cuadrado.setBounds(posx, posy, 75, 75);
            xmax++;

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuadrado;
    private javax.swing.JLabel izquierda;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel misil;
    // End of variables declaration//GEN-END:variables
}
