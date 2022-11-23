SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso.
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	Escribir "Introduzca el primer numero: "
	Leer N1;
	Escribir "Introduzca el segundo numero: "
	Leer N2;
	Si N1>N2
		Imprimir N2, ",", N1
	SiNo
		Imprimir N1, ",", N2
	FinSi
FinSubProceso

SubProceso SegundoApartado()
	//Desarrolle un algoritmo que permita realizar la escritura de los primeros 100 números naturales utilizando 
	//la estructura Mientras (While).
	Definir i Como Entero;
	i=0
	Mientras  i<=100
		Imprimir i
		i=i+1
	FinMientras
FinSubProceso

Proceso  Exercice8
	PrimerApartado()
	SegundoApartado()
FinProceso	