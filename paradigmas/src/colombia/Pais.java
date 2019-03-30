package colombia;

import java.util.ArrayList;

public class Pais {

	private String nombre;

	public ArrayList<Departamentos>departamentos;
	protected ArrayList<Municipios>municipios;

	public Pais() {
		departamentos = new ArrayList<Departamentos>();
		municipios = new ArrayList<Municipios>();
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

	private double xIni;
	private double yIni;
	private double xFin;
	private double yFin;

	public double getxIni() {
		return xIni;
	}

	public void setxIni(double xIni) {
		this.xIni = xIni;
	}

	public double getyIni() {
		return yIni;
	}

	public void setyIni(double yIni) {
		this.yIni = yIni;
	}

	public double getxFin() {
		return xFin;
	}

	public void setxFin(double xFin) {
		this.xFin = xFin;
	}

	public double getyFin() {
		return yFin;
	}

	public void setyFin(double yFin) {
		this.yFin = yFin;
	}
	public double calcularArea() {
		return (xIni - yIni)*(xFin - yFin);
	}


}
