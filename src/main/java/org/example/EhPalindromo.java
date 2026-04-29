package org.example;

/**
 * Exercício 4: Verifica se uma string é um palíndromo.
 */
public class EhPalindromo {

    public boolean ehPalindromo(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("O texto não pode ser nulo.");
        }
        String normalizado = texto.toLowerCase();
        String invertido = new StringBuilder(normalizado).reverse().toString();
        return normalizado.equals(invertido);
    }
}
