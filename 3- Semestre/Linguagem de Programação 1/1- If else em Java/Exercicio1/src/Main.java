import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Escreva um programa para ler 2 valores (considere que não serão informados
//                valores iguais) e escrever o maior deles
        Scanner scanner = new Scanner(System.in);
        int val1, val2;

        System.out.println("Digite o primeiro valor inteiro: ");
        val1 = scanner.nextInt();

        do {
            System.out.println("Digite o segundo valor diferente do primeiro: ");
            val2 = scanner.nextInt();
        }while (val1 == val2);

        int max = (val1 > val2) ? val1 : val2;
        System.out.println("O maior valor é: " + max);
    }


}