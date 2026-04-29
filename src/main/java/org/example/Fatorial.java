package org.example;

/**
 * Exercício 3: Calcula o fatorial de um número.
 */
public class Fatorial {

    public long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }
        if (numero == 0) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
