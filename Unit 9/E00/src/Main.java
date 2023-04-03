import java.util.*;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Diego", "00001", 1000);
        Cliente c2 = new Cliente("Pablo", "00002", 2000);
        Cliente c3 = new Cliente("Ivan", "00003", 3000);
        Cliente c4 = new Cliente("Ivan", "00003", 3000);

        Set <Cliente> clientesBanco = new HashSet<Cliente>();

        clientesBanco.add(c1);
        clientesBanco.add(c2);
        clientesBanco.add(c3);
        clientesBanco.add(c4);


        for (Cliente i: clientesBanco){
            System.out.println(i.getNombre() + ", " + i.getnCuenta() + ", " + i.getSaldo());
        }



        Iterator<Cliente> it=clientesBanco.iterator();
        while(it.hasNext()){
            String nombre_cliente = it.next().getNombre();
            System.out.println(nombre_cliente);
        }
    }
}