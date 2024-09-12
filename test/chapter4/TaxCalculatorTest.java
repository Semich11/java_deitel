package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxCalculatorTest {
	
	@Test
	public void testCalculatorTax(){
		//given
		TaxCalculator taxCalculator = new TaxCalculator();
		//when
		double tax = taxCalculator.calculate(30_000);
		//assert
		System.out.println(tax);
		assertEquals(4500.00, tax);
		


	}

	@Test
	public void testCalculateTaxForInvalidAmountFails(){
		TaxCalculator taxCalculator = new TaxCalculator();
		assertThrows(RuntimeException.class, ()->taxCalculator.calculate(-30_000));
	}
	
}