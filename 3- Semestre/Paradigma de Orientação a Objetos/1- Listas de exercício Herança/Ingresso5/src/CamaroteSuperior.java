
public class CamaroteSuperior extends Vip {
	private double ValorAdicional;
	
	public CamaroteSuperior(double valor,double ValorAdicional , double valorAdicional) {
		super(valor, valorAdicional);
		this.ValorAdicional = ValorAdicional;
		// TODO Auto-generated constructor stub
	}

	public double getValorAdicional() {
		return ValorAdicional;
	}
	
	public double valorTotal()
	{
		return valor + ValorAdicional;
	}
	
	
	
	

}
