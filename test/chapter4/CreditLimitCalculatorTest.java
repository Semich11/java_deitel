package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditLimitCalculatorTest {
    private CreditLimitCalculator creditLimitCalculator;
    @BeforeEach
    public void setUp() {
        creditLimitCalculator = new CreditLimitCalculator(65, 1_000, 35, 45, 500);
    }

    @Test
    @DisplayName("Test That Get New Balance Is Greater Than Allowed Credit Limit")
    public void testThatGetNewBalanceIsGreaterThanAllowedCreditLimit() {
        creditLimitCalculator.setNewBalance();
        double newBalance = creditLimitCalculator.getNewBalance();
        System.out.println(newBalance);
        assertTrue(newBalance > 500);
    }
}
