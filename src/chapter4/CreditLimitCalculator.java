package chapter4;

public class CreditLimitCalculator {
    private int accountNumber;
    private int beginningBalance;
    private int itemChargedTotal;
    private int creditAppliedTotal;
    private int creditLimit;
    private int newBalance;

    public CreditLimitCalculator(int accountNumber, int beginningBalance, int itemChargedTotal, int creditAppliedTotal, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.itemChargedTotal = itemChargedTotal;
        this.creditAppliedTotal = creditAppliedTotal;
        this.creditLimit = creditLimit;
        setNewBalance();
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance() {
        newBalance = beginningBalance + itemChargedTotal - creditAppliedTotal;

    }
}
