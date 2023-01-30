public class Vegetal extends SerVivo{

    private double altura;

    public Vegetal(String nombrecientifico, String nombrecomun, double altura) {

        super(nombrecientifico, nombrecomun);

        this.altura = altura;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    String alimentar(){

        return null;
    }

}

