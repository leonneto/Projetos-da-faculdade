
public class Imovel {
	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getPreco() {
		return preco;
	}
	
	public String toString()
	{
		return "Endereço: " + endereco + "\nPreço: R$" + String.format("%.2f", preco) ;
	}
	
	
	

	
	

}
