import java.util.*;

/**
 * Desarrolla un programa que lea constantemente desde la entrada estandar hasta recibir un enter como finalizador.
 * Cada caracter sera almacenado de forma independiente en una coleccion que permitira recuperar el contenido en orden
 * inverso al que fueron introducidos.
 * Una vez recibido enter, recorre la coleccion mostrando por pantalla el contenido almacenado.
 *
 * Recuerda que los caracteres leerse por separado y no se debe emplear la clase String.
 */
public class Main {
    //PILA = STACK
    Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Main stack1 = new Main();
        stack1.completeStack();
        stack1.showStack();
    }

    public void completeStack(){
        Scanner sc = new Scanner(System.in);
        String sequence;
        System.out.println("Write a sequence of characters ('exit' to stop)");
        do{
            sequence = sc.nextLine();
            if(!sequence.equals("exit")){
                stack.push(sequence.charAt(0));
            }
        }
        while(!sequence.equals("exit"));
    }
    public void showStack() {
        int size = stack.size();
        for (int i = 0; i <= size - 1; i++) {
            System.out.println("Sequence " + (size - 1 - i) + ": " + stack.pop());
        }
    }
}