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
        Figure[] Figures = new Figure[3];

        Figures[0] = new Square(5);
        Figures[1] = new Triangle(5, 2.5);
        Figures[2] = new Circle(5.5);

        for (Figure i: Figures){
            System.out.println("Color: " + i.getColor() + "/ Area: " + i.calculateArea());
        }
    }
}