/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damasInglesas;

import Frames.game4;
import backEnd.exceptions.InputsVaciosException;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author angelrg
 */
public class game {

    game4 game;
    String name1;
    String name2;
    tableSquare tablero[][] = new tableSquare[8][8];
    LinkedList<coin> gamer1 = new LinkedList<>();
    LinkedList<coin> gamer2 = new LinkedList<>();

    public game(game4 gm) {
        this.game = gm;
    }

    public boolean isGamerCoin(int gamer, JButton boton) {
        tableSquare aux = tablero[game.getXButton(boton)][game.getYButton(boton)];
        return (aux.getIdGamer() == gamer);
    }

    /**
     * This method had been designed to verify if a coin is able to move along
     * in the table
     *
     * This method don't move if is a coin by the way
     *
     * @param xPosActualButton
     * @param yPosActualButton
     * @param xPosNextButton
     * @param yPosNextButton
     * @return true if is able to move along
     * @throws InputsVaciosException
     */
    public boolean canSimpleCoinMove(int xPosActualButton, int yPosActualButton, int xPosNextButton, int yPosNextButton) throws InputsVaciosException {
        tableSquare auxTS = tablero[xPosActualButton][yPosActualButton];

        if (auxTS.idGamer == game.idGamer1) {
            if ((yPosActualButton < game.dimension - 1) && (yPosActualButton + 1 == yPosNextButton)) {
                if ((((xPosActualButton > 0) && (xPosActualButton < game.dimension - 1) && ((xPosActualButton + 1 == xPosNextButton) || (xPosActualButton - 1 == xPosNextButton))))
                        || ((xPosActualButton == 0) && (xPosActualButton + 1 == xPosNextButton)) || ((xPosActualButton == game.dimension - 1) && (xPosActualButton - 1 == xPosNextButton))) {
                    return true;
                } else {
                    throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
                }
            } else {
                throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
            }
        } else if (auxTS.idGamer == game.idGamer2) {
            if ((yPosActualButton > 0) && (yPosActualButton - 1 == yPosNextButton)) {
                if (((xPosActualButton > 0) && (xPosActualButton < game.dimension - 1) && ((xPosActualButton + 1 == xPosNextButton) || (xPosActualButton - 1 == xPosNextButton)))
                        || ((xPosActualButton == 0) && (xPosActualButton + 1 == xPosNextButton)) || ((xPosActualButton == game.dimension - 1) && (xPosActualButton - 1 == xPosNextButton))) {
                    return true;
                } else {
                    throw new InputsVaciosException("Posicion incorrecta (" + (yPosNextButton + 1) + "," + (xPosNextButton + 1) + ") en jugador 2");
                }
            } else {
                throw new InputsVaciosException("Posicion incorrecta (" + (yPosNextButton + 1) + "," + (xPosNextButton + 1) + ") en jugador 2");
            }
        } else {
            throw new InputsVaciosException("Debe elegir una ficha, Posicion incorrecta (" + xPosNextButton + "," + yPosNextButton + ")");
        }
    }

    /**
     * Verify if a coin can be kill by another
     *
     * @param xPosActualButton
     * @param yPosActualButton
     * @param xPosNextButton
     * @param yPosNextButton
     * @return
     * @throws InputsVaciosException
     */
    public boolean canKillSimpleCoin(int xPosActualButton, int yPosActualButton, int xPosNextButton, int yPosNextButton) throws InputsVaciosException {
        tableSquare auxTSActual = tablero[xPosActualButton][yPosActualButton];
        tableSquare auxTSNext = tablero[xPosNextButton][yPosNextButton];

        if (auxTSActual.idGamer == game.idGamer1 && auxTSNext.idGamer == game.idGamer2) {
            if ((yPosActualButton < game.dimension - 2) && (yPosActualButton + 1 == yPosNextButton)) {
                if (((xPosActualButton > 1) && (xPosActualButton < game.dimension - 2) && (((xPosActualButton + 1 == xPosNextButton)
                        && (getTableSquare(xPosNextButton + 1, yPosNextButton + 1).getIdGamer() == game.noId)) || ((xPosActualButton - 1 == xPosNextButton)
                        && (getTableSquare(xPosNextButton - 1, yPosNextButton + 1).getIdGamer() == game.noId))))) {
                    return true;
                } else if ((xPosActualButton == 0 || xPosActualButton == 1) && (xPosActualButton + 1 == xPosNextButton) && (getTableSquare(xPosNextButton + 1, yPosNextButton + 1).getIdGamer() == game.noId)) {
                    return true;
                } else if ((xPosActualButton == game.dimension - 1 || xPosActualButton == game.dimension - 2) && (xPosActualButton - 1 == xPosNextButton) && (getTableSquare(xPosNextButton - 1, yPosNextButton + 1).getIdGamer() == game.noId)) {
                    return true;
                } else {
                    throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
                }
            } else {
                throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
            }
        } else if (auxTSActual.idGamer == game.idGamer2 && auxTSNext.idGamer == game.idGamer1) {
            if ((yPosActualButton > 1) && (yPosActualButton - 1 == yPosNextButton)) {
                if (((xPosActualButton > 1) && (xPosActualButton < game.dimension - 2) && (((xPosActualButton + 1 == xPosNextButton)
                        && (getTableSquare(xPosNextButton + 1, yPosNextButton - 1).getIdGamer() == game.noId)) || ((xPosActualButton - 1 == xPosNextButton)
                        && (getTableSquare(xPosNextButton - 1, yPosNextButton - 1).getIdGamer() == game.noId))))) {
                    return true;
                } else if ((xPosActualButton == 0 || xPosActualButton == 1) && (xPosActualButton + 1 == xPosNextButton) && (getTableSquare(xPosNextButton + 1, yPosNextButton - 1).getIdGamer() == game.noId)) {
                    return true;
                } else if ((xPosActualButton == game.dimension - 1 || xPosActualButton == game.dimension - 2) && (xPosActualButton - 1 == xPosNextButton) && (getTableSquare(xPosNextButton - 1, yPosNextButton - 1).getIdGamer() == game.noId)) {
                    return true;
                } else {
                    throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
                }
            } else {
                throw new InputsVaciosException("Posicion incorrecta (" + (xPosNextButton + 1) + "," + (yPosNextButton + 1) + ") en jugador 1");
            }
        } else {
            throw new InputsVaciosException("No puede eliminar su propia ficha (" + xPosNextButton + "," + yPosNextButton + ")");
        }
    }

