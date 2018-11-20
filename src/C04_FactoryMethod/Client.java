package C04_FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Factory idCard = new IDCardFactory();
        Product card1 = idCard.create("홍길동");
        Product card2 = idCard.create("정약용");
        Product card3 = idCard.create("이순신");

        System.out.println();
        System.out.println("==== Direct Use Card");
        card1.use();
        card2.use();
        card3.use();

        System.out.println();
        System.out.println("==== Register Use Card");
        for (Product product:idCard.getRegisterProduct()) {
            product.use();
        }
    }
}
