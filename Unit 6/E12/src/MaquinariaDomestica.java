public class MaquinariaDomestica extends Maquinaria{

    public MaquinariaDomestica(String numeroSerie, String modelo, int horasFuncionamiento) {

        super(numeroSerie, modelo, horasFuncionamiento);
    }

    public void encender(){

        System.out.println("ON");
    }

    public void apagar(){

        System.out.println("OFF");
    }
}
