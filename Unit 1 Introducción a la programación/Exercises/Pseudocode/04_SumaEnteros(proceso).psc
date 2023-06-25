//Escribir un Pseudocódigo que calcule la suma de los N primeros números enteros positivos

//Mientras
SubProceso Suma=SumaEnterosMientras (N)
	Definir i como Entero;
	i=N;
	Suma=0;
	Mientras (i>0)
		Suma=Suma+i;
		i=i-1;
	FinMientras
Fin SubProceso

//Repetir Decremental
SubProceso Suma=SumaEnterosRepetirDecremental (N)
	Definir i como Entero;
	i=N;
	Suma=0;
	Repetir
		Suma=Suma+i;
		i=i-1;		
	Hasta Que (i=0)
Fin SubProceso

//Repetir Incremental
SubProceso Suma=SumaEnterosRepetirIncremental (N)
	Definir i como Entero;
	i=N;
	Suma=0;
	Repetir
		Suma=Suma+i;
		i=i+1;		
	Hasta Que (i>N)
Fin SubProceso

//Para
SubProceso Suma=SumaEnterosPara (N)
	Definir i como Entero;
	Suma=0;
	Para i=1 Hasta N
		Suma=Suma+i;
	FinPara
Fin SubProceso

Proceso SumaEnteros
	Definir n Como Entero;
	Escribir "Introduzca un número:";
	Leer n;
	Imprimir "La suma de los ", n, " primeros números enteros es: ", SumaEnterosMientras(n);
FinProceso