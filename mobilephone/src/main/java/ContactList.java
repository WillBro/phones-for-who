import java.util.ArrayList;
import java.util.List;

public class ContactList {
    List<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contactToAdd) {
        contacts.add(contactToAdd);
    }

    public void removeContact(Contact contactToRemove) {
        if (contactExists(contactToRemove)) {
            contacts.remove(contactToRemove);
        }
    }

    public int numberOfContacts() {
        return contacts.size();
    }

    public boolean hasContacts() {
        return !contacts.isEmpty();
    }

    public void printContacts() {
        contacts.forEach(item -> {
            System.out.println("Contact name '" + item.getName() + "' with phone number " + item.getPhoneNumber());
        });
    }

    public void updateContact(Contact contactToUpdate, String newNumber) {
        Contact foundContact = findContactByName(contactToUpdate.getName());

        if (foundContact != null) {
            System.out.println(
                    String.format(
                            "Updating contact '%s' with new number '%s'",
                            contactToUpdate.getName(),
                            newNumber)
            );

            foundContact.setPhoneNumber(newNumber);
        } else {
            // You'd normally want to throw an exception - not here for simplicity
            System.out.println("Problem finding contact to update");
        }
    }

    /**
     * @param contactToFind Contact to look in our contactToFind list
     * @return true if the contactToFind already exists by name, false otherwise
     */
    boolean contactExists(final Contact contactToFind) {
        return findContactByName(contactToFind.getName()) != null;
    }

    public Contact findContactByName(String nameToFind) {
        return contacts
                .stream()
                .filter(
                        item -> item.getName().equals(nameToFind)
                )
                .findFirst()
                .orElse(null);
    }
}
