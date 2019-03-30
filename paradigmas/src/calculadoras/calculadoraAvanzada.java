package calculadoras;

public class calculadoraAvanzada extends calculadoraBasica implements Operaciones{
	
	public calculadoraAvanzada() {
		
	}
	
	
	public double radicalP() {
		return Math.sqrt(getPrimerDato());
	}
	
	public double radicalS() {
		return Math.sqrt(getSegundoDato());
	}


	
	public double mayor() {
		return Math.max(getPrimerDato(), getSegundoDato());
	}


	
	public double menor() {
		return Math.min(getPrimerDato(), getSegundoDato());
	}

}
