public class MobilePhone implements PhoneInterface {
    String phoneType;
    ContactList contactList;

    public MobilePhone(String phoneType) {
        this.phoneType = phoneType;
        this.contactList = new ContactList();
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

    @Override
    public void quit() {

    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phoneType='" + phoneType + '\'' +
                ", has " + contactList.numberOfContacts() +
                '}';
    }
}
