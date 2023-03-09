package com.cursoceat.model;

public class Vagon {

	private int numId, cargaMax, cargaActual;
	private String mercancia;
	
	public Vagon() {
	}

	public Vagon(int numId, int cargaMax, int cargaActual, String mercancia) {
		this.numId = numId;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}

	@Override
	public String toString() {
		return "Número de vagón: " + (this.numId + 1) + "\nCarga Actual: " + this.cargaActual + "\nCarga Máxima: " + this.cargaMax +
				"\nMercancia: " + this.mercancia;
	}
	
}
