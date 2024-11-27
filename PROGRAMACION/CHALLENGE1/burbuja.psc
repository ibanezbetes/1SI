Algoritmo MétodoBurbuja
	Definir array,array2,array3,n,aux,pos,i,j Como Entero
	aux2=1
	Escribir "¿Cuantos números deseas ordenar?"
	leer n
	Escribir "De acuerdo, se van a generar ", n ," números aleatorios, para despues insertarlos ordenados."
	Dimension array[n]

	Para cont<-1 Hasta n Con Paso 1 Hacer
		array[cont]=azar(99)+1
	Fin Para
	
	para cont<-1 hasta n con paso 1 Hacer
		Escribir sin saltar array[cont] " "
	FinPara
	
	Escribir ""
	Escribir "Los números ordenados son así:"
	
	Para i Desde 1 Hasta n-1 Con Paso 1 Hacer
		Para j desde 1 hasta n-i hacer
			si array[j]>array[j+1]
				aux=array[j]
				array[j] = array[j+1]
				array[j+1]=aux
			FinSi
		FinPara
	Fin Para
	
	para i =1 hasta n Hacer
		
		Escribir array(i)
	FinPara
	
	
FinAlgoritmo
