SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.
	Definir N Como Entero;
	Definir i Como Entero;
	Definir j Como Entero;
	Escribir "Introduzca un numero a determinar: "
	Leer N;
	i=1
	j=0
	Repetir
		Si N Mod i = 0
			i = i+1
		FinSi
		j=j+1
	Hasta Que j=N
	
	Si i>2
		Imprimir "El numero ", N, " no es primo"
	SiNo
		Imprimir "El numero ", N, " es primo"
	FinSi
FinSubProceso

SubProceso SegundoApartado()
	//Realice un algoritmo que determine los veinte primeros números, ¿Cuáles son múltiplos de 2?.
	Definir N Como Entero;
	Definir i Como Entero;
	N=0
	Repetir
		N=N+1
		Si N Mod 2 = 0
			Imprimir "El numero ", N, " es multiplo de 2"
		FinSi
	Hasta Que N=20  
FinSubProceso

SubProceso TercerApartado()
	//Realice un algoritmo que determine cuantos minutos hay en 5 horas.
	Definir Hora Como Entero;
	Definir Minuto Como Entero;
	Escribir "Introduzca las horas a calcular: "
	Leer Hora;
	Minuto=60
	Imprimir "Hay ", Hora*Minuto, " minutos en ", Hora, " horas."
	
FinSubProceso

Proceso Exercice9
	PrimerApartado()
	SegundoApartado()
	TercerApartado()
FinProceso
	