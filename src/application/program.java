package application;

import java.io.IOException;
import java.util.Scanner;

import entities.Calculator;

public class program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        double num;
        

        int operation = -1;
        do {
            calc.clear();
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Bem vindo ao calculator");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println();

            System.out.println("Qual operação matemática deseja realizar? ");
            System.out.println("Raiz quadrada [1]");
            System.out.println("Raiz cúbica [2]");
            System.out.println("Formúa de baskara [3]");
            System.out.println("Porcentagem [4]");
            System.out.println("Teorema de pitágoras [5]");
            System.out.println("Converter Cº em F [6]");
            System.out.println("Fatorial de um número [7]");
            System.out.println("Sair [0]");
            System.out.print("Digite a opção desejada: ");
            operation = sc.nextInt();
            System.out.println("\n");
            switch (operation) {
                case 1:
                    calc.clear();
                    System.out.print("Digite o número da operação: ");
                    num = sc.nextInt();
                    System.out.println("\n");
                    System.out.println("A raiz quadrada de " + num + " é: " + calc.raizQuadrada(num));
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 2:
                    calc.clear();
                    System.out.println("Digite o número da operação: ");
                    num = sc.nextInt();
                    System.out.println("\n");
                    System.out.println("A raiz cubica de " + num + " é: " + calc.raizCubica(num));
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 3:
                    calc.clear();
                    System.out.println("Digite os valores:");
                    System.out.print("a: ");
                    double a = sc.nextDouble();
                    System.out.print("b: ");
                    double b = sc.nextDouble();
                    System.out.print("c: ");
                    double c = sc.nextDouble();
                    calc.baskara(a, b, c);
                    System.out.println("\n");
                    System.out.println("A resolução é:");
                    System.out.printf("X1 = %.2f%n", calc.x1);
                    System.out.printf("X2 = %.2f%n", calc.x2);
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 4:
                    calc.clear();
                    System.out.println("Preencha os campos");
                    System.out.print("De qual número deseja obter a porcetagem? ");
                    num = sc.nextDouble();
                    System.out.print("Quantos % você quer obter de " + num + ": ");
                    double percent = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println(percent + "% de " + num + " é: " + calc.porcentagem(num, percent));
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 5:
                    calc.clear();
                    System.out.println("Digite os valores:");
                    System.out.print("a:");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b = sc.nextDouble();
                    calc.teoremaPitagoras(a, b);
                    System.out.println("\n");
                    System.out.println("O valor de c é: " + calc.res + "cm");
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 6:
                    calc.clear();
                    System.out.print("Digite o valor da temperatuda em graus C°: ");
                    c = sc.nextDouble();
                    System.out.println("\n");
                    System.out.printf("O valor de " + c + "º Celcius em Fahrenheit é %.1f%n", calc.convert(c));
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                case 7:
                    calc.clear();
                    System.out.print("Digite o número para calcular o fatorial: ");
                    num = sc.nextDouble();
                    System.out.println("\n");
                    System.out.printf("O fatorial de %.2f é: %.1f%n", num, calc.fatorialInterativo(num));
                    System.out.println("\n");
                    System.out.print("\nVoltar [0]: ");
                    sc.nextInt();
                    break;

                default:
                    break;
            }
        } while (operation != 0);

        sc.close();
    }
}
