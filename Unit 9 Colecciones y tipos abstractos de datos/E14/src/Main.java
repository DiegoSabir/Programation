/**
 * Modifica el ejercicio de Bebidas para incorporar una clase Almacén en la que se lleve un registro de
 * todos los productos comercializados. Para dicho registro, la clase deberá contener una estructura
 * donde las claves de los productos serán números enteros, y el valor será el producto comercializado.
 *
 * Se establecerá un tamaño máximo de Almacén por defecto a 20. No obstante, dicho valor podrá recibirse
 * por constructor y asignarse de forma interna al atributo.
 *
 * Además, se implementarán métodos que permitan agregar un producto al registro, verificar que exista
 * un producto dentro del almacén (comprobando por identificador), listar productos y eliminar
 * un producto.
 *
 * Por último, en la clase ejecutable, se cambiará el array estático por uno dinámico.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Drink> inventory = new ArrayList<>();
        inventory.add(new Water(1,"agua sousas","Gadis Teis",1.20,"botella de cristal","Sousas"));
        inventory.add(new Water(2,"Aguarón","Froiz Plaza E",0.75,"botella de plástico","aguarón"));
        inventory.add(new Water(3,"Agua mondariz","Mercadona Aragón",1.10,"botella de cristal","Mondariz"));
        inventory.add(new Soda());
        inventory.add(new Soda(4,"Kas Naranja","Lidl Teis",1.00,"lata",7.0));

        //calculoMedias(inventory);
        storageRunning();
    }

    public static void storageRunning() {
        Storage a = new Storage();
        a.addProduct(new Water(101, "manantial1", "zona1", 2, "botella cristal", "Bezoya"));
        a.addProduct(new Water(102, "manantial2", "zona3", 1, "botella plástico", "Mondariz"));
        a.addProduct(new Soda(201, "Fanta", "zona1", 2, "lata", 5));
        a.addProduct(new Soda(202, "Nestea", "zona3", 1.5, "lata", 8));
        a.addProduct(new Soda(203, "Aquarius", "zona2", 2, "botella plástico", 9));

        a.showProducts();

        a.deleteProduct(202);

        a.showProducts();
    }

    public static void calculoMedias(ArrayList<Drink> array){
        double sumaRefrescos = 0, sumaAguas = 0;
        double contAgua = 0, contRefrescos = 0;

        for(int i=0;i<array.size();i++){

            array.get(i).calcularPrecio();

            if (array.get(i) instanceof Drink){
                sumaRefrescos += array.get(i).getPrecio();
                contRefrescos++;
            }

            if (array.get(i) instanceof Water){
                sumaAguas += array.get(i).getPrecio();
                contAgua++;
            }

            System.out.println("El precio de " + array.get(i).getNombre() + " es: " + array.get(i).getPrecio() + " €");
        }
        System.out.println("La media de precio de los refrescos es " + sumaRefrescos/contRefrescos + " €");
        System.out.println("La media de precio del agua mineral es " + sumaAguas/contAgua + " €");
    }
}