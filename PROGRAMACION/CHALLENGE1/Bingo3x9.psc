Algoritmo Bingo3x9
	ESCRIBIR "BIENVENIDO AL BINGO" 
		Definir Aciertos Como Caracter
		Definir Matriz como entero 
		Dimension Matriz(3,9) 
		Para contadorx=1 hasta 3 Hacer
			para contadory=1 hasta 9 Hacer
				Matriz(contadorx,contadory)=Azar(99)+1
				Escribir Sin Saltar matriz(contadorx,contadory) " "
			FinPara
			Escribir "" 
		FinPara
		
		Definir numusuario como entero 
		Repetir 
			Escribir "Introduce el número que creas que esté en el bingo..."
			Leer numusuario
		Para contadorx=1 hasta 3 Hacer
			para contadory=1 hasta 9 Hacer
				Si Matriz(contadorx,contadory)=numusuario  Entonces
					Acierto="True"
					contadorx=3
					contadory=9
				SiNo
					Aciertos="False"
				FinSi
			FinPara 
		FinPara 
		Si Acierto="True" Entonces
			Escribir "El número que has introducido está en el bingo"
			Escribir "Fin del juego, lo has hecho bien"
		SiNo
			Escribir"Vuelve a intentarlo"
		FinSi
		Hasta Que Acierto="True"
	
	
FinAlgoritmo
