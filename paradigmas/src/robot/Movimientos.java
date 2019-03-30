package robot;

public class Movimientos {
	
	private String nombre;
	private int posX;
	private int posY;
	
	public Movimientos(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * Creacion de los movimientos que el personaje tendra
	 */
	
	public void arriba() {
		posY = posY - 1;
	}
	public void abajo() {
		posY = posY +1;
	}
	public void derecha() {
		posX = posX - 1;
	}
	public void izquierda() {
		posX = posX + 1;
	}
	
	public Movimientos(String nombre,int posX,int posY) {
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
	}

}
