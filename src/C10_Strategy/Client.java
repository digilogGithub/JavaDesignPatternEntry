package C10_Strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int seed = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Random seed1 : ");
        seed = scanner.nextInt();
        Player player1 = new Player("PLAY1", new WinningStrategy(seed));
        System.out.print("Input Random seed2 : ");
        seed = scanner.nextInt();
        Player player2 = new Player("PLAY2", new WinningStrategy(seed));
        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)) {
                player1.win();
                player2.lose();
                System.out.println("Winner : "+player1);
            } else if(nextHand2.isStrongerThan(nextHand1)) {
                player2.win();
                player1.lose();
                System.out.println("Winner : "+player2);
            } else {
                player1.even();
                player2.even();
                System.out.println("Even...");
            }
        }
        System.out.println("Total Result : ");
        System.out.println(player1);
        System.out.println(player2);
    }
}
