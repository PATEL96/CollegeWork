import java.util.Scanner;

class Student{
    public String Name;
    public String Address;
    public int Enrollment_No;
    Scanner read = new Scanner(System.in);

    public void getDetails(int n, String Name, String Address, int Enrollment_No){
        this.Name = Name;
        this.Address = Address;
        this.Enrollment_No = Enrollment_No;
    }
    public void editDetails(int n, String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
    public void displayDetails(int n){
        System.out.println("Name: " + this.Name);
        System.out.println("Address: " + this.Address);
        System.out.println("Enrollment_No: " + this.Enrollment_No);
    }
}