import java.util.ArrayList;

import paradigmas.cuadrado;

public class CrearFiguras {

	public static void main(String[] args) {

		cuadrado cuadro = new cuadrado();
		triangulo tri = new triangulo();
		circulo circu = new circulo();
		
		ArrayList<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();

		circu.setNombre("Circulo");
		circu.setColor("Negro");
		circu.setMaterial("Madera");
		circu.setRadio(5);
		
		figuras.add(circu);
		
		for (FigurasGeometricas figurasGeometricas : figuras) {
			System.out.println(figuras.get(0));
		}
		

		
		
		
		System.out.println(figuras);
		

	}

}
