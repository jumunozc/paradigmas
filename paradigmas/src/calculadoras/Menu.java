package calculadoras;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);

	public void eleccionMenu() {
		System.out.println("___________________________________");
		System.out.println("Que calculadora desea usar: ");
		System.out.println("1 CALCULADORA BASICA");
		System.out.println("2 CALCULADORA AVANZADA");
		System.out.println("___________________________________");
		System.out.println("Ingrese la opcion: ");
		int opcion = sc.nextInt();

		if(opcion == 1) {
			menu1();
		}else if(opcion == 2) {
			menu2();
		}

	}

	public void menu1() {
		System.out.println("___________________________________");
		System.out.println("Calculo que desea realizar: ");
		System.out.println("1 SUMA");
		System.out.println("2 RESTA");
		System.out.println("3 MULTIPLICACION");
		System.out.println("4 DIVISION");
		System.out.println("5 CAMBIAR LA CALCULADORA");
		System.out.println("6 TERMINAR PROGRAMA");
		System.out.println("___________________________________");
		System.out.println("Ingrese la opcion: ");

		while(sc.hasNext()) {
			int opcion = sc.nextInt();

			if(opcion==1) {
				suma();
			}else if(opcion == 2) {
				resta();
			}else if(opcion == 3) {
				multiplicacion();
			}else if(opcion == 4) {
				division();
			}else if(opcion == 5) {
				eleccionMenu();
			}else if(opcion == 6) {
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			System.out.println("___________________________________");
			System.out.println("Calculo que desea realizar: ");
			System.out.println("1 SUMA");
			System.out.println("2 RESTA");
			System.out.println("3 MULTIPLICACION");
			System.out.println("4 DIVISION");
			System.out.println("5 CAMBIAR LA CALCULADORA");
			System.out.println("6 TERMINAR PROGRAMA");
			System.out.println("___________________________________");
			System.out.println("Ingrese la opcion: ");
		}

	}

	public void menu2(){
		System.out.println("___________________________________");
		System.out.println("Calculo que desea realizar: ");
		System.out.println("1 SUMA");
		System.out.println("2 RESTA");
		System.out.println("3 MULTIPLICACION");
		System.out.println("4 DIVISION");
		System.out.println("5 RAIZ CUADRADA");
		System.out.println("6 MAYOR DE LOS 2");
		System.out.println("7 MENOR DE LOS 2");
		System.out.println("8 CAMBIAR LA CALCULADORA");
		System.out.println("9 TERMINAR PROGRAMA");
		System.out.println("___________________________________");
		System.out.println("Ingrese la opcion: ");
		while(sc.hasNext()) {
			int opcion = sc.nextInt();

			if(opcion==1) {
				suma();
			}else if(opcion == 2) {
				resta();
			}else if(opcion == 3) {
				multiplicacion();
			}else if(opcion == 4) {
				division();
			}
			else if(opcion == 5) {
				raiz();
			}else if(opcion == 6) {
				mayor();
			}else if(opcion == 7) {
				menor();
			}else if(opcion == 8) {
				eleccionMenu();
			}else if(opcion == 9) {
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			System.out.println("___________________________________");
			System.out.println("Calculo que desea realizar: ");
			System.out.println("1 SUMA");
			System.out.println("2 RESTA");
			System.out.println("3 MULTIPLICACION");
			System.out.println("4 DIVISION");
			System.out.println("5 RAIZ CUADRADA");
			System.out.println("6 MAYOR DE LOS 2");
			System.out.println("7 MENOR DE LOS 2");
			System.out.println("8 TERMINAR PROGRAMA");
			System.out.println("___________________________________");
			System.out.println("Ingrese la opcion: ");
		}

	}

	public void suma() {
		calculadoraBasica basica = new calculadoraBasica();
		System.out.println("Primer Dato: ");
		basica.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		basica.setSegundoDato(sc.nextInt());
		System.out.println("SU RESULTADO ES: "+basica.suma());

	}
	public void resta() {
		calculadoraBasica basica = new calculadoraBasica();
		System.out.println("Primer Dato: ");
		basica.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		basica.setSegundoDato(sc.nextInt());
		System.out.println("SU RESULTADO ES: "+basica.resta());

	}
	public void multiplicacion() {
		calculadoraBasica basica = new calculadoraBasica();
		System.out.println("Primer Dato: ");
		basica.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		basica.setSegundoDato(sc.nextInt());
		System.out.println("SU RESULTADO ES: "+basica.multiplicacion());

	}
	public void division() {
		calculadoraBasica basica = new calculadoraBasica();
		System.out.println("Primer Dato: ");
		basica.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		basica.setSegundoDato(sc.nextInt());
		System.out.println("SU RESULTADO ES: "+basica.division());

	}
	public void raiz() {
		calculadoraAvanzada avanzada = new calculadoraAvanzada();
		System.out.println("Primer Dato: ");
		avanzada.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		avanzada.setSegundoDato(sc.nextInt());
		System.out.println("Cual de los datos desea extraer la raiz: ");
		System.out.println("1 PRIMER DATO");
		System.out.println("2 SEGUNDO DATO");
		int opcion = sc.nextInt();

		if(opcion == 1) {
			System.out.println("SU RESULTADO ES: "+avanzada.radicalP());
		}else if(opcion == 2) {
			System.out.println("SU RESULTADO ES: "+avanzada.radicalS());
		}

	}

	public void mayor() {
		calculadoraAvanzada avanzada = new calculadoraAvanzada();
		System.out.println("Primer Dato: ");
		avanzada.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		avanzada.setSegundoDato(sc.nextInt());
		System.out.println("EL NUMERO MAYOR ES: "+avanzada.mayor());
	}
	public void menor() {
		calculadoraAvanzada avanzada = new calculadoraAvanzada();
		System.out.println("Primer Dato: ");
		avanzada.setPrimerDato(sc.nextInt());
		System.out.println("Segundo Dato: ");
		avanzada.setSegundoDato(sc.nextInt());
		System.out.println("EL NUMERO MENOR ES: "+avanzada.menor());
	}

}
