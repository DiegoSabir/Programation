public class ConversorFechas {

    public String normalToAmericano(String s) {

        if (s.charAt(2) == '/' && s.charAt(5) == '/' && s.length() == 10){

            return s.substring(3, 5) + "/" +s.substring(0, 2) + "/" + s.substring(6);
        }
        else {

            return "Formato de fecha no válido";
        }
    }

    public String americanoToNormal(String s) {

        if (s.charAt(2) == '/' && s.charAt(5) == '/' && s.length() == 10){

            return s.substring(3, 5) + "/" + s.substring(0, 2) + "/" + s.substring(6);
        }
        else {

            return "Formato de fecha no válido";
        }
    }
}
