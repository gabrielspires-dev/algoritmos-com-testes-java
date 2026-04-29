package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exercício 1: EhPar")
class EhParTest {

    private EhPar ehPar;

    @BeforeEach
    void setUp() {
        ehPar = new EhPar();
    }

    @Test
    @DisplayName("Deve retornar true para número par positivo")
    void deveRetornarTrueParaParPositivo() {
        assertTrue(ehPar.ehPar(4));
    }

    @Test
    @DisplayName("Deve retornar false para número ímpar positivo")
    void deveRetornarFalseParaImparPositivo() {
        assertFalse(ehPar.ehPar(7));
    }

    @Test
    @DisplayName("Deve retornar true para zero")
    void deveRetornarTrueParaZero() {
        assertTrue(ehPar.ehPar(0));
    }

    @Test
    @DisplayName("Deve retornar true para número par negativo")
    void deveRetornarTrueParaParNegativo() {
        assertTrue(ehPar.ehPar(-2));
    }

    @Test
    @DisplayName("Deve retornar false para número ímpar negativo")
    void deveRetornarFalseParaImparNegativo() {
        assertFalse(ehPar.ehPar(-3));
    }
}
