import java.util.Scanner;
public class Game {
    private static Scanner input = new Scanner(System.in);
    static public void game() {
        boolean isSix = false;
        int count = 0;
        int Moves = 0;
        while (true) {
            int diceRoll = Generate_Random_Number.generatNumber();
            if (!isSix && diceRoll == 6){
                System.out.println("\nYou rolled a 6!\n");
                isSix = true;
                count = 1;
                System.out.println("Start......");
                continue;
            }
            if (isSix) {
                if(count + diceRoll <= 100){
                    count += diceRoll;
                }
                switch (count) {
                    case 3:
                        count = 21;
                        break;
                    case 8:
                        count = 46;
                        break;
                    case 16:
                        count = 26;
                        break;
                    case 23:
                        count = 5;
                        break;
                    case 32:
                        count = 48;
                        break;
                    case 37:
                        count = 76;
                        break;
                    case 43:
                        count = 38;
                        break;
                    case 50:
                        count = 70;
                        break;
                    case 56:
                        count = 25;
                        break;
                    case 64:
                        count = 83;
                        break;
                    case 66:
                        count = 42;
                        break;
                    case 71:
                        count = 97;
                        break;
                    case 75:
                        count = 65;
                        break;
                    case 77:
                        count = 93;
                        break;
                    case 89:
                        count = 91;
                        break;
                    case 99:
                        count = 53;
                        break;
                    default:
                        break;
                }
                
            }
            Moves++;
            System.out.println("You rolled a " + diceRoll + " and moved to " + count);
            if (count == 100) {
                System.out.println("You have reached the end of the game in " + Moves + " moves!");
                break;
            }
            input.nextLine();
            System.out.println(diceRoll + " is rolled \n");
            System.out.println("Press Enter to roll the dice...");
        }
    }
    
}
