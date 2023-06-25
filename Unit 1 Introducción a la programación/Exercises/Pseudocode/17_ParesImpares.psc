// Dados 10 números enteros que se ingresan por teclado, 
// calcular cuántos de ellos son pares, cuánto suman los pares, 
// el promedio de los impares y la suma total
SubProceso SumasParesImpares
	Definir suma, sumaPares, sumaImpares, contImpares, contPares, aux, num Como Entero;
	sumaPares = 0;
	sumaImpares = 0;
	contImpares = 0;
	contPares = 0;
	suma = 0;
	
	Para aux = 1 Hasta 10 Hacer
		Escribir "Introduzca un número";
		Leer num;
		suma = suma + num;
		Si num mod 2 = 0 Entonces
			sumaPares = sumaPares + num;
			contPares = contPares + 1;
		SiNo
			sumaImpares = sumaImpares + num;
			contImpares = contImpares + 1;	
		FinSi
	FinPara
	
	Escribir "La media de los números impares es: ", sumaImpares/contImpares;
	Escribir "La suma de los números pares es: ", sumaPares;
	Escribir "Se han introducido ", contPares, " números pares.";
	Escribir "La suma total es: ", suma;
	
FinSubProceso
Proceso ParesImpares
	SumasParesImpares();
FinProceso
