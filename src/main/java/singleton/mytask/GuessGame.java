package singleton.mytask;

import java.util.Scanner;

public class GuessGame {
    private int guess = 0;

    private static GuessGame instance = new GuessGame();

    private GuessGame() {

    }

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) Math.floor(Math.random() * 10);
            System.out.println("Rounda: " + (i + 1) + " podaj liczbę: ");
            int yourNumber = scanner.nextInt();
            if (randomNumber == yourNumber) {
                System.out.println("Zgadłes");
                this.guess++;
            } else {
                System.out.println("Nie zgadłeś");
            }
        }
    }

    public int getScore() {
        return this.guess;

    }

}
