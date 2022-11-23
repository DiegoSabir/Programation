Algoritmo ContarPositivos
	Definir N Como Entero;
	Definir i Como Entero;
	Definir Total Como Entero;
	
	// Para
	Total=0;	
	Para i=1 Hasta 10
		Escribir "Introduzca un número: ";
		Leer N;
		Si N>0
			Total=Total+1;
		FinSi
	FinPara
	
	// Mientras Decremental
	i=10;
	Total=0;
	Mientras i>0
		Escribir "Introduzca un número: ";
		Leer N;
		Si N>0
			Total=Total+1;
		FinSi
		i=i-1;
	FinMientras
	Escribir "Se han introducido ", Total, " números positivos."
FinAlgoritmo
