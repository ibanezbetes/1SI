/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author dgenzor
 */
public class SeleccionFutbol {
        protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

	// constructor, getter y setter
        public SeleccionFutbol() {
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		id = id;
		nombre = nombre;
		apellidos = apellidos;
		edad = edad;
	}
        
	public void Concentrarse() {
		System.out.println("El integrante "+Nombre+" "+"Apellidos"+" viajará a la próxima concentración");
	}

	public void Viajar() {
		System.out.println("El integrante "+Nombre+" "+"Apellidos"+" viajará al próximo partido");
	
	}
}
