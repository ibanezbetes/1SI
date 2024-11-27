Algoritmo MetodoBurbuja
	Definir array,array2,n,aux Como Entero
	Escribir "Cuantos números quieres ordenar?"
	Leer n
	Dimension array[n]
	Dimension array2[n]
	
	Para contadorArray<-1 Hasta n Con Paso 1 Hacer
        array[contadorArray]<- Azar(99)+1
    Fin Para
	Escribir ""
	
	Para contadorArray<-1 Hasta n Con Paso 1 Hacer
		Escribir sin saltar array[contadorArray] " "
	Fin Para

	Para contador2<-1 Hasta n Con Paso 1 Hacer
		
		Para cont<-1 Hasta n-1 Con Paso 1 Hacer
			
			Si array[cont]>array[cont+1] Entonces
				aux<-array[cont]
			SiNo
				aux<-array[cont+1]
			Fin Si
			
		Fin Para
		
		array2[contador2]<-aux
		
		Para contador3<-1 Hasta n-1 Con Paso 1 Hacer
			
			Si array[contador3]=aux Entonces
				
				array[contador3]<-0
				
			FinSi
			
		Fin Para
	
	Fin Para

Para lista<-1 Hasta n Con Paso 1 Hacer
	Escribir sin saltar array2[lista] " "
Fin Para

FinAlgoritmo