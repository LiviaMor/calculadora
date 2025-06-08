import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import scarlet.Calculadora;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTeste {
    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName ("Teste Soma")
    @Order(1)
    void testSoma() {
        assertEquals(10, calculadora.soma(5, 5));
        assertEquals(-3, calculadora.soma(-5, 2));
        assertEquals(0, calculadora.soma(0, 0));
    }

    @Test
    @DisplayName ("Teste Subtração")
    @Order(2)
    void testSubtrai() {
        assertEquals(3, calculadora.subtracao(5, 2));
        assertEquals(-7, calculadora.subtracao(-5, 2));
        assertEquals(0, calculadora.subtracao(0, 0));
    }

    @Test
    @DisplayName ("Teste Multiplicação")
    @Order(3)
    void testMultiplica() {
        assertEquals(10, calculadora.multiplicacao(5, 2));
        assertEquals(-10, calculadora.multiplicacao(-5, 2));
        assertEquals(0, calculadora.multiplicacao(0, 5));
    }

    @Test
    @DisplayName (" Teste Divisao ")
    @Order(4)
    void testDivisao() {
        assertEquals(2.5, calculadora.dividir(5, 2), 0.0001);
        assertEquals(-2.5, calculadora.dividir(-5, 2), 0.0001);
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0),
                "Erro: deveria lançar ArithmeticException ao dividir por zero!");
    }

}