import java.util.Scanner;

class Student{
    public String Name[] = new String[10];
    public String Address[] = new String[10];
    public int Enrollment[] = new int[10];
    Scanner read = new Scanner(System.in);

    public void getDetails(int n, String Name, String Address, int Enrollment){
        this.Name[n] = Name;
        this.Address[n] = Address;
        this.Enrollment[n] = Enrollment;
    }
    public void displayDetails(int n){
        System.out.println("Name: " + this.Name[n]);
        System.out.println("Address: " + this.Address[n]);
        System.out.println("Enrollment: " + this.Enrollment[n]);
    }
}