package ahorcado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jonyasus
 */
public class manejadorAhorcado {

    ArrayList<Character> letrasUsadas;
    ArrayList<Character> letrasDePalabra;
    ArrayList<Character> letrasEnPantalla;
    ArrayList<String> pistas;
    int cantidadVidas;
    int cantidadPistasUsadas = 0;

    public void obtenerPalabraPorLetras(String textoEntrada) {
        for (int i = 0; i < textoEntrada.length(); i++) {
            char letra = textoEntrada.charAt(i);
            letrasDePalabra.add(letra);
        }
    }

    public boolean letraExisteEnPalabra(String letra) {
        char caracter = letra.charAt(0);
        for (int i = 0; i < letrasDePalabra.size(); i++) {
            if (caracter == letrasDePalabra.get(i)) {
                JOptionPane.showMessageDialog(null, "¡Haz acertado!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "¡Haz fallado, sigue intentando!");
                return false;
            }
        }
        return false;
    }

    public void crearPalabra() {
        for (int i = 0; i < letrasDePalabra.size(); i++) {
            letrasEnPantalla.add('_');
        }
    }

    public String mostrarPalabra() {
        String letraString;
        String textoEnPantalla = "";
        for (int i = 0; i < letrasEnPantalla.size(); i++) {
            letraString = String.valueOf(letrasEnPantalla.get(i));
            textoEnPantalla.concat(letraString);
        }
        return textoEnPantalla;
    }
    
    public void indexLetraACambiar(String letra){
        char caracter = letra.charAt(0);
        for (int i = 0; i < letrasDePalabra.size(); i++) {
            if (caracter == letrasDePalabra.get(i)){
            letrasEnPantalla.set(i, caracter);
            } 
        }
    }
    
    public void mostrarPista(){
        int numPista = cantidadPistasUsadas+1;
        JOptionPane.showMessageDialog(null, "Pista #"+numPista+": "+pistas.get(cantidadPistasUsadas));
        cantidadPistasUsadas++;
    }
    
    public void agregarPista(String pista){
        pistas.add(pista);
    }

}
