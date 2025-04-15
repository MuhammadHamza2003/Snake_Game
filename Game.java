import java.util.Scanner;
public class Game {
    private static Scanner input = new Scanner(System.in);
    static public void game() {
        while (true) {
            int diceRoll = Generate_Random_Number.generatNumber();
            if (diceRoll == 6){
                System.out.println("\nYou rolled a 6!\n");
                System.out.println("Start......");
                return;
            }
            input.nextLine();
            System.out.println(diceRoll + " is rolled \n");
            System.out.println("Press Enter to roll the dice...");
        }
    }
    
}
