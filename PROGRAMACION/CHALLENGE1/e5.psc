Algoritmo e5
	Definir aux Como Entero
	Definir suma Como Entero
	suma=0
	Escribir "Dame un numero de cuantos numeros quieres poner y te hago un promedio"
	Leer aux
	Para contador<-1 Hasta aux Con Paso 1 Hacer
		Escribir "Dame un numero"
		Leer num1
		suma=num1+suma
	Fin Para
	Escribir "El promedio es " suma/aux
	
FinAlgoritmo
