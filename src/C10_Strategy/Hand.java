package C10_Strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hand {
    private int handvalue;
    public static final int HAMDVALUE_ROCK=0;
    public static final int HAMDVALUE_SCISSORS=1;
    public static final int HAMDVALUE_PAPER=2;
    public static final Hand[] hands = {
            new Hand(HAMDVALUE_ROCK),
            new Hand(HAMDVALUE_SCISSORS),
            new Hand(HAMDVALUE_PAPER)
    };

    private static final String[] name = {
            "Rock","Scissors","Paper"
    };

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getInstance(int handvalue) {
        return hands[handvalue];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand){
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if(this == hand)
            return 0;
        else if ((this.handvalue+1)%3==hand.handvalue)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return name[handvalue];
    }
}
