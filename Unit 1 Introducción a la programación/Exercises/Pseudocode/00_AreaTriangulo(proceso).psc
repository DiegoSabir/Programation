//Write a Pseudocode that calculates the area of a triangle receiving as input the value of base and height.
SubProceso a=Triangle_Area(b,h)
	a=b*h/2;
Fin SubProceso

Proceso TriangleArea
	Definir b Como Entero;
	Definir h Como Entero;
	Escribir "Write the base of the triangle: ";
	Leer b;
	Escribir "Write the height of the triangle: ";
	Leer h;
	Imprimir "The area of the triangle is ", Triangle_Area(b,h);
FinProceso