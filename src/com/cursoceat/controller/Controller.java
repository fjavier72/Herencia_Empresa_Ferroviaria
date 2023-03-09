package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Empleado;
import com.cursoceat.model.JefeEstacion;
import com.cursoceat.model.Locomotora;
import com.cursoceat.model.Maquinista;
import com.cursoceat.model.Mecanico;
import com.cursoceat.model.Mecanico.ESPECIALIDAD;
import com.cursoceat.model.Tren;

public class Controller {
	
	public static void main(String[] args) {
		
		// Creamos un array y vamos guardando cada objeto
		ArrayList<Empleado> misEmpleados = new ArrayList<Empleado>();
		
		Mecanico unMecanico = new Mecanico("Pepe", "58659658J", "655585745", 1128.27, ESPECIALIDAD.FRENOS);
		misEmpleados.add(unMecanico);
		//unMecanico.mostrarDatos();
		//System.out.println(unMecanico.toString());
		
		Maquinista unMaquinista = new Maquinista("Pedro", "54856895P", "658569845", 1400.25, "Jefe Sección");
		misEmpleados.add(unMaquinista);
		//unMaquinista.mostrarDatos();
		
		JefeEstacion unJefeEstacion = new JefeEstacion("Diego", "78523658A", "652874589", 2050.28);
		misEmpleados.add(unJefeEstacion);
		//unJefeEstacion.mostrarDatos();
		
		JefeEstacion unJefeEstacion2 = new JefeEstacion("Azucena", "45236854Z", "685471023", 2050.28);
		misEmpleados.add(unJefeEstacion2);
		//unJefeEstacion2.mostrarDatos();
		
		for (Empleado empleado : misEmpleados) {
			empleado.mostrarDatos();
			System.out.println();
		}
		
		System.out.println("*************************Desde aquí ejecutamos Maquinaria*************************\n");
		
		Locomotora unaLocomotora = new Locomotora("M45865PO", 4000, 1990, unMecanico);
		Tren miTren = new Tren(unaLocomotora, unMaquinista);
		miTren.agregarVagon(30000, 15000, "Bombillas");
		miTren.agregarVagon(44500, 12000, "Cajas");
		miTren.mostrarTren();
		
	}
		
}
