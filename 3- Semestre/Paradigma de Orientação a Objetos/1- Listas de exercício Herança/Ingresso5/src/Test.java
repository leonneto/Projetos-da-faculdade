
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingresso ingressoNormal = new Normal(50.0);
		ingressoNormal.imprimeValor();
		
		Vip ingressoVip = new Vip(60.0, 10.0);
		
		CamaroteInferior camaroteInferior = new CamaroteInferior(70.0, 15.0, "Setor A");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeLocalizacao();
        
  
	}

}
