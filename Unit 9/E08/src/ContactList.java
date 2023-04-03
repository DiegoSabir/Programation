import java.util.*;
public class ContactList {
    private ArrayList<Contact> contacts;
    private final int SIZE;

    public ContactList() {
        this.contacts = new ArrayList<>();
        this.SIZE = 10;
    }

    public ContactList(int size) {
        this.contacts = new ArrayList<>();
        this.SIZE = size;
    }

    public void addContacts(Contact account) {
        if (contactExist(account)) {
            System.out.println("There is already a contact with that name");
        }
        else if (contactListFull()) {
            System.out.println("The contact list is full");
        }
        else {
            contacts.add(account);
        }
    }

    public boolean contactExist(Contact account) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().trim()
                    .equalsIgnoreCase(account.getName().trim())) {
                return true;
            }
        }
        return false;
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("0 contacts to show");
        }
        else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(contacts.get(i));
            }
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < contacts.size() && !found; i++) {
            if (contacts.get(i).getName().trim()
                    .equalsIgnoreCase(name.trim())) {
                System.out.println("Telephone number: " + contacts.get(i).getTelephone());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact no found");
        }
    }

    public boolean contactListFull() {
        return this.contacts.size() >= this.SIZE;
    }

    public void removeContact(Contact account) {
        if (contacts.remove(account)) {
            System.out.println("Contact has been removed");
        }
        else {
            System.out.println("Contact not found");
        }
    }

    public int freeSpace() {
        return this.SIZE - this.contacts.size();
    }
}
