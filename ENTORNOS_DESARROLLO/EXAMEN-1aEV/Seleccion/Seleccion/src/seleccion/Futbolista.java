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
public class Futbolista extends MiembroSeleccionFutbol{
        private int dorsal;
	private String demarcacion;

        public Futbolista() {
		super();
	}

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		dorsal = dorsal;
		demarcacion = demarcacion;
	}
// getter y setter

	public void jugarPartido() {
          System.out.println("El futbolista "+Nombre+" "+Apellidos+" jugará el próximo partido");		
	}

	public void entrenar() {
		System.out.println("El futbolista "+Nombre+" "+Apellidos+" asistirá al próximo entreno");
	}
}
