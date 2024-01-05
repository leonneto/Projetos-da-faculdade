
public class AssistenteAdministrativo extends Assistente {
	private String turno;
	
	public AssistenteAdministrativo(String nome,double adicionalNoturno,String turno,  String cpf, double salario, int numeroMatricula) {
		super(nome, cpf, salario, numeroMatricula);
		this.turno = turno;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void exibeDados() {
		// TODO Auto-generated method stub
		super.exibeDados();
		System.out.println("Turno: "+ turno);
		System.out.println("Adicional Noturno: R$" + calcularAdicionalNoturno());
	}
	
	private double calcularAdicionalNoturno()
	{
		return turno.equalsIgnoreCase("Noite") ? getSalario() * 0.2 : 0.0;
	}
	
	

}
