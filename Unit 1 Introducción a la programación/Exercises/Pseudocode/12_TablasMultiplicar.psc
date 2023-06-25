//Escribir un Pseudocódigo que calcule las tablas de multiplicar
SubProceso Tablas_Multiplicar()
	Definir i Como Entero;
	Definir j Como Entero;
	Para i=1 Hasta 10
		Escribir "Tabla del ", i;
		Para j=1 Hasta 10
			Escribir i, "*", j, "=", i*j;
		FinPara
		Escribir "_____________"
	FinPara
Fin SubProceso

Proceso TablasMultiplicar
	Tablas_Multiplicar();
FinProceso