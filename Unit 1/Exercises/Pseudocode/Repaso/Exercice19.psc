SubProceso Exercice_19(N,Suma,Resto)
	//Dado un numero determinar la suma de sus digitos.
	Suma=0
	Mientras N<>0 Hacer
		Resto=trunc(N-trunc(N/10)*10);
		Suma=Suma+Resto;
		N=N/10;
	FinMientras
	Escribir Suma;
FinSubProceso

Proceso Exercice19
	Definir N, Suma, Resto Como Real;
	Escribir "Introduzca un numero: ";
	Leer N;
	Exercice_19(N,Suma,Resto);
FinProceso	