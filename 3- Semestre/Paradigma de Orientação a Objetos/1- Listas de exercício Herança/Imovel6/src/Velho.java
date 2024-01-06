
public class Velho extends Imovel{
	private double desconto;

	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	
	
	public double getDesconto() {
		return desconto;
	}



	public void descontar() 
	{
		System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
	}

}
