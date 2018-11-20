package C03_TemplateMethod;

public class Client {
    public static void main(String[] args) {
        AbstractDisplay ad1 = new CharDisplay('H');
        AbstractDisplay ad2 = new StringDisplay("Hello, world.");
        AbstractDisplay ad3 = new StringDisplay("안녕하세요.");

        ad1.display();
        ad2.display();
        ad3.display();
    }
}
