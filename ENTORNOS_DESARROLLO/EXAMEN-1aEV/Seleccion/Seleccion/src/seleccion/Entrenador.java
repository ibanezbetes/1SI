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
public class Entrenador {
        private String idFederacion;

        public Entrenador() {
		super();
	}

	// getter y setter

	public void dirigirPartido() {
		System.out.println("El entrenador "+Nombre+" "+Apellidos+" dirigirá al próximo partido");	
	}

	public void dirigirEntreno() {
		System.out.println("El entrenador "+Nombre+" "+Apellidos+" dirigirá al próximo entreno");	
	}
}
