package codecool;

public class Jockey {
    static int jockeyCounter = 0;
    String name;
    int knowledge;

    Jockey(String name, int knowledge){
        this.name = name;
        this.knowledge = knowledge;
        jockeyCounter++;
    }
}