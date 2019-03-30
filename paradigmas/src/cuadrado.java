
public class cuadrado extends FigurasGeometricas {
	
	private double lado;
	
	
	
	public cuadrado() {
		this.setNombre("");
		this.setColor("");
		this.setMaterial("");
		this.setLado(0);
		
		
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	
	public double getLado() {
		return this.lado;
		
	}
	
	public void setLado(double lado) {
		
		this.lado = lado;
	}
	
	public void imprimir() {

		System.out.println(this.getNombre());
		System.out.println(this.getColor());
		System.out.println(this.getMaterial());
		System.out.println(this.calcularArea());
		System.out.println(this.calcularPerimetro());
		
	}
	


}
