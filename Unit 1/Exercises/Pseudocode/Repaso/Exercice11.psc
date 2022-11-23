SubProceso PrimerApartado(Km,ms)
	//Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros 
	//por hora, proporcione la velocidad en metros por segundo.
	Escribir "Introduzca el valor en Km/h: "
	Leer Km;
	ms=Km*1000/3600
	Imprimir "El valor en m/s es de: ", ms
FinSubProceso

SubProceso SegundoApartado(Km,ms)
	//Desarrolle un algoritmo que lea la velocidad en metros por segundo y la convierta a kilómetros por hora.
	Escribir "Introduzca el valor en m/s: "
	Leer ms;
	Km=ms/1000*3600
	Imprimir "El valor en Km/h es de: ", Km
FinSubProceso

Proceso Exercice11
	Definir Km Como Real;
	Definir ms Como Real;
	PrimerApartado(Km,ms)
	SegundoApartado(Km,ms)
FinProceso	