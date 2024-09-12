package chapter4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static chapter4.SalesCommission.salesPersonEarning;

public class SalesCommissionCalculatorTest {
    @Test
    public void testThatSalesPersonEarningExist() {
        double salesPersonEarning = SalesCommission.salesPersonEarning(0.0);
    }

    @Test
    public void testThatSalesPersonEarningIs0() {
        double salesPersonEarning = SalesCommission.salesPersonEarning(0.0);
        assertEquals(200.00, salesPersonEarning, 0.0);
    }

    @Test
    @DisplayName("Test That Sales Person Earning Is 34.18")
    public void testThatSalesPersonEarningIs34() {
        double salesPersonEarning = SalesCommission.salesPersonEarning(100.00);
        assertEquals(209.00, salesPersonEarning, 0.0);
    }
}
