import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		Veiculo veic = new Veiculo();
		
		System.out.println("Digite a marca do veículo: ");
		String marca = scaner.next();
		veic.setMarca(marca);
		
		System.out.println("Digite o ano do veículo: ");
		int ano = scaner.nextInt();
		veic.setAno(ano);
		
		System.out.println("Digite a cor do veículo: ");
		String cor = scaner.next();
		veic.setCor(cor);
		
		System.out.println("Marca do veículo : " + marca);
		System.out.println("Ano do veículo : " + ano);
		System.out.println("Cor do veículo : " + cor);
		
		veic.locomover();
		

	}

}
