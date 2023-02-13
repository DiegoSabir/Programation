public class Comercial extends Empleado {
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {

        super(nombre, edad, salario);

        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String toString(){

        //return getNombre() + getEdad() + getSalario() + comision;
        return super.toString() + comision;
    }

    public double plus(){
        if(getEdad() > 30 && comision > 200){

            setSalario(getSalario() + PLUS + comision);
        }
        return getSalario();
    }
}
