package singleton.mytask;

public class GuessPlay {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();
        System.out.println("Twój wynik to: "+ score);

        GuessGame anotherGameReference = GuessGame.getInstance();
        System.out.println("Wynik wg nowej referencji: "+ anotherGameReference.getScore());

        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }

    }
}
