public class Animal extends SerVivo{

    private double altura;
    private double peso;

    public Animal(String nombrecientifico, String nombrecomun, double altura, double peso) {

        super(nombrecientifico, nombrecomun);

        this.altura = altura;

        this.peso = peso;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    String alimentar(){

        return null;
    }

}
