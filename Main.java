import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int amount;

        System.out.print("Enter No. of Students: ");
        amount = read.nextInt();
        Student List[] = new Student[amount];
        
        for(int i = 0;i<amount;i++){
            for(int j = 0;j<1;j++){
                List[i] = new Student();
            }
            for(int k = 0;k<1;k++){
                String Name, Address;
                int Enrollment;
                System.out.print("Name of Student "+ (i+1) +": ");
                Name = read.next();
                System.out.print("Address of Student "+ (i+1) +": ");
                Address = read.next();
                System.out.print("Enrollment of Student "+ (i+1) +": ");
                Enrollment = read.nextInt();
                List[i].getDetails(i, Name, Address, Enrollment);
            }
        }
        
        System.out.print("Which Student You want to Find: ");
        int find = read.nextInt();
        List[find-1].displayDetails(find-1);
        // Bank Patel = new Bank();
        // int Option;
        // Scanner read = new Scanner(System.in);

        // System.out.println("Select any one option");
        // System.out.println("(1) ==> Account Details");
        // System.out.println("(2) ==> Cash Withdrawal");
        // System.out.println("(3) ==> Cash Deposite");

        // Option = read.nextInt();

        // switch(Option){
        //     case 1:
        //         Patel.AccountDetails();
        //         break;
        //     case 2:
        //         Patel.Withdrawal();
        //         break;
        //     case 3:
        //         Patel.Deposite();
        //         break;
        //     default:
        //         System.out.print("Please Select From above Option!");
        //         break;
        // }
    }
}