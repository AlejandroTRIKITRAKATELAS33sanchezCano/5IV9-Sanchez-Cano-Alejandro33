package cifrado.cesarr;

public class cifrado {

    public String codificar(String letras, String texto, int num) {

        String texto_codificado = "";
        texto = texto.toUpperCase();
        char caracter;

        for (int i = 0; i < texto.length(); i++) {

            caracter = texto.charAt(i);
            int pos = letras.indexOf(caracter);

            if (pos == -1) {
                texto_codificado += caracter;
            } else {

                int suma = pos + num;

                if (suma > 26) {
                    int exc = suma - 26;    
                    suma = -1 + exc;
                }
                texto_codificado += letras.charAt(suma);
            }

        }

        return texto_codificado;

    }

    public String decodificar(String letras, String texto, int num) {

        String texto_decodificado = "";
        texto = texto.toUpperCase();
        char caracter;

        for (int i = 0; i < texto.length(); i++) {

            caracter = texto.charAt(i);
            int pos = letras.indexOf(caracter);

            if (pos == -1) {
                texto_decodificado += caracter;
            } else {
                int resta = pos - num;

                if (resta < 0) {
                    int exc = resta + 0;
                    resta = 27 + exc;
                }
                texto_decodificado += letras.charAt(resta);
            }
        }

        return texto_decodificado;
    }

    //WatterAH
}
