import java.util.Scanner;

public class E06 {
    /*
    public static int potencia(int base, int exponente) {
        int res = base;
        for (int i = 0; i < exponente - 1; i++) {
            res = res * base;
        }
        return res;
    }
*/
    public static int armstrong(int numero) {
        int cifra1 = numero / 100;
        int cifra2 = (numero - 100 * cifra1) / 10;
        int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
        int dat = (int)Math.pow(cifra1, 3) + (int)Math.pow(cifra2, 3) + (int)Math.pow(cifra3, 3);
        if (dat == numero) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número:");
        int num = sc.nextInt();
        if (armstrong(num) == 1) {
            System.out.println("El número " + num + " es Armstrong");
        } else {
            System.out.println("El número " + num + " no es Armstrong");
        }
    }
}
