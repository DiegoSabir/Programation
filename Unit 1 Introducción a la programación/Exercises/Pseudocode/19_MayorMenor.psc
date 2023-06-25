//Algoritmo que imprima el mayor y el menor numero de una serie de numeros introducidos por teclado (-1 para salir)
SubProceso mayorMenorSerie()
	Definir N Como Entero;
	Definir May Como Entero;
	Definir Men Como Entero;
	May=0;
	Men=10000;
	Repetir
		Escribir "Introduzca un numero: ";
		Leer N;
		Si N<>-1
		Si N>May
			May=N
			Sino Si N<Men
					Men=N
				Fin Si
			FinSi	
		FinSi
	Hasta Que N=-1
	Imprimir "El numero mayor es ", May;
	Imprimir "El numero menor es ", Men;
FinSubProceso

Proceso mayorMenor
	mayorMenorSerie() 
FinProceso	