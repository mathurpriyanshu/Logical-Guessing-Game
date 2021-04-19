import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bulls and Cows game!");
        System.out.println("This is a logical mind games" +
                "\nHere B means one of your guessing numbers is inside the hidden number and in the right place" +
                "\nHere C means one of your guessing numbers is inside the hidden number but in the wrong place");
        Random random = new Random();
        int intRandom = random.nextInt(99);//66---100

        while (intRandom < 11) {
            intRandom++;
        }
        String s = String.valueOf(intRandom);
        char charRandom1 = s.charAt(0);
        char charRandom2 = s.charAt(1);

        int guess=0;
        while (true) {

            if (charRandom1 == charRandom2) {
                charRandom1++;
            }
            System.out.println("Enter your guess");
            String strRandom = scanner.nextLine();

            int input = Integer.parseInt(strRandom);
            if (input < 10) {
                System.out.println("You entered one level number,please enter a two level number");
                continue;
            }
            char charInput = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if (input == intRandom) {
                guess++;
                System.out.println("Congratulations, you have guessed the number correctly\nNumber of guesses: " + guess);
                return;
            } else if (charRandom1 == charInput || charRandom2 == charInput2) {
                guess++;
                System.out.println("1B,OC");
            } else if (charRandom1 == charInput2 && charRandom2 == charInput) {
                guess++;
                System.out.println("0B,2C");
            } else if (charRandom1 == charInput2 || charRandom2 == charInput) {
                guess++;
                System.out.println("0B,1C");
            } else {
                guess++;
                System.out.println("0B,0C");
            }
        }
    }
}
