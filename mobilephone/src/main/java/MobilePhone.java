public class MobilePhone implements PhoneInterface {
    String phoneType;
    ContactList contactList;

    public MobilePhone(String phoneType) {
        this.phoneType = phoneType;
        this.contactList = new ContactList();
    }

    public ContactList getContactList() {
        return contactList;
    }

    @Override
    public void addContact(Contact contactToAdd) {
        contactList.addContact(contactToAdd);
    }

    @Override
    public void removeContact(Contact contactToRemove) {
        contactList.removeContact(contactToRemove);
    }

    @Override
    public void displayContacts() {
        contactList.printContacts();
    }

    public Contact findContactByName(String name) {
        return contactList.findContactByName(name);
    }

    @Override
    public void quit() {
        // TBD
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phoneType='" + phoneType + '\'' +
                ", has " + contactList.numberOfContacts() +
                '}';
    }
}
