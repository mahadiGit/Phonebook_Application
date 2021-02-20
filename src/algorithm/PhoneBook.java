package algorithm;

import java.util.Scanner;

public class PhoneBook implements PhonebookActions{
    private final RecordInfo[] sortedContacts = SavedContacts.contacts();

    /**
     * here PhoneBook constructor calling quicksort class
     * and sorting the unsorted contacts. and as we know constructor get executed along with the
     * class execution, so the sorted contacts can be used by any other methods.
     */
    public PhoneBook(){
      new QuickSort().sort(sortedContacts, 0, sortedContacts.length-1);
    }

    @Override
    public void add() {
        //TODO implementing adding
    }

    @Override
    public void ascendingOrder() {
        System.out.println("Contacts in Ascending order: ");

        for (RecordInfo sortedContact : sortedContacts) {
            System.out.println("Name: " + sortedContact.getName());
            System.out.println("Number: " + sortedContact.getPhoneNumber());
            System.out.println();
        }
    }

    @Override
    public void search() {
        System.out.print("Which contact you are looking for: ");
        String name = new Scanner(System.in).nextLine();

        new BinarySearch().searchContact(sortedContacts, name);
    }

    /**
     * this method taking three input
     * > contact's name that need to modify
     * > new name that will be replaced with current name
     * > new phoneNumber that will be replaced with current phone number.
     *
     * after taking three input they sent to searchAndModify method and
     * that method replace the name and number.
     */
    @Override
    public void modify() {
        System.out.print("Which contact you want to modify: ");
        String contactNameToModify = new Scanner(System.in).nextLine();

        System.out.print("Give new Name: ");
        String replaceName = new Scanner(System.in).nextLine();

        System.out.print("Give new Number: ");
        long replaceNumber = new Scanner(System.in).nextLong();

        new BinarySearch().searchAndModify(sortedContacts, contactNameToModify, replaceName, replaceNumber);

        System.out.println("\nFinal PhoneBook: ");
        ascendingOrder();
    }

    @Override
    public void delete() {
        //TODO implementing delete.
    }
}
