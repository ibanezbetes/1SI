Algoritmo ArregloArrays
	//100 casillas con nºs random
	Definir c1 Como Entero
	Definir c2 Como Entero
	Definir c3 Como Entero
	Definir c4 Como Entero
	// ...
	//GRUPO DE CELDAS DE MEMORIA[ESPACIO QUE LE DAS]
	//GRUPO DE CELDAS DE MEMORIA[POSICION] <-- PARA REFERIRSE
	Definir num Como Entero;
	Dimension num[100];
	Dimension usu[10]
	num[1] = Azar(100); //nº random entre 1 y 10
	num[2] = Azar(100); //nº random entre 1 y 10
	num[3] = Azar(100); //nº random entre 1 y 10
	num[4] = Azar(100); //nº random entre 1 y 100000
	//.........
	//hasta N
	num[100] = Azar(100); //  Num. aleato. 1 y 100
	
	Para cont<-1 Hasta 100 Con Paso 1 Hacer
		num[cont] <- Azar(100); // Random 1 al 100
	FinPara
	
	Para cont<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "El número ", cont," es " num[cont] // Random 1 al 100
	FinPara
	
	Para cont<-1 Hasta 100 Con Paso 1 Hacer
		Si num[cont] = 0 Entonces
			num[cont] <- 1
		Fin Si
	FinPara
	
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Dime el numero " contador "."
		Leer usu[contador]
		Para aux<-num[1] Hasta num[100] Con Paso num[1] Hacer
			Si usu[contador] = comp Entonces
				Imprimir "HAS ACERTADO! El número " usu[contador] " está en la posición" num[x]
			SiNo
				Imprimir "HAS FALLADO! El número " usu[contador] " no está en ninguna posición"
				Fin Si
			FinPara
			
	FinPara
	
	
	
FinAlgoritmo
