Algoritmo MatrizNumAleatorios
	Definir Matriz como entero 
	Definir suma como entero 
	Definir sumatotal como entero 
	 
	sumatotal= 0 
	Dimension Matriz(5,5) // es decir la matriz es de 5x5, 5 filas y 5 columnas la cual la tenemos que rellenar, primero recorremos las filas. 
	Para contadorx=1 hasta 5 Hacer
		para contadory=1 hasta 5 Hacer
			Matriz(contadorx,contadory)=Azar(49)+1
			Escribir Sin Saltar matriz(contadorx,contadory) " "
		FinPara
		Escribir "" 
	FinPara
	
	Para contadorx=1 hasta 5 Hacer
		para contadory=1 hasta 5 Hacer
			Matriz(contadorx,contadory)=Azar(49)+1
			sumatotal<-sumatotal+Matriz(contadorx,contadory) 
		FinPara 
	FinPara 
	Escribir "La suma total es..." sumatotal
	
FinAlgoritmo
