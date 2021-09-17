public class BuddyInfo {


    private String name;

    private Integer phoneNumber;

    private String address;


    public BuddyInfo() {
        this.name = "Charles";
        this.phoneNumber = 1111111;
        this.address = "27 West Drive";
    }


    public BuddyInfo(String name, Integer phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {

        BuddyInfo buddy1 = new BuddyInfo("Kousha",9999999, "1 Main Street");

        System.out.println("Hello " + buddy1.getName());

    }
}
