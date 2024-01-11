package aplicativo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numeros = new ArrayList<>();
		System.out.println("Digite um número real maior que zero (Ou digite zero para finalizar o programa: )");
		double numero = scanner.nextDouble();
		
		while(numero != 0) {
			if(numero > 0) {
				System.out.println("Digite outro número inteiro: ");
				numero = scanner.nextDouble();
				numeros.add(numero);
			}
			else {
				System.out.println("Finalizando o programa...");
			}
		
		}
		scanner.close();
		
		if(numeros.size() > 0) {
			double soma = 0;
			for(double num: numeros ) {
				soma += num;
			}
			double media = soma / numeros.size();
			System.out.printf("Números: %d Média: %.2f ", numeros.size(), media);
		}
		else {
			System.out.println("Nenhum número encontrado.");
		}
	}

}
