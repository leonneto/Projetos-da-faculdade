
public class Veiculo {
	private String marca;
	private int ano;
	private String cor;
	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public void locomover() 
	{
		System.out.println("O carro se locomoveu");
	}
	}

