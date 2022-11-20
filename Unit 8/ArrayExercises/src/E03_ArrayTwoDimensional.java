/**
 * Crear un array bidimensional de 4 filas y 5 columnas y rellenarlo con 20 números aleatorios entre 0 y 99.
 * Muestra el contenido del array
 * Calcula las sumas parciales de filas y columnas, que aparecerán a la derecha de cada fila y debajo de cada columna.
 * La suma total debe aparecer en la esquina inferior derecha.
 */
public class E03_ArrayTwoDimensional {
    public static void main(String args[]){
        int filas = 4;
        int columnas = 5;
        int matriz[][] = new int [filas][columnas];
        int sumafila = 0;
        int sumacolumna = 0;
        int sumatotal = 0;

        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = (int)(Math.random() * 100);
                sumafila += matriz[i][j];
                sumatotal += sumafila;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("= " + sumafila);
            System.out.println("");
        }
        System.out.println("Total = " + sumatotal);

    }
}
