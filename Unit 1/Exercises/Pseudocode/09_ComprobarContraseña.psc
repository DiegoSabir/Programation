//Escribir un Pseudocodigo y elabora el ordinograma del algoritmo que pida una contrase�a (3 intentos maximo hasta que la clave sea 111, 222 o 333.
Proceso  ComprobarContrase�a
	Imprimir Comprobar_Contrase�a()
FinProceso

SubProceso Resultado=Comprobar_Contrase�a()
	Definir PW Como Entero;
	Definir TRY Como Entero;
	TRY=3	
	Hacer
		Escribir "Introduzca la contrase�a: ";
		Leer PW;
		TRY=TRY-1;
	Hasta Que PW=333 o PW=222 o PW=111 o TRY=0
	
	Si TRY=0 y TRY<>333 y TRY<>222 y PW<>111
		Resultado="La cuenta ha sido bloqueada"
	SiNo
		Resultado="Contrase�a correcta"
	FinSi	
FinSubProceso