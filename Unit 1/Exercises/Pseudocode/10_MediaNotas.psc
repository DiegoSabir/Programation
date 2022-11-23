//Calcular la media aritmética de 7 examenes de una asignatura introducidas por teclado.
SubProceso Media_Notas ()	
	Definir Nota Como Entero;
	Definir Examen Como Entero;
	Definir Suma Como Entero;
	Suma=0;
	Para Examen=1 Hasta 7
		Escribir "Introduzca la nota: ";
		Leer Nota;
		Suma=Suma+Nota;
	FinPara
	Escribir "La nota de la asignatura es: ", Suma/7;
Fin SubProceso

Proceso MediaNotas
	Media_Notas()
FinProceso