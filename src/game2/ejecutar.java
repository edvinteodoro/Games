/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2;

/**
 *
 * @author teodoro
 */
public class ejecutar implements Runnable{

    @Override
    public void run() {
        // Se crea el objeto "Juego"
        // Se crea el objeto "Juego"
        Juego elJuego = new Juego();
        //Repite infinitamente (cuando el usuario cierre la ventana, internamente
        //se llamará a System.exit() y se saldrá de este bucle)...
        //while(true) {
            //Cuando se sale de la presentación, empieza la partida
            elJuego.partida();
            //cuando se acaba la partida, se muestra el mensaje de fin de juego
            elJuego.finDeJuego();
        //}

    }
    
}
