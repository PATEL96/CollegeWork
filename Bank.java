import java.util.Scanner;

class Bank{
    String Name;
    float Acc_No[] = new float[10];
    float Balance;
    Scanner read = new Scanner(System.in);

    public void getDetails(int n){
        System.out.println("Enter Details for " + (n+1) + " Account");
        System.out.print("Name: ");
        this.Name = read.nextLine();
        System.out.print("Account Number: ");
        this.Acc_No[n] = read.nextFloat();
        System.out.print("Account Balance: ");
        this.Balance = read.nextFloat();
    }

    public void displayBalance(){
        System.out.println("Balance: " + this.Balance);
    }

    public void searchAccounct(int n){
        System.out.println("Name: " + this.Name);
        System.out.println("Account Number: " + this.Acc_No[n]);
        System.out.println("Account Balance: " + this.Balance);
        
    }
} 