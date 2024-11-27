Algoritmo AdivinarNum
    Definir num Como Entero;
	Definir aciertos Como Entero;
	aciertos <- 0
    Dimension num[100];
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        num[cont]<- Azar(99)+1; // Aleatorio. 1 al 100
    Fin Para
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        Escribir Sin Saltar num[cont], ", "
    Fin Para
	Escribir "..................."
	Escribir "Adivina los números"
    Para intentos<-1 Hasta 10 Con Paso 1 Hacer
        Escribir "Intento número: " intentos
        Leer numUsuario
        Para cont1<-1 Hasta 100 Con Paso 1 Hacer
            Si num[cont1] = numUsuario Entonces
				Escribir "Enhorabuena, has acertado! El número " numUsuario " está en el listado."
				Escribir "..............................................................."
				aciertos <- aciertos +1
                numUsuario <- 0;
            Fin Si
			
			//Si num[cont1] <> numUsuario Entonces 
			//Escribir "Vaya, no has acertado! El número " numUsuario " no está en el listado."
			//num[cont1] <- numUsuario
			//FinSi
        Fin Para
    Fin Para
	Escribir "Has acertado " aciertos "/10 números."
FinAlgoritmo
// 100 CASILLAS AISLADAS CON NÚMEROS ALEATORIOS
// 100 números aleatorios DEL 1 AL 100
// ADIVINAR NÚM. DENTRO DEL ARRAY
// El usuario tiene 10 intentos
// Escribe un número y si está
// dentro del array, se sustituye la
//pos por valor
