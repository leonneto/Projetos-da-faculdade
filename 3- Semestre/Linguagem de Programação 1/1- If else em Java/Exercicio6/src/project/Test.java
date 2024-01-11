package project;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double area = 0.0;
		double base = 0.0;
		double altura = 0.0;
		
		System.out.println("Digite o número de lados de um polígono regular: ");
		int numLados = scanner.nextInt();
		
		
		if(numLados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		}
		else if(numLados > 5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		else if(numLados == 5) {
			System.out.println("PENTÁGONO");
		}
		
		else if(numLados == 4) {
			System.out.println("QUADRADO");
			System.out.println("DIGITE O VALOR DO LADO: ");
			base = scanner.nextDouble();
			
			
			area = base * base;
			System.out.println("ÁREA: "+ area);
		}
		
		else {
			System.out.println("TRIÂNGULO");
			System.out.println("DIGITE O VALOR DA BASE: ");
			base = scanner.nextDouble();
			System.out.println("DIGITE O VALOR DA ALTURA: ");
			altura = scanner.nextDouble();
			
			area = (base * altura)/2;
		}
		
		scanner.close();
	}

}

