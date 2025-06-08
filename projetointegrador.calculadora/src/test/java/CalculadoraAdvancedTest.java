import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import scarlet.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraAdvancedTest {
    private Calculadora calculadora;

    @BeforeEach
    public void inicializa() {
        calculadora = new Calculadora();
        System.out.println("Iniciando Testes Unitários");
    }

    @Test
    @DisplayName("Teste de Soma")
    @Order(1)
    public void soma() {
        double a = 10;
        double b = 20;
        double expected = 30;
        double result = calculadora.soma(a, b);
        System.out.println("Teste de Soma: " + a + " + " + b + " = " + result + " (Esperado: " + expected + ")");
        assertEquals(expected, result, "Erro no teste de soma: esperado " + expected + ", mas obtido " + result);
    }

    @Order(2)
    @ParameterizedTest
    @DisplayName("Teste Múltiplo de Soma")
    @CsvSource({"40, 60, 100", "5, 2 , 7", "5, 1, 6"})
    public void testeSomaMultipla(double a, double b, double expected) {
        double result = calculadora.soma(a, b);
        System.out.println("Soma de " + a + " + " + b + " = " + result + " (Esperado: " + expected + ")");
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);

    }

    @Test
    @DisplayName("Teste de Subtração")
    @Order(3)
    public void subtracao() {
        double a = 10;
        double b = 20;
        double expected = -10;
        double result = calculadora.subtracao(a, b);
        System.out.println("Subtração " + a + " - " + b + " = " + result);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }

    @Test
    @DisplayName("Teste de Multiplicação")
    @Order(4)
    public void multiplicacao() {
        double a = 10;
        double b = 20;
        double expected = 200;
        double result = calculadora.multiplicacao(10, 20);
        System.out.println("Multiplicação " + a + " * " + b + " = " + result);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }

    @Test
    @DisplayName("Teste de Divisão")
    @Order(5)
    public void dividir() {
        double a = 10;
        double b = 20;
        double expected = 0.5;
        double result = calculadora.dividir(a, b);
        System.out.println("Divisão " + a + " ÷ " + b + " = " + result);
        assertEquals(expected, result, "Erro: esperado " + expected + " mas obtido " + result);
    }
}
