Algoritmo patataCaliente
// una variable con la pregunta que querais fecha
//al usuario le decimos que empiece la patata caliente 10 intentos
	Definir fechaCorrecta Como Entero
	fechaCorrecta<-1936
	total=0;
	Escribir ".................................................................."
	Escribir "........................LA PATATA CALIENTE........................"
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir ".............................................................."
		Escribir ".............................................................."
		Escribir ".....¿En que año comenzó la Guerra Civil Española? [AAAA]....."
		Escribir ".............................................................."
		Leer fecha
			Si fecha = fechaCorrecta Entonces
			FinSi

			Si fecha < fechaCorrecta Entonces
				Escribir ".............................................................."
				Escribir "..........Casi, pero no. Fue algún año posterior.............."
				Escribir ".............................................................."
			FinSi
			Si fecha > fechaCorrecta Entonces
				Escribir ".............................................................."
				Escribir "...........Casi, pero no. Fue algún año anterior.............."
				Escribir ".............................................................."
			Fin Si
			Si fecha = fechaCorrecta Entonces //en java es ==
					Escribir ".............................................................."
					Escribir "..CORRECTO. La Guerra Civil Española empezó en el año 1936...."
					Escribir ".............................................................."
					contador<-10
				SiNo
					Escribir ".............................................................."
					Escribir "INCORRECTO. La Guerra Civil Española no empezó en el año ", fecha "."
					Escribir ".........................................Te quedan " 10 - contador " intentos."
					Escribir ".............................................................."
					Escribir ".............................................................."
					Escribir ".............................................................."
				Si contador = 10 Entonces
					Escribir "............................."
					Escribir "BOOM! LA PATATA HA EXPLOTADO!"
					Escribir "............................."
				Fin Si

			Fin Si
	Fin Para
FinAlgoritmo
