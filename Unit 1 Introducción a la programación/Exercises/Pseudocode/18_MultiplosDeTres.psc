//Imprimir y contar los numeros multiplos de 3 desde 1 hasta el numero introducido por teclado.
SubProceso Multiplos(N) 
	Para i=1 Hasta N con Paso 1
		Si i Mod 3=0 Entonces
			Escribir "El ", i, " es multiplo de 3"
		FinSi
	FinPara
FinSubProceso

Proceso MultiplosDeTres
	Definir Num Como Entero;
	Escribir "Introduzca hasta donde desea contar: ";
	Leer Num;
	Multiplos(Num) 
FinProceso	