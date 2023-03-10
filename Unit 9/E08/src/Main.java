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
        System.out.println("Hello world!");
    }
}