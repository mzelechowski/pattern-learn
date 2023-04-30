package singleton.lesson;

public class GameEngine {
    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine() {

    }

    public static GameEngine getInstance() {
        return instance;
    }
}
