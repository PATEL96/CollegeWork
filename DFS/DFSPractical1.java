import java.util.Scanner;

class DFSPractical1{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int amount, find;

        //Asking for Total No. of Students in the List

        System.out.print("Enter No. of Students: ");
        amount = read.nextInt();
        Student List[] = new Student[amount];

        //Asking for Total No. of Students in the List

        //Creating List of Students & getting User data for List
        
        for(int i = 0;i<amount;i++){
            for(int j = 0;j<1;j++){
                List[i] = new Student();
            }
            for(int k = 0;k<1;k++){
                String Name, Address;
                int Enrollment;
                System.out.println();
                System.out.print("Name of Student "+ (i+1) +": ");
                Name = read.next();
                System.out.print("Address of Student "+ (i+1) +": ");
                Address = read.next();
                System.out.print("Enrollment of Student "+ (i+1) +": ");
                Enrollment = read.nextInt();
                System.out.println();
                List[i].getDetails(i, Name, Address, Enrollment);
            }
        }

        //Creating List of Students & getting User data for List

        //Searching Through the List

        do{
            System.out.println();
            System.out.print("Which Student You want to Find From(1 - " + amount + "): ");
            find = read.nextInt();
            System.out.println();
            List[find-1].displayDetails(find-1);
            System.out.println("To exit: Enter No. Greater Than " + amount +" or Press ctrl+C");
        }
        while(find!=amount+1);

        //Searching Through the List
    }
}