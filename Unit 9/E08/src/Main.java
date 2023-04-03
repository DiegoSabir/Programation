import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Se va a implementar una agenda telefónica de contactos.
 * Un contacto está definido por un nombre y un teléfono (No es necesario validar). Un contacto es igual a otro cuando sus nombres son iguales.
 * Una agenda de contactos está formada por un conjunto de contactos
 *
 * La agenda se podrá crear de dos formas, indicándole el tamaño o con un tamaño por defecto (10)
 * Métodos:
 *  - anhadirContacto(Contacto c): Añade un contacto a la agenda, si no se pueden meter más a la agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
 *  - existeContacto(Contacto c): indica si el contacto pasado existe o no.
 *  - listarContactos(): Lista toda la agenda
 *  - buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
 *  - eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
 *  - agendaLlena(): indica si la agenda está llena.
 *  - huecosLibres(): indica cuántos contactos más podemos meter.
 *
 * Crea un menú con opciones por consola para probar todas estas funcionalidades.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean exit = false;
        int choose;

        ContactList listContact = new ContactList(3);
        String name;
        int telephone;

        Contact account;

        while (!exit) {
            System.out.println("1. Add contact");
            System.out.println("2. List contacts");
            System.out.println("3. Search contacts");
            System.out.println("4. Check contact existence");
            System.out.println("5. Remove contact");
            System.out.println("6. Show contacts");
            System.out.println("7. Check contact list full");
            System.out.println("8. Exit");
            try {
                System.out.println("Escribe una de las opciones");
                choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("Name: ");
                        name = sc.next();
                        System.out.println("Telephone: ");
                        telephone = sc.nextInt();
                        account = new Contact(name, telephone);
                        listContact.addContacts(account);
                        break;

                    case 2:
                        listContact.listContacts();
                        break;

                    case 3:
                        System.out.println("Name: ");
                        name = sc.next();
                        listContact.searchByName(name);
                        break;

                    case 4:
                        System.out.println("Name: ");
                        name = sc.next();
                        account = new Contact(name, 0);
                        if (listContact.contactExist(account)) {
                            System.out.println("Contact found");
                        }
                        else {
                            System.out.println("Contact not found");
                        }
                        break;

                    case 5:
                        System.out.println("Name:");
                        name = sc.next();
                        account = new Contact(name, 0);
                        listContact.removeContact(account);
                        break;

                    case 6:
                        System.out.println("Free space: " + listContact.freeSpace());
                        break;

                    case 7:
                        if (listContact.contactListFull()) {
                            System.out.println("The contact list is full");
                        }
                        else {
                            System.out.println("You can still introduce contacts");
                        }
                        break;

                    case 8:
                        exit = true;
                        break;

                    default:
                        System.out.println("Only numbers between 1 y 8");
                }

            } catch (InputMismatchException e) {
                System.out.println("Introduce a number");
                sc.next();
            }
        }
    }
}