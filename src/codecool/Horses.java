package codecool;

public class Horses{
    static int horseCounter = 0;
    String name;
    int maxSpeed;
    int acceleration;
    int stamina;
    boolean tired;
    int tiredSpeed;

    Horses(String name, int maxSpeed, int acceleration, int stamina,int tiredSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.stamina = stamina;
        this.tired = false;
        this.tiredSpeed = tiredSpeed;
        horseCounter++;
    }
    public int getHorseCounter() {
        return horseCounter;
    }
    public  void setTired(){
        this.tired = true;
    }
    
}