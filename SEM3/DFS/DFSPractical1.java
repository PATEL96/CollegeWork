import java.util.Scanner;

class DFSPractical1{
    static int MAX = 10, Index = 0, amount;
    static Student List[] = new Student[MAX];
    public static Scanner read = new Scanner(System.in);
    
    public static String Name;
    public static String Address;
    public static int Enrollment;

    static void Insert(){
        System.out.print("Enter No. of Students: ");
        amount = read.nextInt();

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
    }

    static void Display(){
        int find;
        while(true) {
            System.out.println();
            System.out.print("Which Student You want to Find From(1 - " + amount + "): ");
            find = read.nextInt();
            if(find==amount+1){
                break;
            }
            System.out.println();
            List[find-1].displayDetails(find-1);
            System.out.println("To exit: Enter No. Greater Than " + amount);
        }
    }

    static void Modify(){
        int edit;
        while(true) {
            System.out.println();
            System.out.print("Which Student You want to Find From(1 - " + amount + "): ");
            edit = read.nextInt();
            if(edit==amount+1){
                break;
            }
            System.out.print("Name of Student "+ (edit) +": ");
            Name = read.next();
            System.out.print("Address of Student "+ (edit) +": ");
            Address = read.next();
            System.out.println();
            List[edit-1].editDetails(edit-1, Name, Address);
            System.out.println("To exit: Enter No. Greater Than " + amount);
        }
    }


    public static void main(String [] args) {
        int opt;

        while(true) {
            System.out.println("1 ==> Insert Student Data.");
            System.out.println("2 ==> Modify Student Data.");
            System.out.println("3 ==> Display Student Data.");
            System.out.println("4 ==> Exit Program.");
            System.out.print("Enter Option: ");
            opt = read.nextInt();

            switch(opt){
                case 1:
                    Insert();
                    break;
                case 2:
                    Modify();
                    break;
                case 3:
                    Display();
                    break;
                case 4:
                    System.out.println("Exiting Proogram....");
                    break;
                default:
                    System.out.println("!!Internal Error!!");
                    break;
                
            }

            if(opt>=4){
                break;
            }

        }
    }
}