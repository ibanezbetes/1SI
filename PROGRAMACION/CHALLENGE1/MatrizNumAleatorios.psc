Algoritmo MatrizNumAleatorios
	Definir Matriz como entero 
	Dimension Matriz(5,5) // es decir la matriz es de 5x5, 5 filas y 5 columnas la cual la tenemos que rellenar, primero recorremos las filas. 
	Para contadorx=1 hasta 5 Hacer
		para contadory=1 hasta 5 Hacer
			Matriz(contadorx,contadory)=Azar(49)+1 //DEBEMOS REALIZAR OTROS DOS CONTADORES PARA ESCRIBIR EN PANTALLA EL RESULTADO, UNOS QUE RECORREN TIENEN UNA VARIABLE Y OTROS OTRA PARA ASÍ RECORRER TODO. 
		FinPara
	FinPara
	
	Para posx=1 hasta 5 Hacer
		para posy=1 hasta 5 hacer 
			Escribir Sin Saltar matriz(posx,posy) " "	// ESCRIBIMOS LA MATRIZ EN EL SEGUNDO CONTADOR QUE DEFINIMOS Y PARA QUE ESCRIBA SIN SALTAR LE PONEMOS ESCRIBIR SIN SALTAR, LUEGO FUERA DEL CONTADOR ESCRIBIR " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
