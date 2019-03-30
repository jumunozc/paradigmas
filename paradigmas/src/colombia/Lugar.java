package colombia;

import java.util.Scanner;



public class Lugar extends Pais {
	Scanner sc = new Scanner(System.in);

	private String nombre;



	public Lugar() {

	}


	public void datosGenerales() {
		System.out.println("NOMBRE: "+this.nombre);

	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void menu() {

		System.out.println("Menu");
		System.out.println("1: Ingresar datos");
		System.out.println("2: Terminar Programa");
		System.out.println("Ingrese una Opcion: ");

		while(sc.hasNext()) {
			int opcion = sc.nextInt();

			if(opcion == 1) {
				Pais pais = new Pais();
				Departamentos depart = new Departamentos();
				Municipios munic = new Municipios();

				System.out.println("Ingrese el Pais: ");
				pais.setNombre(sc.next());
				System.out.println("Ingrese cantidad de Departamentos: ");
				int cantDep = sc.nextInt();
				for (int i = 0; i < cantDep; i++) {
					System.out.println("Ingrese el nombre del Departamento: ");
					depart.setNombre(sc.next());

					departamentos.add(depart);
					System.out.println("Ingrese cantidad de Municipios: ");
					int cantMuni = sc.nextInt();

					for (int j = 0; j < cantMuni; j++) {
						System.out.println("Ingrese nombre del Municipio: ");
						munic.setNombre(sc.next());

						System.out.println("Ingrese Poblacion: ");
						munic.setPoblacion(sc.nextInt());

						System.out.println("Ingrese X Inicial: ");
						munic.setxIni(sc.nextDouble());

						System.out.println("Ingrese Y Inicial: ");
						munic.setyIni(sc.nextDouble());

						System.out.println("Ingrese X Final: ");
						munic.setxFin(sc.nextDouble());

						System.out.println("Ingrese el Y Final: ");
						munic.setyFin(sc.nextDouble());

						municipios.add(munic);
					}

				}
			}
			if(opcion == 2) {
				System.out.println("Programa Terminado");
				break;
			}
			System.out.println("Desea Continuar: ");
			String resp = sc.next();
			if(resp.equals("no")) {
				System.out.println("Programa Terminado");
				break;
			}
			System.out.println("Menu");
			System.out.println("1: Ingresar datos");
			System.out.println("2: Terminar Programa");
			System.out.println("Ingrese una Opcion: ");

		}
	}

	public void mostrarDatos() {
		System.out.println("RECOPILACION DE DATOS");
		for (Departamentos deparTemp : departamentos) {
			if(deparTemp instanceof Departamentos) {
				System.out.println("____________DEPARTAMENTO______________");
			}
			deparTemp.datosGenerales();
		}
		for (Municipios muni : municipios) {
			if(muni instanceof Municipios) {
				System.out.println("____________MUNICIPIO______________");
			}
			int pobTotal = 0;
			int areaTot = 0 ;
			muni.datosGenerales();
			System.out.println("POBLACION: "+muni.getPoblacion());
			System.out.println("AREA: "+muni.calcularArea());
			pobTotal = pobTotal + muni.getPoblacion();
			areaTot = (int) (areaTot + muni.calcularArea());
			System.out.println();
			System.out.println("POBLACION TOTAL: "+pobTotal);
			System.out.println("AREA TOTAL: "+areaTot);
		}

	}

}
