//Escribir un Pseudocodigo y elabora el ordinograma del algoritmo que pida una contraseņa (3 intentos maximo hasta que la clave sea 111, 222 o 333.
Proceso  ComprobarContraseņa
	Imprimir Comprobar_Contraseņa()
FinProceso

SubProceso Resultado=Comprobar_Contraseņa()
	Definir PW Como Entero;
	Definir TRY Como Entero;
	TRY=3	
	Hacer
		Escribir "Introduzca la contraseņa: ";
		Leer PW;
		TRY=TRY-1;
	Hasta Que PW=333 o PW=222 o PW=111 o TRY=0
	
	Si TRY=0 y TRY<>333 y TRY<>222 y PW<>111
		Resultado="La cuenta ha sido bloqueada"
	SiNo
		Resultado="Contraseņa correcta"
	FinSi	
FinSubProceso