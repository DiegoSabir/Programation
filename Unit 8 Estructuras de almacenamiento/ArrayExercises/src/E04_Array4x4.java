/**
 * Crear una matriz de 4x4 y rellenarla con valores solicitados al usuario
 * Pedir una fila al usuario, comprobar que introduce una fila existente, y sumar los valores de dicha fila.
 * Sumar diagonal
 * Sumar diagonal inversa
 * Media valores matriz
 * Método que reciba otra matriz y devuelva como resultado una matriz que contenga la suma de ambas matrices.
 */


import java.util.Scanner;
public class E04_Array4x4 {
    public static void creatingMatrix1(int[][] m1, int[][] m2, Scanner sc){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Introduce a number:");
                m1[i][j] = sc.nextInt();
                m2[i][j] = (int)(Math.random() * 10);
            }
        }
    }
    public static void showMatrix(int[][] m1){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static int calculateFila(int[][] m1, Scanner sc){
        int line;
        do {
            System.out.println("Introduce a line:");
            line = sc.nextInt();
        }while (line < 0 || line > 3);
        int addition = 0;
        for (int j = 0; j < 4; j++){
            addition += m1[line][j];
        }
        return addition;
    }
    public static int calculateDiagonal(int[][] m1){
        int addition = 0;
        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= 3; j++){
                if (i == j) {
                    addition += m1[i][j];
                }
            }
        }
        return addition;
    }
    public static int calculateInverseDiagonal(int[][] m1){
        int addition = 0;
        for (int i = 0; i <= 3; i++){
            for (int j = 3; j >= 0; j--){
                if (i + j == 3) {
                    addition += m1[i][j];
                }
            }
        }
        return addition;
    }
    public static int[][] additionMatrixs(int[][] m1, int[][] m2){
        int[][] addition = new int [4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                addition[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return addition;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int [4][4];
        int matrix2[][] = new int [4][4];

        creatingMatrix1(matrix1, matrix2, sc);
        showMatrix(matrix1);
        System.out.println("The line's addition is = " + calculateFila(matrix1, sc));
        System.out.println("The diagonal's addition is = " + calculateDiagonal(matrix1));
        System.out.println("The inverse diagonal's addition is = " + calculateInverseDiagonal(matrix1));

        showMatrix(additionMatrixs(matrix1,  matrix2));
    }
}
