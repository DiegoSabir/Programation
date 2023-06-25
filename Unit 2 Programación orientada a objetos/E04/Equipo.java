package Ejercicio1_Sintesis;

public class Equipo {
    private String nombre;
    private double presupuesto;

    Equipo(){
        System.out.println("Constructor");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
