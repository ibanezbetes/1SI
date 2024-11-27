Algoritmo e10
	Escribir "Dame tres numeros y los ordeno de mayor a menor:"
	Leer num1
	Leer num2
	Leer num3
	Si num1>num2 y num1>num3 Entonces
		Escribir num1
		Si num2>num3 Entonces
			Escribir num2
			Escribir num3
		SiNo
			Escribir num3
			Escribir num2
		Fin Si
		Fin Si
		Si num2>num1 y num2>num3 Entonces
			Escribir num2
			Si num1>num3 Entonces
				Escribir num1
				Escribir num3
			SiNo
				Escribir num3
				Escribir num1
			Fin Si
			Fin Si
			Si num3>num1 y num3>num2 Entonces
				Escribir num3
				Si num1>num2 Entonces
					Escribir num1
					Escribir num2
				SiNo
					Escribir num2
					Escribir num1
				Fin Si
			Fin Si
FinAlgoritmo
