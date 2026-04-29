package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exercício 2: MaiorEntreDoisNumeros")
class MaiorEntreDoisNumerosTest {

    private MaiorEntreDoisNumeros maiorEntreDoisNumeros;

    @BeforeEach
    void setUp() {
        maiorEntreDoisNumeros = new MaiorEntreDoisNumeros();
    }

    @Test
    @DisplayName("Deve retornar o primeiro quando for maior")
    void deveRetornarPrimeiroQuandoMaior() {
        assertEquals(10, maiorEntreDoisNumeros.maiorEntreDoisNumeros(10, 5));
    }

    @Test
    @DisplayName("Deve retornar o segundo quando for maior")
    void deveRetornarSegundoQuandoMaior() {
        assertEquals(20, maiorEntreDoisNumeros.maiorEntreDoisNumeros(3, 20));
    }

    @Test
    @DisplayName("Deve retornar o valor quando os dois forem iguais")
    void deveRetornarValorQuandoIguais() {
        assertEquals(7, maiorEntreDoisNumeros.maiorEntreDoisNumeros(7, 7));
    }

    @Test
    @DisplayName("Deve funcionar com números negativos")
    void deveFuncionarComNumerosNegativos() {
        assertEquals(-1, maiorEntreDoisNumeros.maiorEntreDoisNumeros(-1, -5));
    }

    @Test
    @DisplayName("Deve retornar zero quando for o maior")
    void deveRetornarZeroQuandoForOMaior() {
        assertEquals(0, maiorEntreDoisNumeros.maiorEntreDoisNumeros(0, -3));
    }
}
