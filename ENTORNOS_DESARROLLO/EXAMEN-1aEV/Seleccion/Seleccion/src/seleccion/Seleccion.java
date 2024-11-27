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
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        
        Entrenador LEnrique = new Entrenador(1, "Luis", "Enrique", 41, "284EZ89");
	Futbolista DGa = new Futbolista(2, "De", "Gea", 23, 1, "Portero");
        Futbolista SR = new Futbolista(2, "Sergio", "Ramos", 32, 15, "Defensa");
        Futbolista DC = new Futbolista(3, "Dani", "Ceballos", 23, 5, "Centrocampista");
        Futbolista MA = new Futbolista(4, "Marco", "Asensio", 21, 20, "Delantero");
	Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

	integrantes.add(delBosque);
	integrantes.add(DGa);
        integrantes.add(DC);
	integrantes.add(SR);
        integrantes.add(MA);
        integrantes.add(raulMartinez);
        
		// CONCENTRACION
	System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
	for (SeleccionFutbol integrante : integrantes) {
		System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
		integrante.Concentrarse();
	}

		// VIAJE
	System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
	for (SeleccionFutbol integrante : integrantes) {
		System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
		integrante.Viajar();
	}   
                   
    }
    
}
