package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exercício 5: ContarVogais")
class ContarVogaisTest {

    private ContarVogais contarVogais;

    @BeforeEach
    void setUp() {
        contarVogais = new ContarVogais();
    }

    @Test
    @DisplayName("Deve contar corretamente vogais minúsculas")
    void deveContarVogaisMinusculas() {
        assertEquals(3, contarVogais.contarVogais("banana"));
    }

    @Test
    @DisplayName("Deve contar corretamente vogais maiúsculas")
    void deveContarVogaisMaiusculas() {
        assertEquals(3, contarVogais.contarVogais("BANANA"));
    }

    @Test
    @DisplayName("Deve retornar 0 para string sem vogais")
    void deveRetornarZeroSemVogais() {
        assertEquals(0, contarVogais.contarVogais("bcd"));
    }

    @Test
    @DisplayName("Deve retornar 0 para string vazia")
    void deveRetornarZeroParaStringVazia() {
        assertEquals(0, contarVogais.contarVogais(""));
    }

    @Test
    @DisplayName("Deve ignorar números e símbolos")
    void deveIgnorarNumerosESimbolos() {
        assertEquals(2, contarVogais.contarVogais("h3ll0 w0rld! ai"));
    }

    @Test
    @DisplayName("Deve lançar exceção para texto nulo")
    void deveLancarExcecaoParaNulo() {
        assertThrows(IllegalArgumentException.class, () -> contarVogais.contarVogais(null));
    }
}
