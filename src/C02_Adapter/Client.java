package C02_Adapter;

public class Client {
    public static void main(String[] args) {
        Print printBanner = new PrintBanner("Hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
