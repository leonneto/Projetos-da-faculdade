package aplicativo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> candidatoA = new ArrayList<>();
        ArrayList<Integer> candidatoB = new ArrayList<>();
        ArrayList<Integer> candidatoC = new ArrayList<>();

        int opcao;

        do {
            exibirOpcoes();
            System.out.print("Entre com o seu voto: ");
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
                    System.out.println("Voto registrado como Nulo. Obrigado por participar!");
                    break;
                case 5:
                    System.out.println("Voto registrado em Branco. Obrigado por participar!");
                    break;
                case 6:
                    System.out.println("Votação encerrada. Resultados:");
                    exibirResultados(candidatoA, candidatoB, candidatoC);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida de 1 a 6.");
            }

        } while (opcao != 6);
        	

        scanner.close();
    }
    private static void exibirOpcoes() {
		System.out.println("Digite uma das opcões abaixo: ");
		System.out.println("1. Candidato A\n"+
				"2. Candidato B\n"+
				"3. Candidato C\n"+
				"4. Nulo\n"+
				"5. Branco\n"+
				"Entre com o seu voto:\n");
		
	}
    
    private static void registrarVoto(ArrayList<Integer> candidato, String nomeCandidato) {
    		candidato.add(1);
    		System.out.println("Voto registrado para o candidato: " + nomeCandidato);
    	
    }
    
    private static void exibirResultados(ArrayList<Integer> candidatoA, ArrayList<Integer> candidatoB, ArrayList<Integer> candidatoC ) {
    	System.out.println("Quantidade de votos para o candidato A: " + candidatoA.size());
    	System.out.println("Quantidade de votos para o candidato B: " + candidatoB.size());
    	System.out.println("Quantidade de votos para o candidato C: " + candidatoC.size());
    	
    	String vencedor = calcularVencedor(candidatoA, candidatoB, candidatoC);
    	 System.out.println("Candidato vencedor: " + vencedor);
    }
    
    private static String calcularVencedor(ArrayList<Integer> candidatoA, ArrayList<Integer> candidatoB, ArrayList<Integer> candidatoC) {
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


