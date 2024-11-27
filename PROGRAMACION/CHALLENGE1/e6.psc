Algoritmo e6
	Escribir "Cuantos numeros de la secuencia de Fibonacci quieres ver?"
	Leer num
	aux=1
	aux2<-1
	aux3=1
	Escribir "0"
	Para contador<-1 Hasta num Con Paso 1 Hacer
		Escribir aux3
		aux3=aux+aux2
		aux=aux2
		aux2=aux3
	Fin Para
FinAlgoritmo
