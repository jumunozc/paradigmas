
public class rectangulo extends FigurasGeometricas  {

	private double ancho;
	private double largo;
	
	
	@Override
	public double calcularArea() {
		return ancho*largo;
	}
	@Override
	public double calcularPerimetro() {
		return (ancho*2)+(largo*2);
	}
	
	
	
	public double getAncho() {
		return this.ancho;
	}
	
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	
	
	
	
	public double getLargo() {
		return this.largo;
	}
	
	
	public void setLargo(double largo) {
		this.largo = largo;
	}
}
