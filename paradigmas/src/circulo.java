
public class circulo extends FigurasGeometricas  {

	private double radio;
	
	public circulo() {
		this.setNombre("Circulo");
		this.setColor("Azul");
		this.setMaterial("Tela");
		this.setRadio(5);
	}
	
	@Override
	public double calcularArea() {
		return Math.PI*(radio*radio);
	}
	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void imprimir() {

		
		System.out.println(this.getNombre());
		System.out.println(this.getColor());
		System.out.println(this.getMaterial());
		System.out.println(this.calcularArea());
		System.out.println(this.calcularPerimetro());
		
	}
	
}
