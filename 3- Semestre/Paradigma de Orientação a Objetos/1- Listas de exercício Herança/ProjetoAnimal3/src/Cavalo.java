
public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void emitirSom() 
	{
		System.out.println(getNome() + " relinchou");
		
	}
	
	public void correr()
	{
		System.out.println(getNome() + " Esta galopando");
	}
	
	

}
