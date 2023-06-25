SubProceso PrimerApartado(N1,N2)
	//Determinar cual de los dos valores es el mayor y escribelo.
	Si N1>N2
		Imprimir "El valor ", N1, " es el mayor"
	SiNo
		Imprimir "El valor ", N2, " es el mayor"
	FinSi
FinSubProceso

SubProceso SegundoApartado(N1,N2)
	//Determinar cual de los dos valores es el menor y escríbalo.
	Si N1<N2
		Imprimir "El valor ", N1, " es el menor"
	SiNo
		Imprimir "El valor ", N2, " es el menor"
	FinSi
FinSubProceso

SubProceso TercerApartado(N1,N2)
	//Realizar un algoritmo que sume dos números.
	Suma=N1+N2
	Imprimir "La suma entre los dos valores es ",Suma
FinSubProceso

Proceso Exercice1
	//Desarrolle un algoritmo que permita leer dos valores distintos.
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	Repetir
		Escribir "Introduzca el primer valor: "
		Leer N1;
		Escribir "Introduzca el segundo valor: "
		Leer N2;
		Si N1=N2
			Imprimir "Introduzca valores distintos"
		FinSi
	Hasta Que N1<>N2
	PrimerApartado(N1,N2)
	SegundoApartado(N1,N2)
	TercerApartado(N1,N2)
FinProceso	