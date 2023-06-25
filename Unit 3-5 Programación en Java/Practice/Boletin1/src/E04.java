public class E04 {
    public static void main(String[] args){
        char car;
        boolean consonante;
        for (int i = 0; i < 100; i++) {
            consonante = true;
            car = (char) (Math.random() * 26 + 'A');
            switch (car) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    consonante = false;
                    break;
            }
            System.out.print("Generado: " + car + " -> ");
            if (consonante) {
                System.out.println("consonante");
            } else {
                System.out.println("vocal");
            }
        }
    }
}
