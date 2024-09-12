package chapter4;

public class TaxCalculator {
	public double calculate(double income){
		if(income <= 0) throw new RuntimeException("Invalid Entry, go to your village");
		String tax = "";
		if(income <= 30_000) tax = String.format("%.2f",(15/100.0) * income);
		else if(income>30_000) tax = String.format("%.2f",(20/100.0) * income);
		return Double.parseDouble(tax);
	}
}
