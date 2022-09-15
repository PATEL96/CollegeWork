import java.util.Scanner;

class Student{
    public String Name;
    public String Address;
    public int Enrollment;
    Scanner read = new Scanner(System.in);

    public void getDetails(int n, String Name, String Address, int Enrollment){
        this.Name = Name;
        this.Address = Address;
        this.Enrollment = Enrollment;
    }
    public void editDetails(int n, String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
    public void displayDetails(int n){
        System.out.println("Name: " + this.Name);
        System.out.println("Address: " + this.Address);
        System.out.println("Enrollment: " + this.Enrollment);
    }
}