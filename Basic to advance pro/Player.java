class Player {

    private String playerName;
    private int score;

    Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    void addScore(int points) {
        if (points > 0) {
            score = score + points;
            System.out.println(points + " points added!");
        }
    }

    void displayDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Total Score: " + score);
    }

    int getScore() {
        return score;
    }

    String getName() {
        return playerName;
    }
}

public class GamingTournamentDemo {

    public static void main(String[] args) {

        Player player1 = new Player("Sai");
        Player player2 = new Player("Rahul");

        player1.addScore(100);
        player1.addScore(50);

        player2.addScore(120);

        System.out.println();

        player1.displayDetails();
        player2.displayDetails();

        System.out.println();

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Winner: " + player1.getName());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Winner: " + player2.getName());
        } else {
            System.out.println("Match Draw!");
        }
    }
}