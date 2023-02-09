public class MaquinariaIndustrial extends Maquinaria{
    private float potenciaConsumo;

    public MaquinariaIndustrial(String numeroSerie, String modelo, int horasFuncionamiento, float potenciaConsumo){

        super(numeroSerie, modelo, horasFuncionamiento);

        this.potenciaConsumo = potenciaConsumo;
    }

    public float getPotenciaConsumo() {

        return potenciaConsumo;
    }

    public void setPotenciaConsumo(float potenciaConsumo) {

        this.potenciaConsumo = potenciaConsumo;
    }

    public void encender(){

        System.out.println("ON");
    }

    public void apagar(){

        System.out.println("OFF");
    }
}
