package main;


import Frames.framePrincipal;
import game2.Juego;


public class run {

    public static void main(String[] args) {
        //iniciar();
        framePrincipal frame= new framePrincipal();
        frame.setVisible(true);
    }
 
public static void iniciar(){
     // Se crea el objeto "Juego"
        // Se crea el objeto "Juego"
        Juego elJuego = new Juego();
        //Repite infinitamente (cuando el usuario cierre la ventana, internamente
        //se llamará a System.exit() y se saldrá de este bucle)...
        //while(false) {
            //Cuando se sale de la presentación, empieza la partida
            elJuego.partida();
            //cuando se acaba la partida, se muestra el mensaje de fin de juego
            elJuego.finDeJuego();
        //}
}    
}
