SubProceso PrimerApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
	//Desarrolle un algoritmo para la empresa Constructora Tecnovivir Casas C.A., que le permita calcular e
	//imprimir la nómina para su cancelación a un total de 50 obreros calificados a quienes debe cancelar por
	//horas trabajadas. La hora trabajada se pautó en 30.000 bolívares.
	Mientras NumeroTrabajadores>0
		Sueldo=HoraTrabajada*NominaHoraTrabajada
		Nomina=Nomina+Sueldo
		NumeroTrabajadores=NumeroTrabajadores-1
	FinMientras
	Imprimir "La nomina total a pagar es de ", Nomina, " bolivares."
FinSubProceso

SubProceso SegundoApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
	//Realice el mismo algoritmo utilizando la herramienta FOR.
	Para NumeroTrabajadores=50 Hasta 1 Con Paso -1 Hacer
		Sueldo=HoraTrabajada*NominaHoraTrabajada
		Nomina=Nomina+Sueldo
	FinPara
	Imprimir "La nomina total a pagar es de ", Nomina, " bolivares."
FinSubProceso

SubProceso TercerApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
	//Realice el mismo algoritmo utilizando la herramienta REPEAT.
	Repetir
		Sueldo=HoraTrabajada*NominaHoraTrabajada
		Nomina=Nomina+Sueldo
		NumeroTrabajadores=NumeroTrabajadores-1
	Hasta Que NumeroTrabajadores=0
	Imprimir "La nomina total a pagar es de ", Nomina, " bolivares."
FinSubProceso

Proceso Exercice13
	Definir NumeroTrabajadores Como Entero;
	Definir Sueldo Como Entero;
	Definir NominaHoraTrabajada Como Entero;
	Definir HoraTrabajada Como Entero;
	Definir Nomina Como Entero;
	Escribir "Introduzca las horas trabajadas: "
	Leer HoraTrabajada;
	NumeroTrabajadores=50
	NominaHoraTrabajada=30000
	PrimerApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
	SegundoApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
	TercerApartado(NumeroTrabajadores,Sueldo,NominaHoraTrabajada,HoraTrabajada,Nomina)
FinProceso