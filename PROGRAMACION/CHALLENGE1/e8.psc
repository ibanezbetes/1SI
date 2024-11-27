Algoritmo palindromo
	Escribir "Introduce una palabra."
	Leer palabra
	palabra <- Minusculas(palabra)
	long <- Longitud(palabra)
	Para cont<- long Hasta 1 Con paso -1 Hacer
		inver<- Concatenar (inver,Subcadena(palabra,cont,cont))
	FinPara
	Si inver = palabra
			Escribir "Es palindromo."
		SiNo 
			Escribir "No es palindromo."
	FinSi
FinAlgoritmo
