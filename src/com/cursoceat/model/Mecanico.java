package com.cursoceat.model;

public class Mecanico extends Empleado {

	public enum ESPECIALIDAD {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
	public ESPECIALIDAD especialidad;
	
	public Mecanico() {
	}

	public Mecanico(String nombre, String dni, String telefono, double sueldo, ESPECIALIDAD especialidad ) {
		super(nombre, dni, telefono, sueldo);
		this.especialidad = especialidad;
	}
	
}
