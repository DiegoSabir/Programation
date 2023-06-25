public class E06 {

    // GENERAR COMBINACIONES CON LOS DÍGITOS:
    public static int[] generarCombinaciones (int[] digitos) {
        int cont = 0;
        int[] combinaciones = new int[24];

        for (int i = 0; i < digitos.length; i++) {

            for (int j = 0; j < digitos.length; j++) {
                if (digitos[i] == digitos[j]) continue; //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES

                for (int k = 0; k < digitos.length; k++) {
                    if (digitos[k] == digitos[i] || digitos[k] == digitos[j]) continue; //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES

                    for (int l = 0; l < digitos.length; l++) {
                        if (digitos[l] == digitos[i] || digitos[l] == digitos[j] || digitos[l] == digitos[k]) continue; //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES
                        combinaciones[cont++] = digitos[i] * 1000 + digitos[j] * 100 + digitos[k] * 10 + digitos[l];
                    }
                }
            }
        }
        return combinaciones;
    }

    public static void esVampiro(int[] digitos) {
        boolean esVampiro = false;
        int pareja1, pareja2, multiplicacionParejas;

        int[] combinaciones = generarCombinaciones(digitos);

        // GENERAR PAREJAS Y COMPROBACIÓN:
        for (int i = 0; i < digitos.length && !esVampiro; i++) {
            for (int j = 0; j < digitos.length && !esVampiro; j++) {
                if (digitos[i] == digitos[j]) continue;  //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES
                pareja1 = digitos[i] * 10 + digitos[j];

                for (int k = 0; k < digitos.length && !esVampiro; k++) {
                    if (digitos[k] == digitos[i] || digitos[k] == digitos[j]) continue;    //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES

                    for (int l = 0; l < digitos.length && !esVampiro; l++) {
                        if (digitos[l] == digitos[i] || digitos[l] == digitos[j] || digitos[l] == digitos[k]) continue;   //EXCLUIMOS COMBINACIONES DE DÍGITOS IGUALES
                        pareja2 = digitos[k] * 10 + digitos[l];

                        multiplicacionParejas = pareja1 * pareja2;

                        // COMPROBAMOS QUE LA MULTIPLICACIÓN DE ALGUNA PAREJA COINCIDA CON ALGUNA DE LAS COMBINACIONES OBTENIDAS
                        for (int comb : combinaciones) {
                            if (multiplicacionParejas == comb) {
                                System.out.println("Es vampiro: " + pareja1 + " x " + pareja2 + " = " + multiplicacionParejas);
                                esVampiro = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!esVampiro)
            System.out.println("El número " + digitos[3] + digitos[2] + digitos[1] + digitos[0] + " no es vampiro.");
    }

    public static int[] getDigitos(int numero) {
        int[] toRet = new int[4];
        int aux = numero;
        int i = 0;
        while (aux>0){
            toRet[i] = aux%10;
            aux = aux/10;
            i++;
        }
        return toRet;
    }

    public static void main(String[] args) {
        esVampiro(getDigitos(1234));
        esVampiro(getDigitos(1206));
        esVampiro(getDigitos(2187));
    }
}
