package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exercício 4: EhPalindromo")
class EhPalindromoTest {

    private EhPalindromo ehPalindromo;

    @BeforeEach
    void setUp() {
        ehPalindromo = new EhPalindromo();
    }

    @Test
    @DisplayName("'ovo' deve ser palíndromo")
    void ovoDevePalindromo() {
        assertTrue(ehPalindromo.ehPalindromo("ovo"));
    }

    @Test
    @DisplayName("'ARARA' deve ser palíndromo (case insensitive)")
    void araraDevePalindromo() {
        assertTrue(ehPalindromo.ehPalindromo("ARARA"));
    }

    @Test
    @DisplayName("'Radar' deve ser palíndromo (case insensitive)")
    void radarDevePalindromo() {
        assertTrue(ehPalindromo.ehPalindromo("Radar"));
    }

    @Test
    @DisplayName("'java' não deve ser palíndromo")
    void javaNaoDevePalindromo() {
        assertFalse(ehPalindromo.ehPalindromo("java"));
    }

    @Test
    @DisplayName("String vazia deve ser palíndromo")
    void stringVaziaDevePalindromo() {
        assertTrue(ehPalindromo.ehPalindromo(""));
    }

    @Test
    @DisplayName("String com um único caractere deve ser palíndromo")
    void umCaractereDevePalindromo() {
        assertTrue(ehPalindromo.ehPalindromo("a"));
    }

    @Test
    @DisplayName("Deve lançar exceção para texto nulo")
    void deveLancarExcecaoParaNulo() {
        assertThrows(IllegalArgumentException.class, () -> ehPalindromo.ehPalindromo(null));
    }
}
