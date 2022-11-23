SubProceso PrimerApartado()
	//Determinar la hipotenusa de un triángulo rectángulo conocidas las longitudes de sus dos catetos.
	//Desarrolle el algoritmo correspondiente.
	Definir C1 Como Real;
	Definir C2 Como Real;
	Definir H Como Real;
	Escribir "Introduzca el valor del primer cateto: ";
	Leer C1;
	Escribir "Introduzca el valor del segundo cateto: ";
	Leer C2;
	H=raiz((C1*C1)+(C2*C2));
	Imprimir "La hipotenusa del triangulo tiene valor ", H
FinSubProceso

SubProceso SegundoApartado()
	//Desarrollar un algoritmo que calcule el área de un cuadrado.
	Definir L Como Real;
	Definir A Como Real;
	Escribir "Introduzca un lado del cuadrado: "
	Leer L;
	A=L*L
	Imprimir "El area del cuadrado tiene valor ", A
FinSubProceso

Proceso Geometria
	PrimerApartado()
	SegundoApartado()
FinProceso	