
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novo novo = new Novo("Endereço A", 1000, 1000);
		Velho velho = new Velho("Endereço B", 900, 900);
		
		System.out.println("Imóvel Novo:");
		System.out.println(novo);
		novo.imprimirValorAdicional();
		
		System.out.println("Imóvel velho:");
		System.out.println(velho);
		velho.descontar();
	}

}
