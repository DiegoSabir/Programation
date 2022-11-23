//Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
//El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores 
//introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte 
//la introducción de valores iguales.
SubProceso PrimerApartado(A,B,C)
	Si (A>B) Y (A>C) Entonces
		Imprimir "El valor ", A " es el mayor"
		Si (B<C)
			Imprimir "El valor ", B " es el menor"
		SiNo
			Imprimir "El valor ", C " es el menor"
		FinSi
	Sino Si (B>A) Y (B>C) Entonces
			Imprimir "El valor ", B, " es el mayor"
			Si (A<C)
				Imprimir "El valor ", A " es el menor"
			SiNo
				Imprimir "El valor ", C " es el menor"
			FinSi
		SiNo
			Imprimir "El valor ", C, " es el mayor"
				Si (A<B)
					Imprimir "El valor ", A " es el menor"
				SiNo
					Imprimir "El valor ", B " es el menor"
				FinSi
		FinSi
	FinSi
FinSubProceso

Proceso Exercice2
	Definir A Como Entero;
	Definir B Como Entero;
	Definir C Como Entero;
	Repetir
		Escribir "Introduzca el primer valor: "
		Leer A;
		Escribir "Introduzca el segundo valor: "
		Leer B;
		Escribir "Introduzca el tercer valor: "
		Leer C;
		Si (A=B) O (B=C) O (A=C)
			Imprimir "Introduzca valores distintos"
		FinSi
	Hasta Que (A<>B) Y (B<>C) Y (A<>C)
	PrimerApartado(A,B,C)
FinProceso	