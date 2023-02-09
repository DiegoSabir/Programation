public class Vegetal extends SerVivo{
    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, double altura) {

        super(nombreCientifico, nombreComun);

        this.altura = altura;
    }

    public Vegetal(String nombreCientifico, String nombreComun) {

        super(nombreCientifico, nombreComun);
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public void alimentacion(){

        System.out.println("Fotosintesis");
    }
}

