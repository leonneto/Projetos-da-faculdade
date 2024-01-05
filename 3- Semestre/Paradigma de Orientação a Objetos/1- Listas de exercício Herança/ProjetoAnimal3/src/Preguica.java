
public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void emitirSom()
	{
		System.out.println(getNome() + " Emitiu um som");
	}
	
	public void subirEmArvore()
	{
		System.out.println(getNome() + " Está subino em uma árvore.");
	}

}
