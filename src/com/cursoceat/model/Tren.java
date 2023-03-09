package com.cursoceat.model;

public class Tren {

	Locomotora locomotora;
	Vagon[] vagones;
	Maquinista maquinista;
	private int numVagones;
	
	public Tren() {
	}

	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		this.numVagones = 0;
	}
	
	public void agregarVagon(int cargaMaxima, int cargaActual, String mercancia) {
		if (this.numVagones >= 5)
			System.out.println("No se puede agregar más vagones");
		else {
			Vagon v = new Vagon(numVagones, cargaMaxima, cargaActual, mercancia);  // Creo un vagón
			this.vagones[this.numVagones] = v;
			System.out.println("Hemos enganchado " + (numVagones + 1) + " vagon(es)");
			this.numVagones++;
		}
			
	}

	public void mostrarTren() {
		System.out.println("El tren tiene " + numVagones + " vagones.");
		System.out.println("Los vagones tienen: ");
		for (Vagon vagon : vagones) {
			if (vagon == null)
				break;
			else 
				System.out.println(vagon.toString() + "\nMaquinista: " + maquinista.getNombre() + "\nLa matrícula de la locomotora es: " + locomotora.getMatricula());
		}
	}
	
}
