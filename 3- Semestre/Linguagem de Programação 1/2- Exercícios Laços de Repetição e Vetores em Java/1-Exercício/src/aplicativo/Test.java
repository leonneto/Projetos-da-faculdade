package aplicativo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nValores do vetor de trás para frente:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }

	}


