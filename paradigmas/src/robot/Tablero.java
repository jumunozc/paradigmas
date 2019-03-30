package robot;

public class Tablero {
	
	private Movimientos tablero[][];
	private Movimientos jugador;
	
	public Tablero (Movimientos personaje,int tamFilas,int tamCol) {
		this.tablero = new Movimientos[tamFilas][tamCol];
		this.jugador = personaje;
		this.tablero[this.jugador.getPosY()][this.jugador.getPosX()]=this.jugador;
	}
	
	public void movArriba() {
		this.tablero[jugador.getPosY()][jugador.getPosX()]=null;
		jugador.arriba();
		this.tablero[jugador.getPosY()][jugador.getPosX()] = jugador;
	}
	public void movAbajo() {
		this.tablero[jugador.getPosY()][jugador.getPosX()]=null;
		jugador.abajo();
		this.tablero[jugador.getPosY()][jugador.getPosX()] = jugador;
		
	}
	public void movDer() {
		this.tablero[jugador.getPosY()][jugador.getPosX()]=null;
		jugador.derecha();
		this.tablero[jugador.getPosY()][jugador.getPosX()] = jugador;
	}
	public void movIzq() {
		this.tablero[jugador.getPosY()][jugador.getPosX()]=null;
		jugador.izquierda();
		this.tablero[jugador.getPosY()][jugador.getPosX()] = jugador;
	}
	public void mostrar() {
		
		for (int i=0; i < tablero.length; i++) {
			for (int j=0; j< tablero[0].length; j++) {
				Movimientos robot = this.tablero [i][j];
				if (robot != null) {
					System.out.print(robot.getNombre());
				}else {
					System.out.print(".");
				}				
			}
			System.out.println();
		}
	}

}
