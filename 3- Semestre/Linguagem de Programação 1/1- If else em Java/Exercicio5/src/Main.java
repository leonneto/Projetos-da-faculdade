import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*5. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino
2: masculino) de uma pessoa, construa um programa que calcule e imprima seu
peso ideal, utilizando as seguintes fórmulas: - para homens: (72.7 * Altura) – 58
- para mulheres : (62.1 * Altura) – 44.7*/
        Scanner scanner = new Scanner(System.in);
        double calc = 0.0;

        System.out.println("Digite a altura: (Use virgulas)");
        double altura = scanner.nextDouble();

        System.out.println("Homem ou mulher digite (h/m):");
        char option = scanner.next().charAt(0);
        switch (Character.toUpperCase(option)){
            case 'H':
                calc = (72.7 * altura) -58;
                break;

            case'M':
                calc = (62.1 * altura) - 44.7;
                break;

            default:
                System.out.println("Valor inválido.");
                break;
        }

        if (calc > 0) {
            System.out.println("Peso ideal: " + calc + "Kg");
        } else {
            System.out.println("Altura inválida.");
        }

        scanner.close();

    }
}