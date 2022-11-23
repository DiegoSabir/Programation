Algoritmo Factorial
	Definir N Como Entero;
	Definir i Como Entero;
	Definir Fact como Entero;
	Escribir "Introduzca un número: ";
	Leer N;
	i=N-1;
	Fact=N;
	Hacer
		Fact=Fact*i;
		i=i-1;
	Hasta Que i=1
	Escribir "El factorial de ", N, " es: ", Fact;
FinAlgoritmo