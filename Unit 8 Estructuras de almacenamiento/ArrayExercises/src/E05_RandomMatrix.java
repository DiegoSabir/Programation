import java.util.Scanner;

public class E05_RandomMatrix {
    public static int[][] createMatrix () {
        Scanner sn=new Scanner(System.in);

        System.out.println("Introduce the matrix size:");
        int size=sn.nextInt();

        int matrix[][]=new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {
        System.out.println("MATRIX:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int averageMatrix(int[][] matrix) {
        int plus = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                plus += matrix[i][j];
            }
        }
        return plus/(matrix.length*matrix[0].length);
    }

    public static int[][] increaseAverage(int[][] matrix, int average) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                result[i][j]=matrix[i][j]*average;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("CREATING THE FIRST MATRIX:");
        int[][] matrix1 = createMatrix();
        showMatrix(matrix1);

        System.out.println("CREATING THE SECOND MATRIX:");
        int[][] matrix2 = createMatrix();
        showMatrix(matrix2);

        System.out.println("MULTIPLY THE FIRST MATRIX BY THE SECOND MATRIX AVERAGE:");
        int averageM2 = averageMatrix(matrix2);
        System.out.println("AVERAGE M2: " + averageM2);
        showMatrix(increaseAverage(matrix1, averageM2));

        System.out.println("MULTIPLY THE SECOND MATRIX BY THE FIRST MATRIX AVERAGE:");
        int averageM1 = averageMatrix(matrix1);
        System.out.println("AVERAGE M1: " + averageM1);
        showMatrix(increaseAverage(matrix2, averageM2));
    }
}
