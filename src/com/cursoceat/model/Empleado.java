package com.cursoceat.model;

public class Empleado {

	private static int id;
	private int idLocal;
	protected String nombre, dni, telefono;
	protected double sueldo;
	
	public Empleado() {
		this.idLocal = asignarID();  // Creamos un constructor y le asignamos un id
	}

	public Empleado(String nombre, String dni, String telefono, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.idLocal = asignarID();  // Constructor con todos los datos y asignamos id
	}
	
	private static int asignarID() {
		return ++id;
	}
	
	public int getId() {
		return idLocal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarDatos() {
		System.out.printf("El id es: %05d\n", idLocal);
		System.out.println("El nombre es: " + this.nombre);
		System.out.println("El DNI es: " + this.dni);
		System.out.println("El teléfono es: " + this.telefono);
		System.out.println("El sueldo es: " + this.sueldo);
	}
}
