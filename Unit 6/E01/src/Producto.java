public class Producto {
    public static int rebaja;
    private int PrecioFinal;

    public Producto(int PrecioFinal){

        this.PrecioFinal = PrecioFinal;
    }

    public static void infoRebajaActual(){

        System.out.println("Rebaja actual: " + rebaja);
    }

    public double getPrecioFinal(){
        this.PrecioFinal = PrecioFinal - PrecioFinal*rebaja/100;

        return this.PrecioFinal;
    }
}
