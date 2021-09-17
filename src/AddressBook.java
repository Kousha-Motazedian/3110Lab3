import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> addressBook = new ArrayList<>();

    public AddressBook(){}

    public void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
