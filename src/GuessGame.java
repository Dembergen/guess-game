public class GuessGame {
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();

    public void startGame() {
        int mustGuess = (int) (Math.random() * 10);
        System.out.println("Число, которое нужно угадать, - " + mustGuess);

        while (true) {
            player1.guess();
            player2.guess();
            player3.guess();

            System.out.println("Первый игрок думает, что это " + player1.number);
            System.out.println("Второй игрок думает, что это " + player2.number);
            System.out.println("Третий игрок думает, что это " + player3.number);

            if (player1.number == mustGuess || player2.number == mustGuess || player3.number == mustGuess) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + (player1.number == mustGuess));
                System.out.println("Второй игрок угадал? " + (player2.number == mustGuess));
                System.out.println("Третий игрок угадал? " + (player3.number == mustGuess));
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
                System.out.println("Число, которое нужно угадать, - " + mustGuess);
            }
        }
    }
}
