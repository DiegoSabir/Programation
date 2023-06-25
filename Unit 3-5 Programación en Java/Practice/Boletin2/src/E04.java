public class E04 {
    public static String decimalToRomano(int dato) {
        int d = dato;
        String s ="";
        while (d > 0) {
            while (d >= 1000) {
                d -= 1000;
                s +="M";
            }
            while (d >= 900) {
                d -= 900;
                s +="CM";
            }
            while (d >= 500) {
                d -= 500;
                s +="D";
            }
            while (d >= 400) {
                d -= 400;
                s +="CD";
            }
            while (d >= 100) {
                d -= 100;
                s +="C";
            }
            while (d >= 90) {
                d -= 90;
                s +="XC";
            }
            while (d >= 50) {
                d -= 50;
                s +="L";
            }
            while (d >= 40) {
                d -= 40;
                s +="XL";
            }
            while (d >= 10) {
                d -= 10;
                s +="X";
            }
            while (d >= 9) {
                d -= 9;
                s +="IX";
            }
            while (d >= 5) {
                d -= 5;
                s +="V";
            }
            while (d >= 4) {
                d -= 4;
                s +="IV";
            }
            while (d >= 1) {
                d -= 1;
                s +="I";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(decimalToRomano(1973));
    }
}
