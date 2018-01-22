package codecool;
import codecool.Horses;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Horses[] horses = new Horses[Horses.horseCounter];

    public Horses[] generateSimulation(int round){
        
        return horses;
    }

public static void main(String[] args){
    Horses horse1 = new Horses("Flash", 50, 5, 2000, 40);
    Horses horse2 = new Horses("Kincsem", 49, 4, 2000, 37);
    Horses horse3 = new Horses("Overdose", 53, 6, 4000, 33);
    Horses horse4 = new Horses("Ló", 47, 4, 1900, 36);
    Horses horse5 = new Horses("Bajnok", 47, 5, 2300, 37);
    Horses horse6 = new Horses("Matilda", 46, 5, 2200, 36);
    Horses horse7 = new Horses("Akaba", 45, 4, 2300, 35);
    Horses horse8 = new Horses("Táltos", 48, 4, 2100, 37);
    Horses horse9 = new Horses("Ráró", 49, 5, 1900, 42);
    Horses horse10 = new Horses("Démon", 50, 7, 2200, 40);

    System.out.println(sdf.format(timeStamp));
    
    }
}