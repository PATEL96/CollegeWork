import java.util.Scanner;

class Bank{
    String Name[] = new String[10];
    float Acc_No[] = new float[10];
    float Balance[] = new float[10];

    public void getDetaila(int n, String Name, float Acc_No, float Balance){
        this.Name[n] = Name;
        this.Acc_No[n] = Acc_No;
        this.Balance[n] = Balance;
    }

    public void displayBalance(int n, float Acc_No){
        if(this.Acc_No[n]==Acc_No){
            System.out.println("Balance: " + this.Balance[n]);
        } else {
            System.out.println("Account Does not Exsist!!");
        }
    }

    public void searchAccounct(int n, float Acc_No){
        if(this.Acc_No[n]==Acc_No){
            System.out.println("Name: " + this.Name[n]);
            System.out.println("Account Number: " + this.Acc_No[n]);
            System.out.println("Account Balance: " + this.Balance[n]);
        } else {
            System.out.println("Account Does not Exsist!!");
        }
    }
} 