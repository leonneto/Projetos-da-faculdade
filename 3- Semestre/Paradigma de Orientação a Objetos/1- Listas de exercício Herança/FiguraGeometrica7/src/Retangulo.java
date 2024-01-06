
public class Retangulo extends FiguraGeometrica {
	private float lado;
	private float altura;
	
	public Retangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public float getLado() {
		return lado;
	}
	public float getAltura() {
		return altura;
	}
	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lado * altura;
	}
	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (lado + altura);
	}

	
	
	

}
