package RAMA.satelite;

public class satelite2 {
    private double altura;
    private double meridiano;
    private double paralelo;

    public satelite2(){
        altura=meridiano=paralelo=0;
    }

    public satelite2(double altura, double paralelo, double meridiano) {
        this.altura = altura;
        this.meridiano = meridiano;
        this.paralelo = paralelo;
    }

    public void variaAltura(double desplazamiento) {
        altura += desplazamiento;
    }

    public boolean enOrbita(){
        return altura>0;
    }

    public void variaPosicion(double variaP, double variam) {
        paralelo += variaP;
        meridiano += variam;
    }

}
