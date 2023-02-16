/**
 * Vamos a crear una clase Titular. Sus atributos son: nombre , edad y DNI.
 * Construye los siguientes metodos para la clase:
 *
 * Un constructor, donde los datos pueden estar vacios.
 * Los setters y getters para cada uno de los atributos.
 * mostrar(): Muestra los datos de la persona.
 * esMayorDeEdad(): Devuelve un valor logico indicando si es mayor de edad.
 *
 * A continuacion, sustituye en la clase Cuenta y CuentaJoven todas las referencias al titular, para que, en vez de
 * gestionar sus datos a traves de atributos, lo realice mediante un objeto de tipo Titular.
 */
public class Owner {
    private String name;
    private int age;
    private String dni;

    public Owner() {
        this.name = "";
        this.age = 0;
        this.dni = "";
    }

    public Owner(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isAdult(){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    public String show() {
        return "Owner{" +
                "name=" + name +
                ", age=" + age +
                ", dni=" + dni +
                '}';
    }
}
