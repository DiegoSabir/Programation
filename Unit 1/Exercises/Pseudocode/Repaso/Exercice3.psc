SubProceso PrimerApartado(Suma,n)
	//Desarrolle un algoritmo que realice la sumatoria de los n�meros enteros comprendidos entre el 1 y el 10,
	//es decir, 1 + 2 + 3 + ?. + 10.
	Repetir
		n=n+1
		Suma=Suma+n
	Hasta Que n=10
	Imprimir "El resultado del sumatorio es ", Suma
FinSubProceso

SubProceso SegundoApartado(Suma,n)
	//Desarrolle un algoritmo que realice la sumatoria de los n�meros enteros m�ltiplos de 5, comprendidos
	//entre el 1 y el 100, es decir, 5 + 10 + 15 +?. + 100. El programa deber� imprimir los n�meros en
	//cuesti�n y finalmente su sumatoria.
	Repetir
		n=n+1
		Si n Mod 5 = 0
			Imprimir "El numero ", n, " es multiplo de 5"
			Suma=Suma+n
		FinSi
	Hasta Que n=100 
	Imprimir "El resultado del sumatorio es ", Suma
FinSubProceso

SubProceso TercerApartado(Suma,n)
	//Desarrolle un algoritmo que realice la sumatoria de los n�meros enteros pares comprendidos entre el 1
	//y el 100, es decir, 2 + 4 + 6 +?. + 100. El programa deber� imprimir los n�meros en cuesti�n y
	//finalmente su sumatoria
	Repetir
		n=n+1
		Si n Mod 2 = 0
			Imprimir "El numero ", n, " es par"
			Suma=Suma+n
		FinSi
	Hasta Que n=100 
	Imprimir "El resultado del sumatorio es ", Suma
FinSubProceso

SubProceso CuartoApartado(Suma,n)
	//Desarrolle un algoritmo que lea los primeros 300 n�meros enteros y determine cu�ntos de ellos son
	//impares; al final deber� indicar su sumatoria.
	Repetir
		n=n+1
		Si n Mod 2 = 1
			Imprimir "El numero ", n, " es impar"
			Suma=Suma+n
		FinSi
	Hasta Que n=300 
	Imprimir "El resultado del sumatorio es ", Suma
FinSubProceso

Proceso Sumatorio
	Definir n Como Entero;
	Definir Suma Como Entero;
	Suma=0
	n=0
	PrimerApartado(Suma,n)
	SegundoApartado(Suma,n)
	TercerApartado(Suma,n)
	CuartoApartado(Suma,n)
FinProceso	