Algoritmo e9
	Definir contador, divosores, divisoresCont Como Entero
	Para contador=2 Hasta 100 Con Paso 1 Hacer
		divisoresCont=0
		Para divosores=1 Hasta contador Con Paso 1 Hacer
			Si contador % divosores= 0 Entonces
				divisoresCont=divisoresCont+1
			FinSi
		Fin Para
		Si divisoresCont=2 Entonces
			Imprimir contador
		SiNo
			
		FinSi
	Fin Para
FinAlgoritmo

