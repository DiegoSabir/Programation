//Escribir un Pseudoc�digo permita adivinar un n�mero. La aplicaci�n genera un n�mero aleatorio del 1 al 100. 
//A continuaci�n va pidiendo n�meros y va respondiendo si el n�mero a adivinar es mayor o menor que el introducido,
//adem�s de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el 
//n�mero (adem�s te dice en cu�ntos intentos lo has acertado), si se llega al l�mite de intentos te muestra el n�mero que 
//hab�a generado.
SubProceso AdivinarNumero ()	
	Definir N Como Entero;
	Definir X Como Entero;
	Definir try Como Entero;
	X=Aleatorio(1,100);
	Escribir X
	try<-1;
	Hacer
		Escribir "Ingrese un n�mero entre 1 y 100: ";
		Leer N;
		Si N > X
			Escribir "El n�mero introducido es mayor que la soluci�n"
			Escribir "Le quedan ", 10-try, " intentos para adivinar"
		SiNo Si N<X
				Escribir "El n�mero introducido es menor que la soluci�n"
				Escribir "Le quedan ", 10-try, " intentos para adivinar"
			SiNo
				Escribir "Ha acertado la soluci�n!!!"
				Escribir "Ha acertado en ", 10-try, " intentos"
			FinSi
		FinSi
		try=try+1;
	Hasta Que N=X o try>10
	
	Si N=X
		Escribir "Lo has adivinado en ", try-1, " intentos"
	SiNo
		Escribir "El n�mero a adivinar era ", X;
	FinSi
Fin SubProceso

Proceso AdivinarNumeros
	AdivinarNumero();
FinProceso