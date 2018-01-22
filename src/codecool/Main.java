package codecool;
import codecool.Horses;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Horses[] horses = new Horses[Horses.horseCounter];

    public Horses[] generateSimulation(int round){
        
        return horses;
    }
    public Horses[] HorseReading(String CSVPath) throws FileNotFoundException{

        String line = null;
        int numLines = 0;
        try(BufferedReader readhorses = new BufferedReader(new FileReader(CSVPath))){
            while(readhorses.readLine() != null ){
                numLines++;
            }
            readhorses.close();

        }catch(IOException e){
            e.printStackTrace();


        }
        try(BufferedReader readhorses = new BufferedReader(new FileReader(CSVPath))){
            int count = 0;
            horses = new Horses[numLines];
            while((line = readhorses.readLine()) != null){
                String[] attributes = line.split(",");
                horses[count] = new Horses(attributes[0], Integer.parseInt(attributes[1]),Integer.parseInt(attributes[2]),Integer.parseInt(attributes[3]),Integer.parseInt(attributes[4]));
                count++;

            }
            readhorses.close();
            
        }catch(IOException i){
            i.printStackTrace();
        }
        return horses;
        


    }

public static void main(String[] args){
    Main x = new Main();
    Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
    try {
        x.HorseReading("/home/kenez/Java files/joop-2nd-tw-horse-wishpers/src/codecool/horses.csv");
    } catch(FileNotFoundException z){
        z.printStackTrace();
    }
    System.out.println(x.horses.length);

    System.out.println(Horses.horseCounter);

    System.out.println(sdf.format(timeStamp));
    
    }
}