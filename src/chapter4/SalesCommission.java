package chapter4;

public class SalesCommission {
    public static double salesPersonEarning(double totalValue) {
        double salesPersonEarning = 0.0;
        double WEEKLYWAGE = 200;

        double earning = totalValue * ((double) 9 / 100);

        salesPersonEarning = earning + WEEKLYWAGE;

        return salesPersonEarning;
    }
}
