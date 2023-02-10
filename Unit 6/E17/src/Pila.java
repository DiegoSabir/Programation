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


    Object first() {

        if (isEmpty()) {

            return null;
        }
        else {

            return array[contador - 1];
        }
    }

    public Object add(Object objeto) {
        if(i == array.length){

            return true;
        }
        else{
            i++;
            return false;
        }

    }
}
