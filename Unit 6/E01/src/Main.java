public class Main {
    public static void main(String[] args) {
        //creando 2 productos
        Producto p1 = new Producto(10);
        Producto p2 = new Producto(30);
        Producto.infoRebajaActual();
        System.out.println("Precio p1: " + p1.getPrecioFinal());
        System.out.println("Precio p2: " + p2.getPrecioFinal());

        //primeras rebajas y se decide bajar todos los precios un 10%
        p2.rebaja = 25;
        p1.infoRebajaActual();
        System.out.println("Precio p1 primeras rebajas: " + p1.getPrecioFinal());
        System.out.println("Precio p2 segundas rebajas: " + p2.getPrecioFinal());

        Producto.rebaja = 50;
        p2.infoRebajaActual();
        System.out.println("Precio p1 segundas rebajas: "  + p1.getPrecioFinal());
        System.out.println("Precio p2 segundas rebajas: "  + p2.getPrecioFinal());
    }
}