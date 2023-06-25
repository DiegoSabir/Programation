SubProceso Exercice_18(Nomina)
	//A un trabajador le descuentan de su sueldo el 10% hasta los 1000$, si cobra entre 1000-2000$, a mayores el 5% 
	//del adicional, y por encima del 2000$ el 3% del adicional. Calcular el descuento y sueldo neto que recibe el 
	//trabajador dado su sueldo.
	Si Nomina<=1000
		Impuesto=Nomina*0.1
		NominaTotal=Nomina-Impuesto
	SiNo Si Nomina>1000 Y Nomina<2000
		Resto=Nomina-1000
		Impuesto=(1000*0.1)+(Resto*0.05)
		NominaTotal=Nomina-Impuesto
		SiNo
			Resto=Nomina-2000
			Impuesto=(1000*0.1)+(1000*0.05)+(Resto*0.03)
			NominaTotal=Nomina-Impuesto
		FinSi	
	FinSi
	Imprimir "Su sueldo neto es de ", NominaTotal, "$ con un descuento por impuestos del ", Impuesto, "$."  
FinSubProceso

Proceso Exercice18
	Definir Nomina, Impuesto, Resto, NominaTotal Como Entero;
	Escribir "Introduzca la nomina: ";
	Leer Nomina;
	Exercice_18(Nomina)
FinProceso
	