package com.example.player_combat;

import com.example.player_combat.model.Dice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class DiceTest  {

    @Test
    public void testRollRange() {
        Dice dice = new Dice();
        for (int i = 0; i < 1000; i++) {  // Roll the dice 1000 times to check range
            int result = dice.getRandom();
            assertTrue("Dice roll result should be >= 1", result >= 1);
            assertTrue("Dice roll result should be <= " + 6, result <= 6);
        }
    }
}