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
    int cantidadPistasUsadas;

    private void obtenerPalabraPorLetras(String textoEntrada) {
        for (int i = 0; i < textoEntrada.length(); i++) {
            char letra = textoEntrada.charAt(i);
            letrasDePalabra.add(letra);
        }
    }

    private boolean letraExisteEnPalabra(String letra) {
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

    private void crearPalabra() {
        for (int i = 0; i < letrasDePalabra.size(); i++) {
            letrasEnPantalla.add('_');
        }
    }

    private String mostrarPalabra() {
        String letraString;
        String textoEnPantalla = "";
        for (int i = 0; i < letrasEnPantalla.size(); i++) {
            letraString = String.valueOf(letrasEnPantalla.get(i));
            textoEnPantalla.concat(letraString);
        }
        return textoEnPantalla;
    }

}
