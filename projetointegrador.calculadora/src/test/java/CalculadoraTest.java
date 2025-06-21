import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import scarlet.Calculadora;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Teste Adição - Números Positivos")
    @Order(1)
    void testAddPositive() {
        assertEquals(10, calculadora.soma(5, 5));
        assertEquals(15, calculadora.soma(10, 5));
    }

    @Test
    @DisplayName("Teste Adição - Números Negativos")
    @Order(2)
    void testAddNegative() {
        assertEquals(-8, calculadora.soma(-5, -3));
        assertEquals(-2, calculadora.soma(-1, -1));
    }

    @Test
    @DisplayName("Teste Adição - Números Mistos")
    @Order(3)
    void testAddMixed() {
        assertEquals(0, calculadora.soma(5, -5));
        assertEquals(3, calculadora.soma(-2, 5));
    }

    @Test
    @DisplayName("Teste Adição - Com Zero")
    @Order(4)
    void testAddWithZero() {
        assertEquals(5, calculadora.soma(5, 0));
        assertEquals(0, calculadora.soma(0, 0));
    }

    @Test
    @DisplayName("Teste Subtração - Números Positivos")
    @Order(5)
    void testSubtractPositive() {
        assertEquals(3, calculadora.subtracao(5, 2));
        assertEquals(5, calculadora.subtracao(10, 5));
    }

    @Test
    @DisplayName("Teste Subtração - Números Negativos")
    @Order(6)
    void testSubtractNegative() {
        assertEquals(-3, calculadora.subtracao(-5, -2));
        assertEquals(-1, calculadora.subtracao(-3, -2));
    }

    @Test
    @DisplayName("Teste Subtração - Números Mistos")
    @Order(7)
    void testSubtractMixed() {
        assertEquals(10, calculadora.subtracao(5, -5));
        assertEquals(-7, calculadora.subtracao(-2, 5));
    }

    @Test
    @DisplayName("Teste Subtração - Com Zero")
    @Order(8)
    void testSubtractWithZero() {
        assertEquals(5, calculadora.subtracao(5, 0));
        assertEquals(0, calculadora.subtracao(0, 0));
    }

    @Test
    @DisplayName("Teste Multiplicação - Números Positivos")
    @Order(9)
    void testMultiplyPositive() {
        assertEquals(10, calculadora.multiplicacao(5, 2));
        assertEquals(50, calculadora.multiplicacao(10, 5));
    }

    @Test
    @DisplayName("Teste Multiplicação - Números Negativos")
    @Order(10)
    void testMultiplyNegative() {
        assertEquals(-10, calculadora.multiplicacao(-5, 2));
        assertEquals(10, calculadora.multiplicacao(-5, -2));
    }

    @Test
    @DisplayName("Teste Multiplicação - Números Mistos")
    @Order(11)
    void testMultiplyMixed() {
        assertEquals(-15, calculadora.multiplicacao(5, -3));
        assertEquals(-10, calculadora.multiplicacao(-5, 2));
    }

    @Test
    @DisplayName("Teste Multiplicação - Com Zero")
    @Order(12)
    void testMultiplyWithZero() {
        assertEquals(0, calculadora.multiplicacao(0, 5));
        assertEquals(0, calculadora.multiplicacao(5, 0));
    }

    @Test
    @DisplayName("Teste Divisão - Números Positivos")
    @Order(13)
    void testDividePositive() {
        assertEquals(-2.5, calculadora.dividir(-5, 2), 0.0001);
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0),
                "Erro: deveria lançar ArithmeticException ao dividir por zero!");
    }

}