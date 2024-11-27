Algoritmo mosca
	Dimension matriz[10,10]
	posicionx <- Azar (10)
	posiciony <- Azar (10)
	
	Repetir
	Escribir "Dime la posición X"
	Leer usuariox
	Escribir "Dime la posición Y"
	Leer usuarioy
	
	Si (usuariox<>posicionx) y (usuarioy<>posiciony) Entonces
		Si usuarioy<posiciony
			Escribir "La posición Y está mas a la derecha."
			Si usuarioy>posiciony
				Escribir "La posición Y está mas a la izquierda."
				Si usuariox<posicionx
					Escribir "La posición X está mas a la derecha."
					Si usuariox>posicionx
						Escribir "La posición X está mas a la izquierda."
					FinSi
			FinSi
		FinSi
		
		
		FinSi
		
	Fin Si
	
	Si (usuariox=posicionx) y (usuarioy<>posiciony) Entonces
		Si usuarioy<posiciony
			Escribir "Has acertado la posición X pero la posición Y está mas a la derecha."
			Si usuarioy>posiciony
				Escribir "Has acertado la posición X pero la posición Y está mas a la izquierda."
			FinSi
		FinSi
	Fin Si
	
	Si (usuariox<>posicionx) y (usuarioy=posiciony) Entonces
		Si usuariox<posicionx
			Escribir "Has acertado la posición Y pero la posición X está mas a la derecha."
				Si usuariox>posicionx
					Escribir "Has acertado la posición Y pero la posición X está mas a la izquierda."
		FinSi
				FinSi
	Fin Si
Hasta Que (usuariox=posicionx) y (usuarioy=posiciony)
Escribir "HAS ACERTADO LAS COORDENADAS DE LA MOSCA."
FinAlgoritmo