    public JButton simpleCoinKill(JButton acualButton, JButton nextButton) throws InputsVaciosException {
        tableSquare auxTSActual = tablero[game.getXButton(acualButton)][game.getYButton(acualButton)];
        tableSquare auxTSNext = tablero[game.getXButton(nextButton)][game.getYButton(nextButton)];
        tableSquare auxTSFinal = null;
        if (game.getXButton(acualButton) + 1 == game.getXButton(nextButton)) {
            if (auxTSActual.getIdGamer() == game.idGamer1) {
                auxTSFinal = tablero[game.getXButton(nextButton) + 1][game.getYButton(nextButton) + 1];
            } else {
                auxTSFinal = tablero[game.getXButton(nextButton) + 1][game.getYButton(nextButton) - 1];
            }
        } else if (game.getXButton(acualButton) - 1 == game.getXButton(nextButton)) {
            if (auxTSActual.getIdGamer() == game.idGamer1) {
                auxTSFinal = tablero[game.getXButton(nextButton) - 1][game.getYButton(nextButton) + 1];
            } else {
                auxTSFinal = tablero[game.getXButton(nextButton) - 1][game.getYButton(nextButton) - 1];
            }
        }
        coin tempCoin = null;

        if (game.idGamer1 == auxTSActual.idGamer) {
            if (getGamer1Coin(game.getXButton(acualButton), game.getYButton(acualButton)) != null) {
                tempCoin = getGamer1Coin(game.getXButton(acualButton), game.getYButton(acualButton));
                if (!tempCoin.isQueen()) {
                    tempCoin.setxPosicion(game.getXButton(auxTSFinal.getBoton()));
                    tempCoin.setyPosicion(game.getYButton(auxTSFinal.getBoton()));
                    auxTSActual.setIdGamer(game.noId);
                    auxTSActual.getBoton().setIcon(null);
                    auxTSNext.setIdGamer(game.noId);
                    auxTSNext.getBoton().setIcon(null);
                    auxTSFinal.setIdGamer(game.idGamer1);
                    if (tempCoin.getyPosicion() == 7) {
                        tempCoin.setQueen(true);
                        auxTSFinal.getBoton().setIcon(new ImageIcon("src/Images/Ficha4.png"));
                    } else {
                        auxTSFinal.getBoton().setIcon(new ImageIcon("src/Images/Ficha1.png"));
                    }
                    return auxTSActual.getBoton();
                } else {
                    //queen kill
                    return null;
                }
            } else {
                throw new InputsVaciosException("No existe la ficha");
            }

        } else if (game.idGamer2 == auxTSActual.idGamer) {
            if (getGamer2Coin(game.getXButton(acualButton), game.getYButton(acualButton)) != null) {
                tempCoin = getGamer2Coin(game.getXButton(acualButton), game.getYButton(acualButton));
                if (!tempCoin.isQueen()) {
                    tempCoin.setxPosicion(game.getXButton(auxTSFinal.getBoton()));
                    tempCoin.setyPosicion(game.getYButton(auxTSFinal.getBoton()));
                    auxTSActual.setIdGamer(game.noId);
                    auxTSActual.getBoton().setIcon(null);
                    auxTSNext.setIdGamer(game.noId);
                    auxTSNext.getBoton().setIcon(null);
                    auxTSFinal.setIdGamer(game.idGamer2);
                    if (tempCoin.getyPosicion() == 0) {
                        tempCoin.setQueen(true);
                        auxTSFinal.getBoton().setIcon(new ImageIcon("src/Images/Ficha3.png"));
                    } else {
                        auxTSFinal.getBoton().setIcon(new ImageIcon("src/Images/Ficha2.png"));
                    }
                } else {
                    //queen kill
                    return null;
                }
                return auxTSActual.getBoton();
            } else {
                throw new InputsVaciosException("No existe la ficha");
            }
        } else {
            throw new InputsVaciosException("jugada Invalida");
        }
    }

