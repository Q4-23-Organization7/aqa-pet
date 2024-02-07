package hw_11;

public class RockPaperScissors {

    public User user;
    public Computer computer;
    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
    }

    public void startGame() {
        System.out.println("ROCK, SCISSORS, PAPER!");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYour turn " + userMove + ".");
        System.out.println("Computer turn " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Game Draw!");
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + ". You win!");
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ". You lose.");
                break;
        }

        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            System.out.println("Game Over!");
        }
    }
}




