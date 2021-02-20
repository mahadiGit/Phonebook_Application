package algorithm;

public class BinarySearch {

    /**
     * mid is the mid point of selected partition of the array
     * mid value is compared every time loop runs whether it is
     * equal to name. if equal then control returned to calling method.
     * if not then check if mid name is less than the searched value or
     * greater than the search value. again, if less than the search value then
     * last index of selected partition get decremented by one else start value
     * get incremented by one.
     *
     * @param contacts is sorted contacts array
     * @param name is the person name that need to search from the array
     */
    public void searchContact(RecordInfo[] contacts, String name){
        int start = 0;
        int end = contacts.length -1;
        int mid;

        while(start <= end){
            mid = (start+end)/2;

            if(contacts[mid].getName().compareTo(name) ==0){
                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + contacts[mid].getPhoneNumber());
                return;
            }

            else if(contacts[mid].getName().compareTo(name) < 0){
                start = mid + 1;
            }

            else end = mid - 1;
        }
        System.out.println("Contacts doesn't Exist!!");
    }

    /**
     * this method is as same as previous searchContact method but instead
     * of just showing the result this method will replace/modify the contact info.
     *
     * @param replaceName is the name that will be replaced with the current name.
     * @param phoneNum is the number that will be replaced with the current number.
     */
    public void searchAndModify(RecordInfo[] contacts, String name, String replaceName, long phoneNum){
        int start = 0;
        int end = contacts.length -1;
        int mid;

        while(start <= end){
            mid = (start+end)/2;

            if(contacts[mid].getName().compareTo(name) ==0){
                System.out.println("Before Modification: ");
                System.out.println("Name: " + contacts[mid].getName());
                System.out.println("Phone number: " + contacts[mid].getPhoneNumber());

                contacts[mid].setName(replaceName);
                contacts[mid].setPhoneNumber(phoneNum);
                System.out.println();

                System.out.println("After Modification: ");
                System.out.println("Name: " + contacts[mid].getName());
                System.out.println("Phone number: " + contacts[mid].getPhoneNumber());
                return;
            }

            else if(contacts[mid].getName().compareTo(name) < 0){
                start = mid + 1;
            }

            else end = mid - 1;
        }
        System.out.println("Contacts doesn't Exist!!");
    }
}
