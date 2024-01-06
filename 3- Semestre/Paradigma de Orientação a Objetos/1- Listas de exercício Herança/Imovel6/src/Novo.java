
public class Novo extends Imovel {
	private double adicional;
	
	public Novo(String endereco, double preco, double adicional) {
		super(endereco,preco);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}
	
	public void imprimirValorAdicional() {
        System.out.println("Adicional: R$" + String.format("%.2f", adicional));
    }
	
	

}
