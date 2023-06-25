//Leer desde el teclado una serie de números hasta obtener uno inferior a 10
SubProceso Menor10Mientras ()
	Definir N Como Entero;
	Escribir "Introduzca un numero: ";
	Leer N;	
	Mientras (N>=10)
		Escribir "Introduzca menor que 10 para finalizar el programa: ";
		Leer N;	
	FinMientras
Fin SubProceso

SubProceso Menor10Repetir ()
	Definir N Como Entero;
	Repetir
		Escribir "Introduzca menor que 10 para finalizar el programa: ";
		Leer N;		
	Hasta Que (N<10)
Fin SubProceso

Proceso Menor10
	Menor10Repetir();
FinProceso