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
        BuddyInfo buddy = new BuddyInfo("Tom", 613, "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
