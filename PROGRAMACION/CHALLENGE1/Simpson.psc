Algoritmo Simpson
	Definir matriz Como Caracter
	Definir homer Como Caracter
	Definir bart Como Caracter
	Dimension matriz[5,5]
	Para contadorx=1 Hasta 5 Con Paso 1 Hacer 		//Establecer casillas vacias con nombre de "Vacio"
		Para contadory=1 Hasta 5 Con Paso 1 Hacer
			matriz[contadorx, contadory] = "Vacio"
		Fin Para
	Fin Para
	
	Para ContadorHomer=1 Hasta 5 Con Paso 1 Hacer	//Establecer cordenadas aleatorias de Homer
		HomerX = azar(4)+1
		HomerY = azar(4)+1
			Si matriz[HomerX,HomerY] = "Homer" Entonces		//Si la casilla que ha salido está ocupada no se aplica y repetir proceso
				ContadorHomer = ContadorHomer-1
			SiNo
				matriz[HomerX,HomerY] = "Homer"
			Fin Si
	Fin Para
	
	
	
	Para ContadorBart=1 Hasta 1 Con Paso 1 Hacer	//Establecer cordenadas aleatorias de Bart
		BartX = azar(4)+1
		BartY = azar(4)+1
		Si matriz[BartX,BartY] = "Vacio" Entonces		//Si la casilla que ha salido está ocupada no se aplica y repetir proceso
			matriz[BartX,BartY] = "Bart"
		SiNo
			ContadorBart = ContadorBart-1
		Fin Si
	Fin Para
	
	
	
	Para contadorx=1 Hasta 5 Con Paso 1 Hacer
		Para contadory=1 Hasta 5 Con Paso 1 Hacer
			Imprimir Sin Saltar "[" matriz[contadorx,contadory] "] "
		Fin Para
		Imprimir ""
	Fin Para
	
FinAlgoritmo