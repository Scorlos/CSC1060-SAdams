import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of sides for your dice: ");
        int numSides = in.nextInt();
        System.out.println("Please enter the number of players: ");
        int players = in.nextInt();
        ArrayList<Player> gamePlayers = new ArrayList<>();
        in.nextLine();

        for (int i = 1; i <= players; i++) {
            System.out.println("Please enter the name of Player " + i + ": ");
            String name = in.nextLine();
            gamePlayers.add(new Player(name, new Die(numSides)));
        }

        for (int i = 1; i <= players; i++) {
            gamePlayers.get(i - 1).getDie().roll();
            System.out.println("Player " + gamePlayers.get(i - 1).getName() + " rolled a " +
                    gamePlayers.get(i - 1).getDie().getValue() + " on a " + numSides + " sided die.");
        }

        int winner = decideWinner(gamePlayers);
        if (winner >= 0) {
            System.out.println(gamePlayers.get(winner).getName() + " won the game.");
        }
    }

    public static int decideWinner(ArrayList<Player> gamePlayers) {
        int greatest = 0;
        for (int i = 0; i < gamePlayers.size(); i++) {
            if (gamePlayers.get(0).getDie().getValue() < gamePlayers.get(i).getDie().getValue()) {
                greatest = i;
            } else if (gamePlayers.get(0).getDie().getValue() == gamePlayers.get(i).getDie().getValue() && i != 0) {
                System.out.println("Players " + gamePlayers.get(0).getName() + " and " +
                        gamePlayers.get(i).getName() + " tied the game.");
                return -1;
            }
        }
        return greatest;
    }
}