package paradigmas;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		cuadrado cuadrado = new cuadrado();		
		
		ArrayList<cuadrado> listaCuadrados = new ArrayList<cuadrado>();
		listaCuadrados.add(cuadrado);
		listaCuadrados.get(0);

		for (int i = 0; i < listaCuadrados.size(); i++) {
			
			cuadrado cuadradoTemp = listaCuadrados.get(i);
			
			cuadrado.imprimir();
		}
		

	}
}
