Algoritmo ArraydeNumerosAleatoriosSuma
	
	Definir num, cont1, sumatotal Como Entero
	Dimension num[5]
	
	sumatotal<-0
	Para cont1<-1 Hasta 5 Con Paso 1 Hacer
		
		num[cont1]<-Azar(4)+1; // Aleatorio. 1 al 5
		escribir num[cont1]
		sumatotal<-sumatotal+num[cont1]
	FinPara
	
	escribir "La suma total es: ", sumatotal
	
FinAlgoritmo
