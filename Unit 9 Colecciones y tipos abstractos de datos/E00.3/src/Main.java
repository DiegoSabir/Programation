import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();

        personas.add("Diego");
        personas.add("Pablo");
        personas.add("Ivan");

        System.out.println(personas.size());

        ListIterator<String> it=personas.listIterator();
        it.next();
        it.add("Fran");

        for (String i: personas){
            System.out.println(i);
        }
//------------------------------------------------------------------------------------------------
        LinkedList<String> paises = new LinkedList<String>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<String>();

        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("Ciudad de Mexico");
        capitales.add("Lima");

        ListIterator<String> iterA = paises.listIterator();
        ListIterator<String> iterB = capitales.listIterator();

        while(iterB.hasNext()){
            if(iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);

        iterB = capitales.listIterator();

        while (iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()){
                iterB.next();
                iterB.remove();
            }
        }
        System.out.println(capitales);
        paises.removeAll(capitales);
        System.out.println(paises);
    }
}