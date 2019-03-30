import java.util.Scanner;

public class areas {

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
		while(sc.hasNext()) {
			
			int opcion=sc.nextInt();
			if (opcion==1) {
				System.out.println("ingrese la base y la altura: ");
				int base=sc.nextInt();
				int altura=sc.nextInt();
				aTriangulo(base,altura);
			}
			if (opcion==2) {
				System.out.println("ingrese el lado: ");
				int lado=sc.nextInt();
				aCuadrado(lado);
			}
			if (opcion==3) {
				System.out.println("ingrese el radio: ");
				int radio=sc.nextInt();
				aCirculo(radio);
			}
			if (opcion==4) {
				System.out.println("ingrese la base y la altura: ");
				int base=sc.nextInt();
				int altura=sc.nextInt();
				aRectangulo(base,altura);
			}
			if (opcion==5) {
				System.out.println("ingrese a, b , c: ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				pTriangulo(a,b,c);
			}
			if (opcion==6) {
				System.out.println("ingrese el lado: ");
				int lado=sc.nextInt();
				pCuadrado(lado);
			}
			if (opcion==7) {
				System.out.println("ingrese el radio: ");
				int radio=sc.nextInt();
				pCirculo(radio);
			}
			if (opcion==8) {
				System.out.println("ingrese lado a y lado b: ");
				int ladoA=sc.nextInt();
				int ladoB=sc.nextInt();
				pRectangulo(ladoA,ladoB);
			}
			System.out.println("Ingrese una nueva opcion: ");
		}
	}
	public static void aTriangulo(int base,int altura) {
		int area = (base*altura)/2;
		System.out.println(area);
	}
	public static void aCuadrado (int lado) {
		int area = (lado*lado);
		System.out.println(area);

	}
	public static void aCirculo (int radio) {
		double area = Math.PI*(radio*radio);
		System.out.println(area);
	}
	public static void aRectangulo (int base,int altura) {
		int area = (base*altura);
		System.out.println(area);

	}
	public static void pTriangulo(int a,int b,int c) {
		int perimetro = a+b+c;
		System.out.println(perimetro);
	}
	public static void pCuadrado (int lado) {
		int perimetro = (2*lado)+(2*lado);
		System.out.println(perimetro);

	}
	public static void pCirculo (int radio) {
		double perimetro = 2*Math.PI*(radio);
		System.out.println(perimetro);
	}
	public static void pRectangulo (int ladoA,int ladoB) {
		int perimetro = (2*ladoA)+(2*ladoB);
		System.out.println(perimetro);

	}
}
