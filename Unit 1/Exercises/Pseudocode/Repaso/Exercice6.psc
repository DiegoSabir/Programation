SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho n�mero es par o impar.
	Definir Num Como Entero;
	Escribir "Introduzca un numero: "
	Leer Num;
	Si Num Mod 2 = 0
		Imprimir "El numero ", Num, " es par."
	SiNo
		Imprimir "El numero ", Num, " es impar."
	FinSi
FinSubProceso

SubProceso SegundoApartado()
	//Complete el algoritmo con la instrucci�n o instrucciones necesarias.
	//Desarrolle un algoritmo que le permita determinar de una lista de n�meros:
		//1. �Cu�ntos est�n entre el 50 y 75, ambos inclusive?
		//2. �Cu�ntos mayores de 80?
		//3. �Cu�ntos menores de 30?
	//El algoritmo debe finalizar cuando n (el total de n�meros de la lista), sea igual a 0.
	Definir n Como Entero;
	Repetir
		Escribir "Introduzca un numero: "
		Leer n;
		Si n>=50 Y n<=75
			Imprimir "Los numeros entre 50 y 75 son : ", n
		SiNo Si n>80
				Imprimir "Los numeros mayores a 80 son: ", n
			SiNo Si n<30
					Imprimir "Los numeros menores a 30 son: ", n
				FinSi
			FinSi
		FinSi
	Hasta Que n=0 

FinSubProceso

Proceso Exercice6
	PrimerApartado()
	SegundoApartado()
FinProceso	