SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
	Definir N Como Real;
	Definir Suma Como Real;
	Definir Contador Como Entero;
	Definir Media Como Real;
	Suma=0
	Contador=0
	Repetir
		Escribir "Introduzca la nota : "
		Leer N;
		Suma=Suma+N
		Contador=Contador+1
	Hasta Que N=0
	Media=Suma/(Contador-1)
	Imprimir "El promedio de notas es de ", Media
FinSubProceso

SubProceso SegundoApartado()
	//Desarrolle un algoritmo que permita calcular la media aritmética.
	
FinSubProceso

Proceso Exercice12
	PrimerApartado()
	SegundoApartado()
FinProceso	