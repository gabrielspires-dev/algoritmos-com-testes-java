package org.example;

/**
 * Exercício 5: Conta o número de vogais em uma string.
 */
public class ContarVogais {

    public int contarVogais(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("O texto não pode ser nulo.");
        }
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
