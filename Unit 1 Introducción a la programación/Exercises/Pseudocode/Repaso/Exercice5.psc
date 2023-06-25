SubProceso PrimerApartado()
	//Desarrolle un algoritmo que permita determinar el área y volumen de un cilindro dado su radio (R) y
	//altura (H).
	Definir R Como Real;
	Definir H Como Real;
	Definir A Como Real;
	Definir V Como Real;
	Escribir "Introduzca el valor del radio: "
	Leer R;
	Escribir "Introduzca el valor de la altura: "
	Leer H;
	A=(2*PI*R*H)+(2*PI*(R*R))
	V=PI*(R*R)*H
	Imprimir "El valor del Area del cilindro es ", A
	Imprimir "El valor del Volumen del cilindro es ", V
FinSubProceso

SubProceso SegundoApartado()
	//Realiza un algoritmo que le permita determinar el área de un rectángulo.
	Definir B Como Real;
	Definir H Como Real;
	Definir A Como Real;
	Escribir "Introduzca el valor de la base: "
	Leer B;
	Escribir "Introduzca el valor de la altura: "
	Leer H;
	A=B*H
	Imprimir "El valor del Area del rectangulo es ", A
	
FinSubProceso

Proceso Exercice5
	PrimerApartado()
	SegundoApartado()
FinProceso	