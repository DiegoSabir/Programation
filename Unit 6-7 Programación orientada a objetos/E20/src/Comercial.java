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

    public double plus(){
        if(getEdad() > 30 && comision > 200){
            setSalario(getSalario() + comision + PLUS);
        }
        return getSalario();
    }

    public String toString(){
        //return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + getSalario() + ", Comision: " + comision;
        return super.toString() + ", comision=" + comision + ", plus=" + plus();
    }
}
