
public class Assistente extends Funcionario {
	private int numeroMatricula;
	
	public Assistente(String nome, String cpf, double salario, int numeroMatricula) {
        super(nome, cpf, salario);
        this.numeroMatricula = numeroMatricula;
    }
	

	@Override
	public void exibeDados() {
		// TODO Auto-generated method stub
		super.exibeDados();
		System.out.println("Número da matrícula: " + numeroMatricula);
	}



	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	
	
	

}
