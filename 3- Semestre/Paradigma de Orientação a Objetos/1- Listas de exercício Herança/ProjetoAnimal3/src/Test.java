
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("Zeus", 4);
		Cavalo cavalo = new Cavalo("Pé de pano", 8);
		Preguica preguica = new Preguica("Sid", 5);
		
		cachorro.correr();
		cachorro.emitirSom();
		System.out.println("---------------------");
		
		cavalo.correr();
		cavalo.emitirSom();
		System.out.println("---------------------");
		
		preguica.subirEmArvore();
		preguica.emitirSom();
		System.out.println("---------------------");
	}

}
