
public class AssistenteTecnico extends Assistente {
	private double bonusSalarial;
	public AssistenteTecnico(String nome, String cpf, double salario, int numeroMatricula, double bonusSalarial) {
		super(nome, cpf, salario, numeroMatricula);
		this.bonusSalarial = bonusSalarial;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void exibeDados() {
		// TODO Auto-generated method stub
		super.exibeDados();
		System.out.println("Bônus salarial: " + bonusSalarial);
	}
	
	

	

}
