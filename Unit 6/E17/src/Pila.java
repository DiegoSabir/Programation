import java.util.NoSuchElementException;

public class Pila implements CollectionInterface{
    private Object[] array;
    private int contador;

    public Pila(int tamaño) {

        array = new Object[tamaño];
        contador = 0;
    }

    public boolean isEmpty(){
        if (contador == 0){

            return true;
        }
        else{

            return false;
        }
    }
    public Object get() {
        if (isEmpty()){

            return null;
        }
        else{

            Object toReturn = array[--contador];
            eliminarUltimoElemento();
            return toReturn;
        }
    }


    public Object first() {

        if (isEmpty()) {

            return null;
        }
        else {

            return array[contador - 1];
        }
    }

    public Object add(Object objeto) {
        if(contador == array.length){

            return false;
        }
        else{
            array[contador] = objeto;
            contador++;
            return true;
        }
    }

    private void eliminarElementoModificaTamaño () {

        Object[] arrayCopy = new Object[array.length-1];
        for (int i=0; i <= array.length-2; i++) {

            arrayCopy[i] = array[i];
        }
        array = arrayCopy;
        for (Object o : array) {

            System.out.println(o);
        }
    }

    private void eliminarUltimoElemento () {

        array[contador] = null;
        System.out.println("Contenido tras eliminar: ");
        for (Object o : array) {

            System.out.println(o);
        }
    }
}
