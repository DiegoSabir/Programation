//Introducir 2 numeros por teclado. Imprimir los numeros que hay entre ambos, contar cuantos hay y cuantos son pares.
//Calcular el producto de los impares.

SubProceso Mostrar_Numero()
	Definir N1 Como Entero;
	Escribir "Introduzca el primer numero: "
	Leer N1
	Definir N2 Como Entero;
	Escribir "Introduzca el segundo numero: "
	Leer N2
	Contador=N1
	ProductoImpar=1
	Repetir
		Contador=Contador+1
		Imprimir Contador
		Si Contador MOD 2=0
			ContadorPares=ContadorPares+1
		SiNo
			ProductoImpar=ProductoImpar*Contador
		FinSi
	Hasta Que Contador=N2-1
	Imprimir "Hay ", Contador-1, " numeros entre N1 y N2" 
	Imprimir "Hay ", ContadorPares, " numeros pares entre N1 y N2" 
	Imprimir "El producto de los impares es ", ProductoImpar
FinSubProceso

Proceso MostrarNumero
	Mostrar_Numero() 
FinProceso	





