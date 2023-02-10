/**
 * Crear una clase Vehiculo que declare los siguientes miembros:
 * * Una constante VELOCIDAD_MAXIMA
 * * Método frenar (int decremento_vel)
 * * Método acelerar (int incremento_vel)
 *
 * A continuación, crear las clases Coche y Moto, que implementarán la clase anterior Vehiculo.
 * Para la implementación de los métodos, se añadirá o restará el incremento o decremento a la velocidad actual que
 * lleve el tipo de vehículo en ese momento, y se mostrará un mensaje por pantalla.
 * A mayores, en acelerar(), si al realizar el incremento, supera la velocidad máxima emite un aviso por pantalla.
 * Ambas clases, contarán con un método que permita obtener el número de ocupantes máximos que admite el tipo de vehículo.
 *
 * Implementar un programa donde se pruebe la aplicación desarrollada.
 */
public class Main {
    public static void main(String[] args) {

        Coche[] Toyota = new Coche[2];

        Toyota[0] = new Coche(100);
        Toyota[1] = new Coche(90);

        Toyota[0].frenar(10);
        Toyota[0].acelerar(20);
        Toyota[0].capacidad();


        Moto[] Yamaha = new Moto[2];

        Yamaha[0] = new Moto(60);
        Yamaha[1] = new Moto(60);

        Yamaha[0].frenar(10);
        Yamaha[0].acelerar(20);
        Yamaha[0].capacidad();
    }
}