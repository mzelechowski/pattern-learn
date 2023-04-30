package singleton.lesson;

import singleton.lesson.GameEngine;

public class SingletonExample {
    public static void main(String[] args) {
        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();
        System.out.println(engine==engine2);
    }
}
