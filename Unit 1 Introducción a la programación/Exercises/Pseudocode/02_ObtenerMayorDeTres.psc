//Escribir Pseudocódigo que lea de entrada 3 números y que indique cuál es el mayor de ellos.
Algoritmo ObtenerMayorDeTres
		Definir N1 Como Entero;
		Definir N2 Como Entero;
		Definir N3 Como Entero;
		
		Escribir "Introduzca el primer numero: ";
		Leer N1;
		Escribir "Introduzca el segundo numero: ";
		Leer N2;
		Escribir "Introduzca el tercer numero: ";
		Leer N3;
		
		Si N1>=N2 y N1>=N3 Entonces
			Imprimir "El mayor es: ", N1;
		SiNo
			Si N2>=N1 y N2>=N3 Entonces
				Imprimir "El mayor es: ", N2;
			SiNo
				Imprimir "El mayor es: ", N3;
			FinSi
		FinSi
FinAlgoritmo