public class Moto implements Vehiculo{
    int velocidadActual;

    int capacidadMaxima;

    public Moto (int velocidadActual){

        this.velocidadActual = velocidadActual;

        this.capacidadMaxima = 2;
    }

    public int getVelocidadActual() {

        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {

        this.velocidadActual = velocidadActual;
    }

    public int frenar (int decrementoVelocidad){

        velocidadActual -= decrementoVelocidad;

        System.out.println("Velocidad Actual: " + velocidadActual);

        return velocidadActual;
    }

    public int acelerar (int incrementoVelocidad){

        velocidadActual += incrementoVelocidad;

        if (incrementoVelocidad > VELOCIDADMAXIMA){

            System.out.println("SOBREPASO EN EL LIMITE DE VELOCIDAD");
        }
        else{

            System.out.println("Velocidad Actual: " + velocidadActual);
        }
        return velocidadActual;
    }

    public int capacidad(){

        return capacidadMaxima;
    }
}
