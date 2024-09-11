package chapter4;

import java.util.Scanner;

public class GasMileage {
	private double overAllGasMileage = 0.0;

	public double getOverAllGasMileage(){
		return overAllGasMileage;
	}

	public void setOverAllGasMileage(int overAllGasMileage){
		this.overAllGasMileage = overAllGasMileage;
	}

	public void calculateMileage(int ... args) {
		int miles = args[0];
		int gallons = 0;

		for (int index = 1; index < args.length; index++) {
			if (index % 2 == 0){
				miles += args[index];
			}
			else{
				gallons += args[index];
			}
			
		}
		if(gallons != 0 && miles != 0) {
			setOverAllGasMileage(miles / gallons);
		}
	}
}