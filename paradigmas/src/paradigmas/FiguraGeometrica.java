package paradigmas;

public class FiguraGeometrica {

	private String nombre;
	private String color;
	private String material;
	
	public double calcularArea() {
		return 0.0;
	}
	
	public double calcularPerimetro() {
		return 0.0;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void imprimir() {
		
		System.out.println(this.getNombre());
		System.out.println(this.getColor());
		System.out.println(this.getMaterial());
		
	}
	
	
}
