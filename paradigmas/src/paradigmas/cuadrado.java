package paradigmas;

public class cuadrado extends FiguraGeometrica {
	
	private double lado;

	
	public cuadrado() {
		
		this.setNombre("Cuadrado");
		this.setColor("Rojo");
		this.setMaterial("Papel");
		this.setLado(5);
	}
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void imprimir() {
		
		System.out.println(this.getNombre());
		System.out.println(this.getColor());
		System.out.println(this.getMaterial());
		System.out.println(this.getLado());
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}


}