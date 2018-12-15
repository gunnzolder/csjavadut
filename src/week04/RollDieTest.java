package week04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class RollDieTest {

    @Test
    @DisplayName("Dice is between 1 and 6")
    void isOnetoSix() {
        assertTrue(RollDie.roll()>0 && RollDie.roll()<7);
    }

}