// Leer desde el teclado una serie de números hasta obtener uno inferior a 10
Algoritmo Menor10
	Definir N Como Entero;
	Escribir "Introduzca un numero: ";
	Leer N;
	
	// Mientras
	Mientras N>=10 Hacer
		Escribir "Introduzca menor que 10 para finalizar el programa: ";
		Leer N;
	FinMientras
	
	// Repetir
	Repetir 
		Escribir "Introduzca menor que 10 para finalizar el programa: ";
		Leer N;
	Hasta Que N<10;
FinAlgoritmo