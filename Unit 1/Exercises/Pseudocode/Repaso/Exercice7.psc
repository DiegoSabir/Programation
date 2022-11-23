SubProceso PrimerApartado
	//Desarrolle un algoritmo que permita convertir calificaciones numéricas, según la siguiente tabla:
	//A = 19 y 20, B =16, 17 y 18, C = 13, 14 y 15, D = 10, 11 y 12, E = 1 hasta el 9. 
	//Se asume que la nota está comprendida entre 1 y 20.
	Definir Nota Como Entero;
	Escribir "Introduzca la la califación: "
	Leer Nota
	Si Nota>20 O Nota<1
		Imprimir "Introduzca la nota correcta"
	SiNo
		Segun Nota
			Si N<=20 O N>=19
				Caso 1:
					Imprimir "Califacion = A"
			FinSi

		FinSegun
	FinSi	
FinSubProceso

Proceso Exercice7
	
FinProceso	