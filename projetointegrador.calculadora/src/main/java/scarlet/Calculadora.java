package scarlet;

public class Calculadora  {
    public int soma(int a, int b) {

        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public double dividir(int a, int b) {
        if (b == 0) {

            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return (double) a / b;
    }
}