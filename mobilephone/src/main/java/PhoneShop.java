public class PhoneShop {
    public static void main(String[] args) {
        MobilePhone nokia = new MobilePhone("Nokia 3310");

        nokia.addContact(Contact.createContact("John", "07654 321 789"));
        nokia.addContact(Contact.createContact("Sally", "07654 321 789"));
        nokia.addContact(Contact.createContact("Mary", "07654 321 789"));
        nokia.addContact(Contact.createContact("Ian", "07654 321 789"));

        MobilePhone samsung = new MobilePhone("Samsung S5");
        samsung.addContact(Contact.createContact("Frank", "07654 321 789"));

        System.out.println(samsung);
        System.out.println(nokia);

        nokia.displayContacts();

        System.out.println(nokia.findContactByName("Mary"));
        System.out.println(nokia.getContactList().hasContacts());
        System.out.println(nokia.getContactList().numberOfContacts());
        System.out.println(samsung.getContactList().numberOfContacts());
    }
}
