/**
 * Se desea modelar una aplicación con las siguientes entidades y datos: una entidad base Figura que contenga el campo
 * color y dos métodos: getColor y calcularArea, que variará en función del tipo de Figura con la que se esté trabajando
 * en la clase.
 *
 * Deberá existir también otra clase Cuadrado que herede de Figura, que contenga un atributo lado, y que implemente los
 * métodos que sean necesarios.
 *
 * Además, existirá una clase Triangulo con 2 atributos base y altura y que implemente los métodos necesarios.
 *
 * Por último, crear una clase de prueba para comprobar el funcionamiento del programa, empleando polimorfismo.
 */
public class Main {
    public static void main(String[] args) {

        Figura[] Geometria = new Figura[2];

        Geometria[0] = new Cuadrado("Azul",5);
        Geometria[1] = new Triangulo("Rojo",5,5);

        for(Figura f: Geometria) {

            System.out.println(f.calcularArea());
        }
    }
}