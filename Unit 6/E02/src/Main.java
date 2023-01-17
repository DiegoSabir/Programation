import java.util.Scanner;

public class Viajero{
    private String DNI;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;
}

public Viajero (){
    this.DNI = "39462414A";
    this.nombre = "nombre";
    this.apellidos = "apellidos";
    this.nacionalidad = "nacionalidad";
    this.direccion = "direccion";
}

public void getInfo(String Formato){
    Scanner sc = new Scanner(System.in);
    if (Formato.equals("pausado")){
        String int = 0;
        do{
            cont++;
            switch (cont){
                case 1:
                    System.out.println(getDNI());
                    break;
                case 2:
                    System.out.println(getNombre());
                    break;
                case 3:
                    System.out.println(getApellidos());
                    break;
                case 4:
                    System.out.println(getNacionalidad());
                    break;
                case 5:
                    System.out.println(getDireccion());
                    break;
            }
        } while (intro.equals("")&& cont <= 5);
    }else if (Formato.equals("normal")){
        System.out.println(getDNI());
        System.out.println(getNombre());
        System.out.println(getApellidos());
        System.out.println(getNacionalidad());
        System.out.println(getDireccion());
    }
}