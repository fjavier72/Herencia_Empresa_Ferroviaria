package com.cursoceat.model;

public class Locomotora {

	String matricula;
	int potencia, anhoFrabricacion;
	Mecanico responsable;
	
	public Locomotora() {
	}

	public Locomotora(String matricula, int potencia, int anhoFrabricacion, Mecanico responsable) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anhoFrabricacion = anhoFrabricacion;
		this.responsable = responsable;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnhoFrabricacion() {
		return anhoFrabricacion;
	}

	public void setAnhoFrabricacion(int anhoFrabricacion) {
		this.anhoFrabricacion = anhoFrabricacion;
	}

	public Mecanico getResponsable() {
		return responsable;
	}

	public void setResponsable(Mecanico responsable) {
		this.responsable = responsable;
	}
	
}
