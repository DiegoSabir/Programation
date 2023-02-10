public class Coche implements  Vehiculo{
    private int velocidadActual;

    private int capacidadMaxima;

    public Coche (int velocidadActual){

        this.velocidadActual = velocidadActual;

        this.capacidadMaxima = 5;
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
