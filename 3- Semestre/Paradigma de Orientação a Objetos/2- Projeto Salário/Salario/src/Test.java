import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Salario sal = new Salario();
		
		System.out.print("Digite o nome do empregado: ");
		String nome = scr.next();
		sal.setNome(nome);
		
		System.out.print("Digite o salário bruto: ");
		double salBruto = scr.nextDouble();
		sal.setSalarioBruto(salBruto);
		
		System.out.print("Digite a taxa: ");
		double tax = scr.nextDouble();
		sal.setTax(tax);
		
		System.out.println();
		System.out.println("Empregado: " + sal);
		
		System.out.println();
		System.out.print("Escolha a porcentagem do aumento: ");
		double porcentagem = scr.nextDouble();
		sal.acrescimoSalario(porcentagem);
		
		System.out.println("Novo salário: " + sal);
		scr.close();
	}

}
