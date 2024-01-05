
public class CamaroteInferior extends Vip{
	private String localizacaoIngresso;
	public CamaroteInferior(double valor, double valorAdicional, String localizacaoIngresso) {
		super(valor, valorAdicional);
		this.localizacaoIngresso = localizacaoIngresso;
		// TODO Auto-generated constructor stub
	}
	
	public String getLocalizacao()
	{
		return localizacaoIngresso;
	}
	
	public void imprimeLocalizacao()
	{
		System.out.println("Localizacao do Ingresso: " + localizacaoIngresso);
	}


	
	

}
