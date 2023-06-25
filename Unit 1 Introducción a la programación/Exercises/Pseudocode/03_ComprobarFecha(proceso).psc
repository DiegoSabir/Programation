//Escribir un Pseudoc�digo que lea 3 n�meros los cuales significan 
//una fecha (d�a, mes, a�o). Comprobar que sea v�lida la fecha, si no es valido 
//que imprima un mensaje de error, y si es v�lida imprimir el mes con su nombre.
SubProceso Comprobar_Fecha(D, M, A)
	Si D>31 o D<1 o M<1 o M>12 o A<0 Entonces
		Imprimir "La fecha no es v�lida";
	SiNo
		Si (M=4 o M=6 o M=9 o M=11) y D>30 Entonces
				Imprimir "Error de dia";
		SiNo
			Si M=2 y D>28
				Imprimir "Febrero no puede tener m�s de 28 d�as"
			SiNo
				Segun M
					Caso 1: 
						Imprimir D, " de Enero de ", A
					Caso 2: 
						Imprimir D, " de Febrero de ", A
					Caso 3: 
						Imprimir D, " de Marzo de ", A
					Caso 4: 
						Imprimir D, " de Abril de ", A
					Caso 5: 
						Imprimir D, " de Mayo de ", A
					Caso 6: 
						Imprimir D, " de Junio de ", A
					Caso 7: 
						Imprimir D, " de Julio de ", A
					Caso 8: 
						Imprimir D, " de Agosto de ", A
					Caso 9: 
						Imprimir D, " de Septiembre de ", A
					Caso 10: 
						Imprimir D, " de Octubre de ", A
					Caso 11: 
						Imprimir D, " de Noviembre de ", A
					Caso 12: 
						Imprimir D, " de Diciembre de ", A
				FinSegun
			FinSi
		FinSi
	FinSi
Fin SubProceso

Proceso ComprobarFecha
	Definir D Como Entero;
	Definir M Como Entero;
	Definir A Como Entero;
	Escribir "Introduzca el d�a: ";
	Leer D;
	Escribir "Introduzca el mes: ";
	Leer M;
	Escribir "Introduzca el a�o: ";
	Leer A;
	Comprobar_Fecha(D,M,A);
FinProceso