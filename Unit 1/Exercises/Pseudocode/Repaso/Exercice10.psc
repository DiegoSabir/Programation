SubProceso PrimerApartado()
	//Realice un algoritmo que calcule el total a pagar por el servicio de estacionamiento, teniendo en cuenta 
	//que por la primera hora de estadía se tiene una tarifa de 1000 bolívares y las restantes tienen un costo 
	//de 600 bolívares. Se tiene como datos: hora de entrada, hora de salida (formato militar), iniciada una 
	//hora se contabiliza como hora total.
	Definir HoraEntrada Como Entero;
	Definir HoraSalida Como Entero;
	Definir Total Como Entero;
	Escribir "Introduzca la hora de entrada(formato militar): "
	Leer HoraEntrada;
	Escribir "Introduzca la hora de salida(formato militar): "
	Leer HoraSalida;
	Estancia=HoraSalida-HoraEntrada
	Si Estancia<=1
		Total=1000
	SiNo
		Total=1000+(600*(Estancia-1))
	FinSi
	Imprimir "El total a pagar son ", Total, " bolívares."
FinSubProceso

SubProceso SegundoApartado()
	//Realice un algoritmo que determine el pago a realizar por la entrada a un espectáculo donde se pueden 
	//comprar sólo hasta cuatro entrada, donde el costo de dos entradas es 13,05$ y se les descuenta el 10%, 
	//al de tres entrada el 15% y a la compra de cuatro tickets se le descuenta el 20%.
	Definir NumeroEntradas Como Entero;
	Definir PrecioEntrada Como Real;
	Definir PrecioTotal Como Real;
	Escribir "Introduzca el numero de entradas: "
	Leer NumeroEntradas;
	PrecioEntrada=13.05
	
	Si NumeroEntradas<=0 O NumeroEntradas>4
		Repetir
			Imprimir "Numero invalido de entradas"
			Escribir "Introduzca el numero de entradas: "
			Leer NumeroEntradas;
		Hasta Que NumeroEntradas>0 Y NumeroEntradas<=4
	FinSi
		Segun NumeroEntradas
			Caso 1:
				PrecioTotal=PrecioEntrada
				Imprimir "El precio de ", NumeroEntradas, " entrada es ", PrecioTotal, "$." 
			Caso 2:
				PrecioTotal=PrecioEntrada*10/100
				Imprimir "El precio de ", NumeroEntradas, " entradas son ", PrecioTotal "$."
			Caso 3:
				PrecioTotal=PrecioEntrada*15/100
				Imprimir "El precio de ", NumeroEntradas, " entradas son ", PrecioTotal "$."
			Caso 4:
				PrecioTotal=PrecioEntrada*20/100
				Imprimir "El precio de ", NumeroEntradas, " entradas son ", PrecioTotal "$."
		FinSegun
FinSubProceso

Proceso Exercice10
	PrimerApartado()
	SegundoApartado()
FinProceso	