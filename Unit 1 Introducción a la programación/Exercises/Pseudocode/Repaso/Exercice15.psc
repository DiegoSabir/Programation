SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita determinar a partir de un n�mero de d�as, ingresado por pantalla, 
	//�Cu�ntos a�os, meses, semanas y d�as; constituyen el n�mero de d�as proporcionado utilizando la 
	//estructura Mientras o While.
	Definir Dias Como Entero;
	Definir Semanas Como Entero;
	Definir Meses Como Entero;
	Definir A�os Como Entero;
	Escribir "Introduzca el numero de d�as: "
	Leer NumeroDias;
	Mientras NumeroDias<1
		Si NumeroDias>365
			A�os=NumeroDias/365
			NumeroDias=NumeroDias-365
		FinSi
		Si NumeroDias>30
			Meses=NumeroDias/30
			NumeroDias=NumeroDias-30
		FinSi
		Si NumeroDias>7
			Semanas=NumeroDias/7
			NumeroDias=NumeroDias-7
		FinSi
		Dias=NumeroDias
		NumeroDias=NumeroDias-Dias
	FinMientras
	Imprimir "Los dias cinstituyen a ", A�os, " a�os, ", Meses, " meses, ", Semanas, " semanas, ", NumeroDias, " d�as."
FinSubProceso

Proceso Exercice15
	PrimerApartado()
FinProceso