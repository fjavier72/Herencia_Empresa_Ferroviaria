package com.cursoceat.model;

public class Mecanico extends Empleado {

	public enum ESPECIALIDAD {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
	private ESPECIALIDAD especialidad;
	
	public Mecanico() {
		super();
	}

	public Mecanico(String nombre, String dni, String telefono, double sueldo, ESPECIALIDAD especialidad ) {
		super(nombre, dni, telefono, sueldo);
		this.especialidad = especialidad;
	}
	
	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Especialidad: " + this.especialidad);
	}

	@Override
	public String toString() {
		return "Mecanico:\nEspecialidad=" + especialidad + "\nNombre=" + nombre + "\nDNI=" + dni + "nTelefono="
				+ telefono + "\nSueldo=" + sueldo;
	}
	
	
	
}
