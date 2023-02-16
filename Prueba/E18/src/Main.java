/**
 * Crear una clase Vehiculo que declare los siguientes miembros:
 * * Una constante VELOCIDAD_MAXIMA = 120;
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
        Vehicles[] Vehicle = new Vehicles[4];

        Vehicle[0] = new Car(50);
        Vehicle[1] = new Car(110);
        Vehicle[2] = new Motorcycle(80);
        Vehicle[3] = new Motorcycle(120);

        for (Vehicles i: Vehicle){
            if (i instanceof Car){
                //System.out.println(((Car)i).brake(10));
                System.out.println("The actual speed is " + ((Car)i).accelerate(10));
                System.out.println("The maximum capacity is " + ((Car)i).maxCapacity(5));
            }
            if (i instanceof Motorcycle){
                //System.out.println(((Motorcycle)i).brake(10));
                System.out.println("The actual speed is " + ((Motorcycle)i).accelerate(10));
                System.out.println("The maximum capacity is " + ((Motorcycle)i).maxCapacity(2));
            }
        }
    }
}