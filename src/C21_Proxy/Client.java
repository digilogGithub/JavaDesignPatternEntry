package C21_Proxy;

public class Client {
    public static void main(String[] args) {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("이름은 현재"+printable.getPrinterName()+"입니다.");
        printable.setPrinterName("Bob");
        System.out.println("이름은 현재"+printable.getPrinterName()+"입니다.");
        printable.print("Hello, world.");
    }
}
