import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
        TreeSet<String> ordenaPersonas = new TreeSet<String>();

        ordenaPersonas.add("Diego");
        ordenaPersonas.add("Pablo");
        ordenaPersonas.add("Ivan");

        for (String i: ordenaPersonas){
            System.out.println(i);
        }
        */

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(1, "Segundo articulo");
        Articulo tercero = new Articulo(1, "Tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);

        for (Articulo i: ordenaArticulos){
            System.out.println(i.getDescripcion());
        }

       // Articulo comparadorArticulos = new Articulo();
       // TreeSet <Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);

        ComparadorArticulos compara_art = new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {

            public int compare(Articulo o1, Articulo o2) {
                String desc1 = o1.getDescripcion();
                String desc2 = o2.getDescripcion();

                return desc1.compareTo(desc2);
            }
        });

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);

        for (Articulo art: ordenaArticulos2){
            System.out.println(art.getDescripcion());
        }
    }
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
    private int numero_articulo;
    private String descripcion;
    public Articulo(){

    }
    public Articulo(int numero, String desc){
        numero_articulo=numero;
        descripcion=desc;
    }

    @Override
    public int compareTo(Articulo o){
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public int compare(Articulo arg0, Articulo arg1) {
        String descripcionA = arg0.getDescripcion();
        String descripcionB = arg1.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }
}

class ComparadorArticulos implements Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String desc1 = o1.getDescripcion();
        String desc2 = o2.getDescripcion();

        return desc1.compareTo(desc2);
    }
}
