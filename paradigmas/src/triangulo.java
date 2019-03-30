
public class triangulo extends FigurasGeometricas  {
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double base;
	private double altura;
	
	
	public triangulo() {
		this.setNombre("Triangulo");
		this.setColor("Naranja");
		this.setMaterial("Papel");
		this.setAltura(4);
		this.setBase(6);
		this.setLado1(3);
		this.setLado2(4);
		this.setLado3(7);
	}
	
	
	@Override
	public double calcularArea() {
		return (base*altura)/2;
	}
	@Override
	public double calcularPerimetro() {
		return lado1+lado2+lado3;
	}

	
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	public double getLado1() {
		return this.lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado2() {
		return this.lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double getLado3() {
		return this.lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public void imprimir() {

		
		System.out.println(this.getNombre());
		System.out.println(this.getColor());
		System.out.println(this.getMaterial());
		System.out.println(this.calcularArea());
		System.out.println(this.calcularPerimetro());
		
	}
	
	
	
}
