public class Main {
    static Scanner scanner = new Scanner (System.in);
    static Random random = new Random ();

    public static void main(String[] args) {

        int weight = getIntFromUser ("Please Enter your weight: ");
        if (weight < 55) {
            System.out.println ("Thin");
        } else {
            System.out.println ("Fat");
        }


    }

    // Targil 3:
    private static int getIntFromUser(String msg) {
        System.out.println (msg);
        int user_input = scanner.nextInt ();
        return user_input;
    }
