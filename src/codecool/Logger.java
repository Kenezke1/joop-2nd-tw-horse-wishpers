package codecool;

public class Logger{
    

    public static void print(String[] baseLabels, String[] baseStats) {
        
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                            Horse Race                                                            ║");
        System.out.println("╠════════════════════╦════════════════════╦════════════════════╦════════════════════╦════════════════════╦═════════╣");
        System.out.println("║    Jockey name     ║      Horse Name    ║     Max Speed      ║    acceleration    ║       Stamina      ║   W/L   ║");
        System.out.println("╠════════════════════╬════════════════════╬════════════════════╬════════════════════╬════════════════════╬═════════╣");
        System.out.println("╚════════════════════╩════════════════════╩════════════════════╩════════════════════╩════════════════════╩═════════╝");
        System.out.println("");
    }
    
}