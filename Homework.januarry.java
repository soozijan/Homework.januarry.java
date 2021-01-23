public class Main {
    static Scanner scanner = new Scanner (System.in);
    static Random random = new Random ();

    public static void main(String[] args) {
        //Targil 3:

         String fname = getStringFromUser("Please enter your first name:");
        String lname = getStringFromUser("Please enter your last name:");

    }

    // Targil 3:
    private static String getStringFromUser(String msg) {
        System.out.println(msg);
        String result = s.nextLine();
        return result;
   
    }
    //Targil 4:
    
private static int howManyDigits(int number) {
        String number_as_string = String.valueOf(number);
        return number_as_string.length();
    }
    //Targil 5:

    private static boolean isLonger(int[] numbers, int len) {
        return numbers.length > len;
    }
    
    //Targil 6:
    private static boolean arrayEqual(int[] numbers1, int[] numbers2) {
        if (numbers1.length != numbers2.length) {
            return false;
        }
        for (int index = 0; index < numbers1.length; index++) {
            if (numbers1[index] != numbers2[index]) {
                return false;
            }
        }
        return true;
    }
}
