package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exercício 3: Fatorial")
class FatorialTest {

    private Fatorial fatorial;

    @BeforeEach
    void setUp() {
        fatorial = new Fatorial();
    }

    @Test
    @DisplayName("0! deve ser 1")
    void fatorialDeZeroDeveSerUm() {
        assertEquals(1, fatorial.fatorial(0));
    }

    @Test
    @DisplayName("1! deve ser 1")
    void fatorialDeUmDeveSerUm() {
        assertEquals(1, fatorial.fatorial(1));
    }

    @Test
    @DisplayName("5! deve ser 120")
    void fatorialDeCincoDeveSer120() {
        assertEquals(120, fatorial.fatorial(5));
    }

    @Test
    @DisplayName("10! deve ser 3628800")
    void fatorialDeDezDeveSer3628800() {
        assertEquals(3628800, fatorial.fatorial(10));
    }

    @Test
    @DisplayName("Deve lançar exceção para número negativo")
    void deveLancarExcecaoParaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> fatorial.fatorial(-1));
    }
}
