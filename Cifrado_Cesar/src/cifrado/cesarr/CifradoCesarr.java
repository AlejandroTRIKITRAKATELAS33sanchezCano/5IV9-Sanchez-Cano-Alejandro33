package cifrado.cesarr;

import javax.swing.JOptionPane;

public class CifradoCesarr {

    public static void main(String[] args) {

        String letras = "ABCDEFGHIJKLNMÑOPQRSTUVWXYZ";
        cifrado obj = new cifrado();
        Boolean ex;
        String texto_decodificado;
        String texto_codificado;

        //CIFRAR
        do {
            texto_decodificado = JOptionPane.showInputDialog("Ingresa la frase para codificar");
        } while (texto_decodificado.length() == 0);

        do {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a recorrer"));
                String txt = obj.codificar(letras, texto_decodificado, num);
                JOptionPane.showMessageDialog(null, "El texto cifrado es: " + txt, "Cifrado Cesar", 2);
                ex = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por que pones una letra si te pedi un numero¿?", "Error", 0);
                ex = true;
            }
        } while (ex == true);

        //DECIFRAR
        do {
            texto_codificado = JOptionPane.showInputDialog("Ingresa la frase para decodificar");
        } while (texto_codificado.length() == 0);

        do {

            try {
                int num_menos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de veces que se recorrieron las letras"));
                String txt2 = obj.decodificar(letras, texto_codificado, num_menos);
                JOptionPane.showMessageDialog(null, "El texto decifrado es: " + txt2, "Cifrado Cesar", 2);
                ex = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por que pones una letra si te pedi un numero¿?", "Error", 0);
                ex = true;
            }
        } while (ex == true);
    }

    //WatterAH
}
