package scarlet;

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
            double num1= scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            try {
                double resultado = 0;

                switch (opcao) {
                    case 1 -> resultado = calculadora.soma(num1,num2);
                    case 2 -> resultado = calculadora.subtracao(num1, num2);
                    case 3 -> resultado = calculadora.multiplicacao(num1, num2);
                    case 4 -> resultado  = calculadora.dividir(num1, num2);
                    default -> System.out.println("Opção inválida!");
                }

                System.out.println("Resultado: " + resultado);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
