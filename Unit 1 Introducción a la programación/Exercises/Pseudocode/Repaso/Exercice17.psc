//Diseñar el algoritmo (ordinograma y psedocodigo) correspondiente a un programa que exprese en horas, minutos y segundos un tiempo expresado 
//en segundos.
SubProceso Exercice_17(TiempoS,H,M,S)
	Si TiempoS>=3600
		Repetir
			H=H+1
			TiempoS=TiempoS-3600
		Hasta Que TiempoS<3600
	FinSi
	Si TiempoS>=60
		Repetir
			M=M+1
			TiempoS=TiempoS-60
		Hasta Que TiempoS<60
	FinSi
	S=TiempoS
	Imprimir "En el tiempo introducido hay ", H, " horas, ", M, " minutos, " S, " segundos."
FinSubProceso

Proceso Exercice17
	Definir H, M, S Como Entero;
	Definir TiempoS Como Entero;
	Escribir "Introduzca el tiempo en segundos: "
	Leer TiempoS;
	H=0
	M=0
	S=0
	Exercice_17(TiempoS,H,M,S)
FinProceso