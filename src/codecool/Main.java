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
    Main x = new Main();
    Date d = new Date();
    System.out.println(d);

    Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
    System.out.println(timeStamp);

    System.out.println(sdf.format(timeStamp));
    
    }
}