    public void simpleCoinMove(JButton acualButton, JButton nextButton) throws InputsVaciosException {
        tableSquare auxTSActual = tablero[game.getXButton(acualButton)][game.getYButton(acualButton)];
        tableSquare auxTSNext = tablero[game.getXButton(nextButton)][game.getYButton(nextButton)];
        coin tempCoin = null;
        if (game.idGamer1 == auxTSActual.idGamer) {
            if (getGamer1Coin(game.getXButton(acualButton), game.getYButton(acualButton)) != null) {
                tempCoin = getGamer1Coin(game.getXButton(acualButton), game.getYButton(acualButton));
                if (!tempCoin.isQueen()) {
                    tempCoin.setxPosicion(game.getXButton(nextButton));
                    tempCoin.setyPosicion(game.getYButton(nextButton));
                    auxTSActual.setIdGamer(game.noId);
                    auxTSActual.getBoton().setIcon(null);
                    auxTSNext.setIdGamer(game.idGamer1);
                    if (tempCoin.getyPosicion() == 7) {
                        auxTSNext.getBoton().setIcon(new ImageIcon("src/Images/Ficha4.png"));
                        tempCoin.setQueen(true);
                    } else {
                        auxTSNext.getBoton().setIcon(new ImageIcon("src/Images/Ficha1.png"));
                    }
                } else {
                    //to move the queen
                }
            } else {
                throw new InputsVaciosException("No existe la ficha");
            }

        } else if (game.idGamer2 == auxTSActual.idGamer) {
            if (getGamer2Coin(game.getXButton(acualButton), game.getYButton(acualButton)) != null) {
                tempCoin = getGamer2Coin(game.getXButton(acualButton), game.getYButton(acualButton));
                if (!tempCoin.isQueen()) {
                    tempCoin.setxPosicion(game.getXButton(nextButton));
                    tempCoin.setyPosicion(game.getYButton(nextButton));
                    auxTSActual.setIdGamer(game.noId);
                    auxTSActual.getBoton().setIcon(null);
                    auxTSNext.setIdGamer(game.idGamer2);
                    if (tempCoin.getyPosicion() == 0) {
                        auxTSNext.getBoton().setIcon(new ImageIcon("src/Images/Ficha3.png"));
                        tempCoin.setQueen(true);
                    } else {
                        auxTSNext.getBoton().setIcon(new ImageIcon("src/Images/Ficha2.png"));
                    }
                } else {
                    //to move the queen
                }
            } else {
                throw new InputsVaciosException("No existe la ficha");
            }
        } else {
            throw new InputsVaciosException("jugada Invalida");
        }
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public tableSquare[][] getTablero() {
        return tablero;
    }

    public tableSquare getTableSquare(int x, int y) {
        return tablero[x][y];
    }

    public void setTablero(tableSquare[][] tablero) {
        this.tablero = tablero;
    }

    public void addToTablero(tableSquare button, int x, int y) {
        tablero[x][y] = button;
    }

    public LinkedList<coin> getGamer1() {
        return gamer1;
    }

    public coin getGamer1Coin(int x, int y) {
        for (coin gamer : gamer1) {
            if ((gamer.xPosicion == x) && (gamer.yPosicion == y)) {
                return gamer;
            }
        }
        return null;
    }

    public void setGamer1(LinkedList<coin> gamer1) {
        this.gamer1 = gamer1;
    }

    public void addCoinToGamer1(coin gamer1) {
        this.gamer1.add(gamer1);
    }

    public LinkedList<coin> getGamer2() {
        return gamer2;
    }

    public coin getGamer2Coin(int x, int y) {
        for (coin gamer : gamer2) {
            if ((gamer.xPosicion == x) && (gamer.yPosicion == y)) {
                return gamer;
            }
        }
        return null;
    }

    public void setGamer2(LinkedList<coin> gamer2) {
        this.gamer2 = gamer2;
    }

    public void addCoinToGamer2(coin gamer2) {
        this.gamer2.add(gamer2);
    }
}
