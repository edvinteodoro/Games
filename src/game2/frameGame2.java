package game2;

import javax.swing.JOptionPane;

public class frameGame2 extends javax.swing.JFrame {

    //posicion del personaje
    private int posx;
    private int posy;
    //tamano del personaje
    private int tamano = 75;

    public frameGame2() {
        initComponents();
        this.setResizable(false);
        //inicializar la posicion del personaje
        posx = personaje.getX();
        posy = personaje.getY();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        personaje = new javax.swing.JLabel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 179, 71));
        panel.setPreferredSize(new java.awt.Dimension(799, 551));

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

        personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cuad.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(personaje)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(personaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == evt.VK_LEFT) { //si se preciona la tecla direccion izquierda
            moverIzquierda();
        } else if (evt.getKeyCode() == evt.VK_RIGHT) {//si se preciona la tecla direccion derecha
            moverDerecha();
        } else if (evt.getKeyCode() == evt.VK_ENTER) {//si se preciona la tecla enter
            comenzar();
        }
    }//GEN-LAST:event_formKeyPressed
    private void moverIzquierda() {
        posx = posx - 10;
        this.personaje.setBounds(posx, posy, tamano, tamano);
    }

    private void moverDerecha() {
        posx = posx + 10;
        this.personaje.setBounds(posx, posy, tamano, tamano);
    }

    private void comenzar() {
        Runnable misil = new misil(personaje, 0, 24, 100,this.panel);
        Thread hilo=new Thread(misil);
        hilo.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel personaje;
    // End of variables declaration//GEN-END:variables
}
