Algoritmo HolaMundo
	Definir num Como Entero;
	Definir num2 Como Entero;
	Escribir "Introduzca un número:"
	Leer num;
	
	Si num = 0
		Entonces
		Escribir "El número introducido debe ser mayor que cero";
	SiNo
		Escribir "Muy bien. El número es distinto de cero"
	FinSi
	
	num2 = 2;
	Escribir "El número introducido es: ", num;	
	Escribir "num2 es: ", num2;
	num2 <- 9;
	Escribir "La suma de ambos es: ", num+num2;
FinAlgoritmo
