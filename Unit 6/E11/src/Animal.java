public class Animal extends SerVivo{

    private double altura;
    private double peso;

    public Animal(String nombreCientifico, String nombreComun, double altura, double peso) {

        super(nombreCientifico, nombreComun);

        this.altura = altura;

        this.peso = peso;
    }

    public Animal(String nombreCientifico, String nombreComun) {

        super(nombreCientifico, nombreComun);
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

    public void alimentacion(){
        System.out.println("kgktkg");
    }
}
