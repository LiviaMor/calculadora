package scarlet;
import scarlet.Calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo à Calculadora! Escolha uma operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando a calculadora. Até mais!");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            try {
                int resultadoInt = 0;
                double resultadoDouble = 0;

                switch (opcao) {
                    case 1 -> resultadoInt = calculadora.soma(num1, num2);
                    case 2 -> resultadoInt = calculadora.subtracao(num1, num2);
                    case 3 -> resultadoInt = calculadora.multiplicacao(num1, num2);
                    case 4 -> resultadoDouble = calculadora.dividir(num1, num2);
                    default -> System.out.println("Opção inválida!");
                }

                if (opcao == 4) {
                    System.out.println("Resultado: " + resultadoDouble);
                } else {
                    System.out.println("Resultado: " + resultadoInt);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}