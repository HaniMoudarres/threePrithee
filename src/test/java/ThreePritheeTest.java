import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Scanner;

class ThreePritheeTest {

    @Test
    void testWinGame() {
        // Force the game to always pick index 2 "compare"
        Random fixedRandom = new Random() {
            @Override
            public int nextInt(int bound) { return 2; }
        };
        // Give the game user input
        Scanner simulatedInput = new Scanner("compare\ncompare\ncompare\n");
        ThreePrithee.threePritheeEngine("Shall I compare thee", simulatedInput, fixedRandom);
    }

    @Test
    void testLoseGame() {
        // Force the game to always pick index 2 "compare"
        Random fixedRandom = new Random() {
            @Override
            public int nextInt(int bound) { return 2; }
        };

        // Give the game wrong user input
        Scanner simulatedInput = new Scanner("wrong\nwrong\nwrong\n");
        ThreePrithee.threePritheeEngine("Shall I compare thee", simulatedInput, fixedRandom);
    }
}