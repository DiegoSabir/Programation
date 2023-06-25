//Escribir un Pseudocódigo que calcule la suma de los N primeros números enteros positivos
Algoritmo sumaEnteros
	Definir N Como Entero;
	Definir i Como Entero;
	Definir Suma Como Entero;
	
	Escribir "Introduzca un número:";
	Leer N;
	
	// MIENTRAS
	i=N;
	Suma<-0;
	Mientras i>0 Hacer
		Suma=suma+i;
		i=i-1;
	FinMientras
	
	// REPETIR DECREMENTAL
	i=N;
	Suma=0;
	Repetir
		Suma=Suma+i;
		i=i-1;
	Hasta Que i=0;
	
	// REPETIR INCREMENTAL
	aux=0;
	suma=0;
	Repetir
		Suma=Suma+i;
		i=i+1;
	Hasta Que i>N;
	
	// PARA
	Suma=0;
	Para i=1 Hasta N Con Paso 1 Hacer
		Suma=Suma+i;
	FinPara
	Imprimir Suma;
FinAlgoritmo
