import java.util.Scanner;

public class E05 {
    public static boolean primo(int num){
        int i = 2;
        while (i!=num){
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }
    public static String invertir(String dato){
        String s = "";
        for (int i=dato.trim().length()-1; i >= 0; i--){
            s=s+dato.substring(i,i+1);
        }
        return s;
    }
    public static boolean esOmirp(int num){
        if (!primo(num)) return false;
        String cad= String.valueOf(num);
        cad = invertir(cad);
        int dat=Integer.parseInt(cad.trim());
        if (!primo(dat)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para comprobar:");
        System.out.println(esOmirp(sc.nextInt()));
        //System.out.println(esOmirp(7952));//->false
        //System.out.println(esOmirp(7951));//->true
    }
}
