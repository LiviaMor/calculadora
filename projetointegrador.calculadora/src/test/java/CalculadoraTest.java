import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import scarlet.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void inicializa() {
        calculadora = new Calculadora();
        System.out.println("Testando Calculadora");
    }

    @Test
    @DisplayName("Teste de Soma")
    public void soma() {
        int soma = calculadora.soma(10, 20);
        System.out.println("Soma\n" + soma);
        assertEquals(30, soma);
    }
    @ParameterizedTest
    @DisplayName("Teste Múltiplo")
    @CsvSource ({"10, 20, 30",
            "5, 2 , 7",
            "5, 1, 6 "})
    public void testeSoma (int a, int b, int expected) {
        int result = calculadora.soma(a, b);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Teste de Subtração")
    public void subtracao() {
        int subtracao = calculadora.subtracao(20, 10);
        System.out.println("Subtração\n" + subtracao);
        assertEquals(10, subtracao);
        }
    @Test
    @DisplayName("Teste de Multiplicação")
    public void multiplicacao() {
        int multiplicacao = calculadora.multiplicacao(10, 20);
        System.out.println("Multiplicação\n" + multiplicacao);
        assertEquals(200, multiplicacao);
        }
    @Test
    @DisplayName("Teste de Divisão")
    public void divisao() {
        double divisao = calculadora.multiplicacao(10, 20);
        System.out.println("Divisão\n" + divisao);
        assertEquals(200.0, divisao);
    }
}


