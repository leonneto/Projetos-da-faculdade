
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo retangulo = new Retangulo(2.0f, 2.0f);
		Circulo circulo = new Circulo(10.0f);
		
		System.out.println("Retângulo:");
        retangulo.imprimeAreaPerimetro();

        System.out.println("\nCírculo:");
        circulo.imprimeAreaPerimetro();
	}

}
