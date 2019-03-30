package paradigmas;

public class triangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	
	public triangulo() {
		this.setBase(4);
		this.setAltura(5);
		this.setLado1(1);
		this.setLado2(6);
	}
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

}
