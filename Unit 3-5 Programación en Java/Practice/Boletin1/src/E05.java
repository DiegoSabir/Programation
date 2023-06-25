import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el importe:");
        int imp = sc.nextInt();
        calcularBilletes(imp);
    }

    public static void calcularBilletes(int importe) {
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        int[] res = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < billetes.length; i++) {
            if (importe >= billetes[i]) {
                res[i] = (int) Math.floor(importe / billetes[i]);

                importe = importe - (res[i] * billetes[i]);
            }
        }

        for (int i = 0; i < billetes.length; i++) {
            if (res[i] > 0) {
                System.out.println(res[i] + " billete de: " + billetes[i] + " Euros");
            }
        }
        System.out.println("Sobran " + importe + " Euros");
    }
}
