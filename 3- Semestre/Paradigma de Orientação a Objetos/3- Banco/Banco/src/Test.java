
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria contaDoGuilherme= new ContaBancaria("Guilherme Mendes",30,2023,400.50);
		ContaBancaria contaDoLucas= new ContaBancaria("Lucas",30,202330,1400.50);
	
        contaDoGuilherme.imprimirDados();
        contaDoGuilherme.depositar(100);
        contaDoGuilherme.imprimirDados();
        contaDoGuilherme.sacar(50);
        contaDoGuilherme.imprimirDados();
        contaDoLucas.transferir(contaDoGuilherme,100);
        contaDoGuilherme.imprimirDados();
        contaDoLucas.imprimirDados();
	}

}
