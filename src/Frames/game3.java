/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author crystian
 */
public class game3 extends javax.swing.JFrame implements ActionListener{

    public static final int codeX = 1;
    public static final int codeO = 0;
    
    JButton board[][];
    int turn = 1;
    Color backGround;
    
    /**
     * Creates new form game3
     */
    public game3() {
        initComponents();
        this.setTitle("Tres en Raya");
        board = new JButton[3][3];
        createBoard();
        this.setLocationRelativeTo(null);
    }
    
    private void createBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new JButton();
                board[i][j].setBounds((i)*150,(j)*150,150,150);
                boardPanel.add(board[i][j]);
                board[i][j].addActionListener(this);
                board[i][j].setFont(new Font("Arial", Font.BOLD, 34));
                board[i][j].setForeground(Color.BLACK);
            }
        }
        backGround = board[0][0].getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        boardPanel = new javax.swing.JPanel();
        scorePanel = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        oLabel = new javax.swing.JLabel();
        scoreXLabel = new javax.swing.JLabel();
        scoreOLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        turnPanel = new javax.swing.JPanel();
        turnLabel = new javax.swing.JLabel();

        setTitle("Tres en Raya");
        setResizable(false);

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        scorePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntuación"));

        xLabel.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        xLabel.setText("X: ");

        oLabel.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        oLabel.setText("O:");

        scoreXLabel.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        scoreXLabel.setText("0");

        scoreOLabel.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        scoreOLabel.setText("0");

        javax.swing.GroupLayout scorePanelLayout = new javax.swing.GroupLayout(scorePanel);
        scorePanel.setLayout(scorePanelLayout);
        scorePanelLayout.setHorizontalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xLabel)
                    .addComponent(oLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scorePanelLayout.setVerticalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xLabel)
                    .addComponent(scoreXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oLabel)
                    .addComponent(scoreOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        menuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        newGameButton.setText("Juego Nuevo");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGameButton)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        turnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        turnLabel.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        turnLabel.setText("X");

        javax.swing.GroupLayout turnPanelLayout = new javax.swing.GroupLayout(turnPanel);
        turnPanel.setLayout(turnPanelLayout);
        turnPanelLayout.setHorizontalGroup(
            turnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(turnPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(turnLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        turnPanelLayout.setVerticalGroup(
            turnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(turnPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(turnLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(turnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel oLabel;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JLabel scoreOLabel;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JLabel scoreXLabel;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JPanel turnPanel;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (turn == codeX){
            if (button.getText().equals("")){
                button.setBackground(Color.decode("#A9D0F5"));
                button.setText("X");
                button.setEnabled(false);
                turn = codeO;
                turnLabel.setText("O");
            }
        } else {
            if (button.getText().equals("")){
                button.setBackground(Color.decode("#F6D8CE"));
                button.setText("O");
                button.setEnabled(false);
                turn = codeX;   
                                turnLabel.setText("X");
            }
        }
    }
}
