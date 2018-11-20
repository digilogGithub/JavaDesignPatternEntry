package C06_Prototype;

public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("Strong Message",underlinePen);
        manager.register("Warning Box",mBox);
        manager.register("Slash Box",sBox);

        Product p1 = manager.create("Strong Message");
        p1.use("Hello, world.");
        Product p2 = manager.create("Warning Box");
        p2.use("Hello, world.");
        Product p3 = manager.create("Slash Box");
        p3.use("Hello, world.");
    }
}
