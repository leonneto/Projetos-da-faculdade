
public class Vip extends Ingresso {
		private double valorAdicional;
	
		public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		// TODO Auto-generated constructor stub
	}
		public double valorIncluido() 
		{
			return valor + valorAdicional;
		}

}
