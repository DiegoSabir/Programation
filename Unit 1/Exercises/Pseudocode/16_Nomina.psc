//Realice un Pseudocódigo que calcule la nómina salarial neto, de unos obreros cuyo trabajo se paga en horas. 
//El cálculo se realiza de la siguiente forma:
	//- Las primeras 35 horas mensuales a una tarifa fija. (30 ?, por ejemplo)
	//- Las horas extras se pagan a 1.5 más de la tarifa fija.
//- Los impuestos a deducir de los trabajadores varian:
//- Si el sueldo mensual es menor que 1000 ?, el sueldo es libre de impuesto
// - En caso contrario, se descontará un 20% de impuestos.
SubProceso CalculoNomina (horasTrabajo)
	tarifa = 30;
	Definir horas, sueldo, dif_horas, tarifa_extra, salario_extra, Impuesto, sueldo_total Como Numero;
	
	Si horasTrabajo <= 35 Entonces
		sueldo = horasTrabajo * tarifa;
	SiNo
		dif_horas = horasTrabajo - 35;
		tarifa_extra = tarifa * 1.5;
		salario_extra = tarifa_extra * dif_horas;
		sueldo=(35*tarifa)+ salario_extra;
	FinSi
	Impuesto=0
	Si sueldo > 1000 entonces
		Impuesto = (sueldo* 0.20)
		salario_total = sueldo - Impuesto
		Imprimir "Su sueldo al mes es: ", sueldo,", Valor de Impuesto: ", Impuesto, ", El salario Neto es: ",salario_total;
		
	SiNo
		Imprimir "Su sueldo Neto es: ", sueldo;
	FinSi
FinSubProceso
	
Proceso Nomina
	Escribir "Introduzca las horas de trabajo realizadas: ";
	Leer horas;
	calculoNomina(horas);
FinProceso


