public class Repartidor extends Empleado {
    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {

        super(nombre, edad, salario);

        this.zona = zona;
    }

    public String getZona() {

        return zona;
    }

    public void setZona(String zona) {

        this.zona = zona;
    }

    public String toString(){

        //return getNombre() + getEdad() + getSalario() + comision;
        return super.toString() + zona;
    }

    public double plus(){
        if(getEdad() < 25 && zona.equals(3)){

            setSalario(getPLUS() + getSalario());
        }
        return getSalario();
    }

}
