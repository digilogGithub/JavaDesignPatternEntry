package C10_Strategy;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
