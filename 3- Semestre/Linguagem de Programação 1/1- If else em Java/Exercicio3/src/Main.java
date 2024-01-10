import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro inteiro:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Digite o segundo inteiro (diferente do primeiro):");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro inteiro (diferente dos dois anteriores):");
        int c = scanner.nextInt();


        if (a == b || a == c || b == c) {
            System.out.println("Por favor, digite três inteiros distintos.");
            return;
        }


        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }


        System.out.println("Inteiros em ordem crescente: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}