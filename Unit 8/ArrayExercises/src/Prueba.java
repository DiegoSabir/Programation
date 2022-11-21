public class Prueba {
    final static int FILAS = 4;
    final static int COLUMNAS = 5;

    public static int[][] rellenarArray() {
        int[][] numeros = new int[FILAS][COLUMNAS];
        System.out.println("RELLENO CON NÚMEROS ALEATORIOS");
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 5; j ++) {
                numeros[i][j] = (int) (Math.random() * 10);
            }
        }
        return numeros;
    }
    public static int sumaFilas(int [][] matriz) {
        int suma;
        int sumaTotal = 0;
        System.out.println("SUMA FILAS:");
        for (int i = 0; i < FILAS; i ++) {
            suma = 0;
            for (int j = 0; j < COLUMNAS; j ++) {
                System.out.print(matriz[i][j] + "\t");
                suma += matriz[i][j];
            }
            sumaTotal += suma;
            System.out.println("S: " + suma);
        }
        return sumaTotal;
    }

    public static void sumaColumnas(int[][] matriz, int sumaFilas) {
        int suma;
        int sumaColumnas = 0;
        System.out.println("SUMA COLUMNAS:");
        for (int j = 0; j < COLUMNAS; j ++) {
            suma = 0;
            for (int i = 0; i < FILAS; i ++) {
                suma += matriz[i][j];
            }
            System.out.print(suma + "\t");
            sumaColumnas += suma;
        }
        System.out.print("T: " + (sumaColumnas+sumaFilas));
    }

    public static void main(String[] args) {

        int[][] matriz = rellenarArray();
        int sumaFilas = sumaFilas(matriz);
        sumaColumnas(matriz, sumaFilas);
        System.out.println();
    }
}
