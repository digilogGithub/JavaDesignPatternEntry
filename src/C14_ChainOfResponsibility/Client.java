package C14_ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Support alice = new NoSupport("ALice");
        Support bob = new LimitSupport("Bob", 5);
        Support charlie = new SpecialSupport("Charlie", 18);
        Support diana = new LimitSupport("Diana", 10);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 20);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        for (int i = 0; i < 30; i++) {
            alice.support(new Trouble(i));
        }
    }
}
