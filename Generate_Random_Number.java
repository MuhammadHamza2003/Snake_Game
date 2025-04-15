public class Generate_Random_Number {
    static public int generatNumber() {
        // Generate a random number between 1 and 6
        return (int) ((Math.random() * 10)% 6) + 1;
    }
}
