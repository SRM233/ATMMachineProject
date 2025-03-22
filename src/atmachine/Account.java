package atmachine;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber = 0;
    private int pinNumber = 0;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public Account() {

    }

    public Account(int customerNumber, int pinNumber, int checkingBalance, double savingBalance) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    public double calcSavingWithdraw(double amount)
    {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingBalance(double amount)
    {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount)
    {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount)
    {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }


    public void getCheckingWithdrawInput()
    {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0)
        {
            calcCheckingBalance(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else
            System.out.println("Balance cannot be negative." + "\n");
    }

    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }
        else
            System.out.println("Balance cannot be negative." + "\n");
    }

    public void getSavingDepositInput()
    {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0)
        {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }
        else
            System.out.println("Balance cannot be negative." + "\n");
    }

    public void getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0)
        {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else
            System.out.println("Balance cannot be negative." + "\n");
    }




    public void setCusomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public int getCusomerNumber()
    {
        return this.customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


}
