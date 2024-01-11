package aplicativo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> candidatoA = new ArrayList<>();
		ArrayList<Integer> candidatoB = new ArrayList<>();
		ArrayList<Integer> candidatoC = new ArrayList<>();
		
		System.out.println("Digite a opcao de candidato para depositar o voto: ");
		int opcao;
		
		do {
			exibirMenu();
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				registrarVoto(candidatoA, "Candidato A");
				break;
			case 2:
				registrarVoto(candidatoB, "Candidato B");
				break;
			case 3:
				registrarVoto(candidatoC, "Candidato C");
				break;
			case 4:
				System.out.println("Voto registrado como nulo. Obrigado por votar.");
				break;
				
			case 5:
				System.out.println("Voto anulado com sucesso.");
				break;
				
			case 6:
				 System.out.println("Votação encerrada. Resultados:");
                 exibirResultado(candidatoA, candidatoB, candidatoC);
			default:
				break;
			}
			
		}while(opcao != 6);
		
		scanner.close();
		
	

	}

	private static void exibirMenu() {
		System.out.println("1. Candidato A\n "+ "2. Candidato B\n" + "3. Candidato C\n" + "4. Nulo\n" + "5. Branco\n" + "6. Encerrar votação\n");

	}
	
	private static void registrarVoto(ArrayList<Integer> candidato, String nomeCandidato){
		candidato.add(1);
		   System.out.println("Voto registrado para " + nomeCandidato + ". Obrigado por votar!");
	} 
	
	private static void exibirResultado(ArrayList<Integer> candidatoA, ArrayList<Integer> candidatoB, ArrayList<Integer> candidatoC) {
		 	System.out.println("Votos para Candidato A: " + candidatoA.size());
	        System.out.println("Votos para Candidato B: " + candidatoB.size());
	        System.out.println("Votos para Candidato C: " + candidatoC.size());

	        String vencedor = calcularVencedor(candidatoA, candidatoB, candidatoC);
	        System.out.println("Candidato vencedor: " + vencedor);
	}

	private static String calcularVencedor(ArrayList<Integer> candidatoA, ArrayList<Integer> candidatoB,
			ArrayList<Integer> candidatoC) {
		// TODO Auto-generated method stub
		int votosA = candidatoA.size();
        int votosB = candidatoB.size();
        int votosC = candidatoC.size();

        if (votosA > votosB && votosA > votosC) {
            return "Candidato A";
        } else if (votosB > votosA && votosB > votosC) {
            return "Candidato B";
        } else if (votosC > votosA && votosC > votosB) {
            return "Candidato C";
        } else {
            return "Empate ou nenhum candidato recebeu votos suficientes para vencer.";
        }
		
	}
	

}
