import java.util.Scanner;

class Bank{
    public String Name = "Raj D. Patel";
    public long Acc_No = 707044989;
    public float Balance = 77000;
    Scanner read = new Scanner(System.in);

    public void Deposite() {
        float amt;
        AccountDetails();
        System.out.print("Enter The Amount To Deposite: ");
        amt = read.nextFloat();
        Balance = Balance + amt;
        AccountDetails();
    }

    public void Withdrawal() {
        float amt;
        AccountDetails();
        System.out.print("Enter The Amont To Withdraw: ");
        amt = read.nextFloat();
        Balance = Balance - amt;
        AccountDetails();
    }

    public void AccountDetails() {
        System.out.println("Account Holder: " + Name);
        System.out.println("Account No. : " + Acc_No);
        System.out.println("Account Balance: " + Balance);
    }
}