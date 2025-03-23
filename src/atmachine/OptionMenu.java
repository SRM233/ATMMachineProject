package atmachine;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class OptionMenu extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin()
    {
        int x = 1;
        do{
            try{
                data.put(1533561304,1533);
                data.put(240189751,1533);

                System.out.println("Welcome to the ATM project!");
                System.out.println("Enter your Customer Number: ");
                setCusomerNumber(input.nextInt());

                System.out.println("Enter your Pin Number: ");
                setPinNumber(input.nextInt());
            }catch(Exception e)
            {
                System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
                x = 2;
            }
            for(Entry<Integer, Integer> entry: data.entrySet())
            {
                if(entry.getKey() == getCusomerNumber() && entry.getValue() == getPinNumber())
                {
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
        }while(x == 1);
    }

    public void getAccountType()
    {
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 -  Checking Account");
        System.out.println("Type 2 -  Saving Account");
        System.out.println("Type 3 -  Exit");
        System.out.println("Choice: ");

        int selection = input.nextInt();

        switch(selection)
        {
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;
            
            case 3:
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
                break;
        }
    }

    public void getChecking()
    {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = input.nextInt();

        switch(selection)
        {
            case 1:
                System.out.println("Cehcking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
                break;
        }
    }

    public void getSaving()
    {
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");


        int selection = input.nextInt();

        switch(selection)
        {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
                break;
        }
    }
}
