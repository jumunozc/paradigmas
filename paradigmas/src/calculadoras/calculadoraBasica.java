package calculadoras;

public class calculadoraBasica implements Operaciones{
	
	private int primerDato;
	private int segundoDato;
	
	public calculadoraBasica(){
		
	}

	
	public double suma() {
		return primerDato+segundoDato;
	}

	
	public double resta() {
		return  primerDato-segundoDato;
	}

	
	public double multiplicacion() {
		return  primerDato*segundoDato;
	}

	
	public double division() {
		return  primerDato/segundoDato;
	}


	public int getPrimerDato() {
		return primerDato;
	}


	public void setPrimerDato(int primerDato) {
		this.primerDato = primerDato;
	}


	public int getSegundoDato() {
		return segundoDato;
	}


	public void setSegundoDato(int segundoDato) {
		this.segundoDato = segundoDato;
	}


	
	public double radicalP() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public double mayor() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public double menor() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public double radicalS() {
		
		return 0;
	}



}
