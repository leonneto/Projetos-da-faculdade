
public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void emitirSom() 
	{
		System.out.println(getNome() + " Emitiu um au au" );
	}
	
	public void correr() 
	{
		System.out.println(getNome() + " Está correndo");
	}

}
