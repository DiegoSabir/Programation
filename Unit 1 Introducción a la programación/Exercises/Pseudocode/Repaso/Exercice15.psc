SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita determinar a partir de un número de días, ingresado por pantalla, 
	//¿Cuántos años, meses, semanas y días; constituyen el número de días proporcionado utilizando la 
	//estructura Mientras o While.
	Definir Dias Como Entero;
	Definir Semanas Como Entero;
	Definir Meses Como Entero;
	Definir Años Como Entero;
	Escribir "Introduzca el numero de días: "
	Leer NumeroDias;
	Mientras NumeroDias<1
		Si NumeroDias>365
			Años=NumeroDias/365
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
	Imprimir "Los dias cinstituyen a ", Años, " años, ", Meses, " meses, ", Semanas, " semanas, ", NumeroDias, " días."
FinSubProceso

Proceso Exercice15
	PrimerApartado()
FinProceso