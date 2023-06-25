//Escribir Pseudocódigo que dados 2 valores de entrada imprima siempre la división del mayor entre el menor. 
Algoritmo DividirMayorMenor
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	
	Escribir "Introduzca el primer numero: ";
	Leer N1;
	Escribir "Introduzca el segundo numero: ";
	Leer N2;
	
	Si N1>N2 Entonces
		Imprimir "El resultado es ", N1/N2;
	SiNo
		Imprimir "El resultado es ", N2/N1;
	FinSi
FinAlgoritmo