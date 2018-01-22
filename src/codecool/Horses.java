package codecool;

public class Horses{
    static int horseCounter = 0;
    String name;
    int maxSpeed;
    int acceleration;
    int stamina;

    Horses(String name, int maxSpeed, int acceleration, int stamina){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.stamina = stamina;
        horseCounter++;
    }
    public int getHorseCounter() {
        return horseCounter;
    }
    
}