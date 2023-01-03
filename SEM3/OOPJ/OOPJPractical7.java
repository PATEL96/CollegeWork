import java.util.Scanner;
import java.util.Scanner;

class Student{
    public String Name;
    public float Contact;
    public int Enrollment;
    Scanner read = new Scanner(System.in);

    public void getDetails(int n, String Name, float Contact, int Enrollment){
        this.Name = Name;
        this.Contact = Contact;
        this.Enrollment = Enrollment;
    }
    public void displayDetails(int n){
        System.out.println("Name: " + this.Name);
        System.out.println("Contact: " + this.Contact);
        System.out.println("Enrollment: " + this.Enrollment);
    }
}

class OOPJPractical7{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int amount, find;

        //* Asking for Total No. of Students in the List

        System.out.print("Enter No. of Students: ");
        amount = read.nextInt();
        Student List[] = new Student[amount];

        //* Asking for Total No. of Students in the List

        //* Creating List of Students & getting User data for List
        
        for(int i = 0;i<amount;i++){
            for(int j = 0;j<1;j++){
                List[i] = new Student();
            }
            for(int k = 0;k<1;k++){
                String Name;
                float Contact;
                int Enrollment;
                System.out.println();
                System.out.print("Name of Student "+ (i+1) +": ");
                Name = read.next();
                System.out.print("Contact of Student "+ (i+1) +": ");
                Contact = read.nextFloat();
                System.out.print("Enrollment of Student "+ (i+1) +": ");
                Enrollment = read.nextInt();
                System.out.println();
                List[i].getDetails(i, Name, Contact, Enrollment);
            }
        }

        //* Creating List of Students & getting User data for List

        //* Searching Through the List

        while(true){
            System.out.println();
            System.out.print("Which Student You want to Find From(1 - " + amount + "): ");
            find = read.nextInt();

            //* Exiting Loop if Greater than amount
            if(find>amount){
                break;
            }
            //* Exiting Loop if Greater than amount

            System.out.println();
            List[find-1].displayDetails(find-1);
            System.out.println("To exit: Enter No. Greater Than " + amount +" or Press ctrl+C");
        }

        //* Searching Through the List
    }
}