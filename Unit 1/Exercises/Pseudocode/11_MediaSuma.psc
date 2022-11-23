//Algoritmo que pida numeros hasta que se introduzca un cero. 
//Debe imprimir la suma y la media de todos los numeros introducidos.
Proceso MediaSuma
	Definir N Como Real;
	Mostrar Media_Suma(N)
FinProceso

SubProceso resultado=Media_Suma(N)
	Definir Suma Como Entero;
	Definir Contador Como Entero;
	Contador=0
	Suma=0
	Repetir 
		Escribir "Introduzca un numero: "
		Leer N;
		Suma=Suma+N
		Contador=Contador+1
	Hasta Que N=0
	Imprimir "La suma es: ",Suma;
	Imprimir "La media es: ",Suma/Contador
FinSubProceso