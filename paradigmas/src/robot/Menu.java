package robot;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner (System.in);

	private Tablero juego;

	public void menuInicial () {

		System.out.println("1.INICIO PARTIDA");
		System.out.println("2.SALIR");
		while (sc.hasNext()) {


			System.out.print("INGRESE UNA OPCION: ");

			int opcion = sc.nextInt();

			if (opcion == 1) {
				menuJuego();
			}else if (opcion == 2) {
				sc.close();
				break;
			}

		}		
	}


	public void menuJuego () {
		/**
		 * Creacion del tablero de juego
		 */
		crearTablero();
		System.out.println("***************MOVIMIENTOS JUGADOR*************");
		System.out.println("1.ARRIBA");
		System.out.println("2.ABAJO");
		System.out.println("3.IZQUIERDA");
		System.out.println("4.DERECHA");
		System.out.println("5.MOSTRAR TABLERO");
		System.out.println("6.SALIR");
		System.out.print("INGRESA TU MOVIMIENTO: ");


		while (sc.hasNext()) {


			int opcion = sc.nextInt();

			if (opcion == 1) {
				juego.movArriba();
			}else if (opcion == 2) {
				juego.movAbajo();
			}else if (opcion == 3) {
				juego.movDer();
			}else if (opcion == 4) {
				juego.movIzq();
			}else if (opcion == 5) {
				juego.mostrar();	
			}else if (opcion == 6) {
				break;
			}
			juego.mostrar();
			System.out.println("***************MOVIMIENTOS JUGADOR*************");
			System.out.println("1.ARRIBA");
			System.out.println("2.ABAJO");
			System.out.println("3.IZQUIERDA");
			System.out.println("4.DERECHA");
			System.out.println("5.MOSTRAR TABLERO");
			System.out.println("6.SALIR");
			System.out.print("INGRESA TU MOVIMIENTO: ");

		}


	}
	public Movimientos crearPersonaje () {
		System.out.println("____CREAR PERSONAJE____");
		System.out.print("Ingrese el nombre del jugador: ");		
		String nombre = sc.next();
		Movimientos nuevoRobot = new Movimientos(nombre);
		return nuevoRobot;

	}


	public void crearTablero () {
		System.out.println("____CREAR TABLERO____");	
		System.out.print("INGRESE LAS FILAS DEL TABLERO: ");		
		int cantFilas = sc.nextInt();
		System.out.print("INGRESE LAS COLUMNAS DEL TABLERO: ");		
		int cantColumnas = sc.nextInt();
		/**
		 * Creacion de la entidad jugador
		 */

		Movimientos jugador = crearPersonaje();
		/**
		 * Creacion del tablero por medio de la clase Tablero
		 */
		Tablero nuevoTablero = new Tablero(jugador, cantFilas, cantColumnas);
		juego =nuevoTablero;  



	}




}
