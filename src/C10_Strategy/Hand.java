package C10_Strategy;

public class Hand {
    private int handValue;
    public static final int HANDVALUE_ROCK = 0;
    public static final int HANDVALUE_SCISSORS = 1;
    public static final int HANDVALUE_PAPER = 2;
    public static final Hand[] hands = {
            new Hand(HANDVALUE_ROCK),
            new Hand(HANDVALUE_SCISSORS),
            new Hand(HANDVALUE_PAPER)
    };

    private static final String[] name = {
            "Rock", "Scissors", "Paper"
    };

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getInstance(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand)
            return 0;
        else if ((this.handValue + 1) % 3 == hand.handValue)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return name[handValue];
    }
}
