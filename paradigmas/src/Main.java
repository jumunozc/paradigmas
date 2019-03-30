import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Favor seleccione la opcion deseada:");
		System.out.println("1: Area Triangulo");
		System.out.println("2: Area Cuadrado");
		System.out.println("3: Area Circulo");
		System.out.println("4: Area Rectangulo");
		System.out.println("5: Perimetro Triangulo");
		System.out.println("6: Perimetro Cuadrado");
		System.out.println("7: Perimetro Circulo");
		System.out.println("8: Perimetro Rectangulo");
		System.out.println("Opcion: ");




		cuadrado cuadrado1 = new cuadrado();
		rectangulo rectangulo1 = new rectangulo();
		circulo circulo1 = new circulo();
		triangulo triangulo1 = new triangulo();

		while(sc.hasNext()) {
			int opcion = sc.nextInt();

			if(opcion == 1) {
				System.out.println("Ingrese Base: ");
				triangulo1.setBase(sc.nextDouble());
				System.out.println("Ingrese altura: ");
				triangulo1.setAltura(sc.nextDouble());

				System.out.println(triangulo1.calcularArea());
			}
			if(opcion == 2) {
				System.out.println("Ingrese lado: ");
				cuadrado1.setLado(sc.nextDouble());


				System.out.println(cuadrado1.calcularArea());
			}
			if(opcion == 3) {
				System.out.println("Ingrese radio: ");
				circulo1.setRadio(sc.nextDouble());

				System.out.println(circulo1.calcularArea());
			}
			if(opcion == 4) {
				System.out.println("Ingrese Ancho: ");
				rectangulo1.setAncho(sc.nextDouble());
				System.out.println("Ingrese Largo: ");
				rectangulo1.setLargo(sc.nextDouble());

				System.out.println(rectangulo1.calcularArea());
			}
			if(opcion == 5) {
				System.out.println("Ingrese lado1, lado2 y lado3: ");
				triangulo1.setLado1(sc.nextDouble());
				triangulo1.setLado2(sc.nextDouble());
				triangulo1.setLado3(sc.nextDouble());

				System.out.println(triangulo1.calcularPerimetro());
			}
			if(opcion == 6) {
				System.out.println("Ingrese lado: ");
				cuadrado1.setLado(sc.nextDouble());

				System.out.println(cuadrado1.calcularPerimetro());
			}
			if(opcion == 7) {
				System.out.println("Ingrese radio: ");
				circulo1.setRadio(sc.nextDouble());

				System.out.println(circulo1.calcularPerimetro());
			}
			if(opcion == 8) {
				System.out.println("Ingrese ancho: ");
				rectangulo1.setAncho(sc.nextDouble());
				System.out.println("Ingrese largo: ");
				rectangulo1.setLargo(sc.nextDouble());

				System.out.println(rectangulo1.calcularPerimetro());
			}

			System.out.println("Recopilacion de datos de los cuadrados");
			System.out.println("Ingrese la cantidad de cuadrados: ");
			int cantCaudrados = sc.nextInt();
			cuadrado areas[] = new cuadrado[cantCaudrados];
			double areaTotal = 0;


			for (int i = 0; i < areas.length; i++) {
				System.out.println("Ingrese el lado del cuadrado "+(i+1)+": ");
				cuadrado cuadrado2=new cuadrado();
				cuadrado2.setLado(sc.nextDouble());		
				areaTotal = areaTotal + cuadrado2.calcularArea();
				areas[i]=cuadrado2;


			}
			System.out.println("El area total es: "+areaTotal);
			System.out.println();
			for (int i = 0; i < areas.length; i++) {
				cuadrado temp=areas[i];
				System.out.println("El lado del cuadrado "+(i+1)+" es= "+temp.getLado());
				System.out.println("El area del cuadrado "+(i+1)+" es= "+temp.calcularArea());
				System.out.println("El perimetro del cuadrado "+(i+1)+" es= "+temp.calcularPerimetro());
				System.out.println();
			}


			
			System.out.println("Recopilacion de datos de los Triangulos");
			System.out.println("Ingrese la cantidad de Triangulos: ");
			int cantTriangulos = sc.nextInt();
			triangulo areasTri[] = new triangulo[cantTriangulos];
			double areaTotal2 = 0;


			for (int i = 0; i < areasTri.length; i++) {
				System.out.println("Ingrese la base del Triangulo "+(i+1)+": ");
				triangulo trianguloBaseAltura =new triangulo();
				trianguloBaseAltura.setBase(sc.nextDouble());
				System.out.println("Ingrese la altura del triangulo "+(i+1)+": ");
				trianguloBaseAltura.setAltura(sc.nextDouble());	
				areaTotal2 = areaTotal2 + trianguloBaseAltura.calcularArea();
				areasTri[i]=trianguloBaseAltura;


			}
			System.out.println("El area total es: "+areaTotal2);
			System.out.println();
			for (int i = 0; i < areasTri.length; i++) {
				triangulo temp=areasTri[i];
				System.out.println("La base del triangulo "+(i+1)+" es= "+temp.getBase());
				System.out.println("La altura del triangulo "+(i+1)+" es= "+temp.getAltura());
				System.out.println("El area del triangulo "+(i+1)+" es= "+temp.calcularArea());
				System.out.println();
			}
			System.out.println("Desea continuar: ");
			String respuesta = sc.next();
			if(respuesta.equals("no")) {
				System.out.println("Programa terminado");
				break;
			}
			System.out.println("Ingrese nueva opcion: ");

		}
	}


}

