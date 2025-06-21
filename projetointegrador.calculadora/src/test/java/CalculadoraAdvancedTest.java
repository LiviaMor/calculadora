import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import scarlet.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraAdvancedTest {
    private Calculadora calculadora;

    @BeforeEach
    void inicializa() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste de Soma")
    @Order(1)
    void testAdd() {
        double a = 10;
        double b = 20;
        double expected = 30;
        double result = calculadora.soma(a, b);
        assertEquals(expected, result, "Erro no teste de soma: esperado " + expected + ", mas obtido " + result);
    }

    @ParameterizedTest
    @DisplayName("Teste Múltiplo de Soma")
    @Order(2)
    @CsvSource({"40, 60, 110", "5, 2 , 7", "5, 1, 6"})
    void testMultipleAdd(double a, double b, double expected) {
        double result = calculadora.soma(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);

    }

    @Test
    @DisplayName("Teste de Subtração")
    @Order(3)
    void testSubtract() {
        double a = 10;
        double b = 20;
        double expected = -10;
        double result = calculadora.subtracao(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }
    @ParameterizedTest
    @DisplayName("Teste Múltiplo de Subtração")
    @Order(4)
    @CsvSource({"20, 10, 10", "10, 5, 5", "5, 10, -5"})
    void testMultipleSubtract(double a, double b, double expected) {
        double result = calculadora.subtracao(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }
    @Test
    @DisplayName("Teste de Multiplicação")
    @Order(5)
    void testMultiply() {
        double valor = 10;
        valor = calculadora.multiplicacao(valor, 2);
        assertEquals(20, valor, "Erro: esperado 20 mas obtido " + valor);
        valor = calculadora.multiplicacao(valor,3 );
        assertEquals(60, valor, "Erro: esperado 60 mas obtido " + valor);
    }

    @ParameterizedTest
    @DisplayName("Teste Múltiplo de Multiplicação")
    @Order(6)
    @CsvSource({"2, 3, 6", "5, 0, 0", "0, 5, 0"})
    void testMultipleMultiply(double a, double b, double expected) {
        double result = calculadora.multiplicacao(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }
    @Test
    @DisplayName("Teste de Divisão")
    @Order(7)
    void testDivide() {
        double a = 10;
        double b = 20;
        double expected = 0.5;
        double result = calculadora.dividir(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }

    @ParameterizedTest
    @DisplayName("Teste Múltiplo de Divisão")
    @Order(8)
    @CsvSource({"20, 10, 2", "10, 5, 2", "5, 2, 2.5"})
    void testMultipleDivide(double a, double b, double expected) {
        double result = calculadora.dividir(a, b);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }

    @Test
    @DisplayName("Teste Divisão por Zero")
    @Order(9)
    void testDivideByZero() {
        double a = 10;
        double b = 0;
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(a, b);
        }, "Erro: deveria lançar ArithmeticException ao dividir por zero!");
    }

    @Test
    @DisplayName("Teste Divisão com Precisão")
    @Order(10)
    void testDividePrecision() {
        double a = 1;
        double b = 3;
        double expected = 0.3333; // Aproximadamente
        double result = calculadora.dividir(a, b);
        assertEquals(expected, result, 0.0001, "Erro: esperado " + expected + " mas obtido " + result);
    }
}