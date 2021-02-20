package algorithm;

/**
 * this is a phonebook application
 * this applications includes below features:
 * 1. add record
 * 2. Viewing List in Ascending Order
 * 3. Search record
 * 4. Modify record
 * 5. Delete record
 *
 * @author : team among_us
 * @version : openJdk 11
 * @since : 20 feb 2021
 */

public class Main {

    public static void main(String[] args) {
        //TODO giving user the option to make a choose.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.ascendingOrder();
        phoneBook.search();
        phoneBook.modify();
    }
}
