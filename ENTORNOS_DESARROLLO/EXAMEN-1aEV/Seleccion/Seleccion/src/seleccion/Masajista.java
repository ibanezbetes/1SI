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
public class Masajista extends SeleccionFutbol{
    private String Titulacion;
	private int aniosExperiencia;

        public Masajista() {
		super();
	}

	// getter y setter

	public void darMasaje() {
		System.out.println("El masajista "+"Nombre""+" "+Apellidos+" dará el próximo masaje");	
	}
}
