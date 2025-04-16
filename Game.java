import java.util.Scanner;
public class Game {
    private static Scanner input = new Scanner(System.in);
    static public void game() {
        boolean isSix = false;
        int count = 0;
        int Moves = 0;
        while (true) {
            int diceRoll = Generate_Random_Number.generatNumber();
            if (count == 0 && diceRoll != 6) {
                System.out.println("You rolled a " + diceRoll + " and you need to roll a 6 to start the game.");
                System.out.println("Press Enter to roll the dice...");
                input.nextLine();
                continue;
            }

            boolean ladder = false;
            boolean snake = false;

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
                        ladder = true;
                        break;
                    case 8:
                        count = 46;
                        ladder = true;
                        break;
                    case 16:
                        count = 26;
                        ladder = true;
                        break;
                    case 23:
                        count = 5;
                        snake = true;
                        break;
                    case 32:
                        count = 48;
                        ladder = true;
                        break;
                    case 37:
                        count = 76;
                        ladder = true;
                        break;
                    case 43:
                        count = 38;
                        snake = true;
                        break;
                    case 50:
                        count = 70;
                        ladder = true;
                        break;
                    case 56:
                        count = 25;
                        snake = true;
                        break;
                    case 64:
                        count = 83;
                        ladder = true;
                        break;
                    case 66:
                        count = 42;
                        snake = true;
                        break;
                    case 71:
                        count = 97;
                        ladder = true;
                        break;
                    case 75:
                        count = 65;
                        snake = true;
                        break;
                    case 77:
                        count = 93;
                        ladder = true;
                        break;
                    case 89:
                        count = 91;
                        snake = true;
                        break;
                    case 99:
                        count = 53;
                        snake = true;
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
            if (ladder) {
                System.out.println("You climbed a ladder to " + count);
            } else if (snake) {
                System.out.println("You slid down a snake to " + count);
            }
            input.nextLine();
            System.out.println(diceRoll + " is rolled \n");
            System.out.println("Press Enter to roll the dice...");
        }
    }
    
}
