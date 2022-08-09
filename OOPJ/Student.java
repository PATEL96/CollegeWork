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