Algoritmo ArraydeNumerosAleatorios
	
    Definir num Como Entero
    Definir lista Como Entero
	Definir indiceAleatorio Como Entero
	Definir temp Como Entero
    Dimension lista[5]
	Sumatotal=0
	
    // Inicializamos la lista con los números del 1 al 5
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        lista[num] <- num	//En cada iteración, asignamos el valor de num a la posición num en la lista. La lista contendrá [1, 2, 3, 4, 5].
    Fin Para
	
    // Barajamos la lista
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        indiceAleatorio <- Aleatorio(1, 5)	//Genera un número aleatorio entre 1 y 5. Este número representa una posición en la lista.	//Intercambiamos valores->
        temp <- lista[num]	//Guarda el valor actual de la lista en la posición num en una variable temporal temp
        lista[num] <- lista[indiceAleatorio]	//Asigna el valor de la lista en la posición indiceAleatorio a la posición num.
        lista[indiceAleatorio] <- temp	//Asigna el valor guardado en temp a la posición indiceAleatorio
    Fin Para
	
    // Escribimos los números barajados
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir lista[num]	//Escribimos la lista de forma aleatoria y sin repeticiones
		Sumatotal=Sumatotal+lista[num]
    Fin Para
	
	Escribir "Suma total:", Sumatotal
	
	
FinAlgoritmo
