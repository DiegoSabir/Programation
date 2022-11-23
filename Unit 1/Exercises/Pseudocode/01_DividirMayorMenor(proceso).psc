//Escribir Pseudocódigo que dados 2 valores de entrada imprima siempre la división del mayor entre el menor. 
SubProceso Res=Dividir_Mayor_Menor (n1, n2)
	Si n1>n2 Entonces
		Res=n1/n2;
	SiNo
		Res=n2/n1;
	FinSi
Fin SubProceso

Proceso DividirMayorMenor
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	Escribir "Introduzca el primer numero: ";
	Leer N1;
	Escribir "Introduzca el segundo numero: ";
	Leer N2;
	Imprimir "El resultado es ", Dividir_Mayor_Menor(N1,N2);
FinProceso