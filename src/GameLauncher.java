public class GameLauncher {
    public static void main(String[] args) {
        System.out.println("Я загадываю число от 0 до 9...");
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

