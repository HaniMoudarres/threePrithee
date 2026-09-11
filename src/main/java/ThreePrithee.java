import java.util.Random;
import java.util.Scanner;

public class ThreePrithee {
    public static void threePrithee(String sonnet) {
        threePritheeEngine(sonnet, new Scanner(System.in), new Random());
    }

     public static void threePritheeEngine(String sonnet, Scanner scanner, Random rand) {
        // Splitting sonnet into array of words
        String[] sonnetArr = sonnet.split("\\s+");
        int wordCount = sonnetArr.length;

        // Wrong and Right Counters
        int numCorrect = 0;
        int numWrong = 0;

        while (numCorrect < 3 && numWrong < 3) {
            // Generate random word index to stop at
            int randomPosistion = rand.nextInt(wordCount);

            String result = "";
            for (int i = 0; i < randomPosistion; i++) {
                result += sonnetArr[i] + " ";
            }
            System.out.println(result + "__________");
            System.out.println("What is the next word?");

            // Taking user input
            String nextWord = scanner.nextLine().trim();

            // Cleaning the target and guessed strings to not include punctuation
            String userGuess = nextWord.replaceAll("[^a-zA-Z’']", "");
            String targetWord = sonnetArr[randomPosistion].replaceAll("[^a-zA-Z’']", "");

            // Checking if users word is correct
            if (userGuess.equalsIgnoreCase(targetWord)) {
                numCorrect++;
                System.out.println("You got it right! (" + numCorrect + "/3)");
            }
            else {
                numWrong++;
                System.out.println("You got it wrong! (" + numWrong + "/3)");
            }
        }
        if (numCorrect == 3) {
            System.out.println("You Guessed 3 Correctly!");
        }
        else {
            System.out.println("You Guessed 3 Wrong!");
        }
    }
}
