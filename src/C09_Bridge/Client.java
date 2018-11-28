package C09_Bridge;

public class Client {
    public static void main(String[] args) {
        DisplayImpl stringDisplayImpl = new StringDisplayImpl("BISTel");
        CountDisplay countDisplay = new CountDisplay(stringDisplayImpl);

        System.out.println("Common Basic Display");
        countDisplay.display();

        System.out.println("Uniq Count Display");
        countDisplay.multiDisplay(5);
    }
}
