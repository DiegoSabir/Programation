//Crear una aplicación que solicite notas numéricas (S para salir) y 
// muestre por pantalla su equivalente en letras (Sobresaliente, notable, 
//bien, suficiente, suspenso). Al terminar, deberá mostrar la mayor nota en 
//número y letra.
	
SubProceso CapturaNotas ()	
	Definir nota Como Entero;
	Definir mayorNotaNum Como Entero;
	Definir mayorNotaCad Como Cadena;
	Definir notaCad Como Cadena;
	mayorNotaNum<-0;
	Repetir
		Escribir "Introduzca nota: (999 para salir)";
		Leer nota;
		Segun nota
			Caso 1 o 2 o 3 o 4: 
				notaCad="Insuficiente"
			Caso 5: 
				notaCad="Suficiente"
			Caso 6: 
				notaCad="Bien"
			Caso 7 o 8: 
				notaCad="Notable"
			Caso 9 o 10: 
				notaCad="Sobresaliente"
		FinSegun
		Si nota<>999
			Escribir nota, ": ", notaCad;
			Si nota>mayorNotaNum
				mayorNotaNum=nota;
				mayorNotaCad=notaCad;
			FinSi
		FinSi
	Hasta Que nota=999;
	Escribir "La mayor nota fue: ", mayorNotaNum, ": ", mayorNotaCad;
Fin SubProceso
	
Proceso TratarNotas
	CapturaNotas();
FinProceso
