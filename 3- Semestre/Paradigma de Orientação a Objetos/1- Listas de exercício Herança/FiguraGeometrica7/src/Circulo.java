
public class Circulo extends FiguraGeometrica {
	private float raio;
	
	public Circulo(float raio) 
	{
		this.raio = raio;
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * raio * raio);
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (float) (2 * Math.PI * raio);
	}
	
	

}
