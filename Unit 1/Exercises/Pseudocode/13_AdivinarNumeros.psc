//Escribir un Pseudocódigo permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
//A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
//además de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el 
//número (además te dice en cuántos intentos lo has acertado), si se llega al límite de intentos te muestra el número que 
//había generado.
SubProceso AdivinarNumero ()	
	Definir N Como Entero;
	Definir X Como Entero;
	Definir try Como Entero;
	X=Aleatorio(1,100);
	Escribir X
	try<-1;
	Hacer
		Escribir "Ingrese un número entre 1 y 100: ";
		Leer N;
		Si N > X
			Escribir "El número introducido es mayor que la solución"
			Escribir "Le quedan ", 10-try, " intentos para adivinar"
		SiNo Si N<X
				Escribir "El número introducido es menor que la solución"
				Escribir "Le quedan ", 10-try, " intentos para adivinar"
			SiNo
				Escribir "Ha acertado la solución!!!"
				Escribir "Ha acertado en ", 10-try, " intentos"
			FinSi
		FinSi
		try=try+1;
	Hasta Que N=X o try>10
	
	Si N=X
		Escribir "Lo has adivinado en ", try-1, " intentos"
	SiNo
		Escribir "El número a adivinar era ", X;
	FinSi
Fin SubProceso

Proceso AdivinarNumeros
	AdivinarNumero();
FinProceso