import java.util.*;
import java.io.*;

//* Parent class
class Employee{
    String Emp_Name, Designation;
    int Emp_No;
}
//* Parent class

//* Child class
class Salary extends Employee{
    int Basic_Pay, HRA;

    public String Calculate(int Basic_Pay, int HRA){
        this.Basic_Pay = Basic_Pay;
        this.HRA = HRA;
        float salary = this.Basic_Pay + (this.HRA*this.Basic_Pay) + this.HRA;
        String Val = "Name: "+this.Emp_Name + "\n" 
                    +"Employee Number: " + Integer.toString(this.Emp_No) + "\n"
                    +"Salary: " + Float.toString(salary) + "\n";
        return Val;
    }

}
//* Child class

class OOPJPractical11{
    public static void main(String [] args) throws IOException{
        Salary Counter[] = new Salary[5];
        // FileWriter Test = new FileWriter("/Volumes/RAJ/CollegeWork/OOPJ/Test.txt");
        // BufferedWriter buffer = new BufferedWriter(Test);
        // String[] s = new String[5];
        Scanner read = new Scanner(System.in);

        //* For loop to initiate Differrent Employee Objects
        for(int i = 0;i<5;i++){
            //* Declaring Variables
            int Basic_Pay, HRA, Emp_No;
            String Emp_Name, Designation;
            //* Declaring Variables

            //* Taking User Input
            Counter[i] = new Salary();
            System.out.print("Name: ");
            Counter[i].Emp_Name = read.next();
            System.out.print("Employee Number: ");
            Counter[i].Emp_No = read.nextInt();
            System.out.print("Designation: ");
            Counter[i].Designation = read.next();
            System.out.print("Basic Pay: ");
            Basic_Pay = read.nextInt();
            System.out.print("HRA: ");
            HRA = read.nextInt();
            System.out.println();
            System.out.println(Counter[i].Calculate(Basic_Pay, HRA));
            //* Taking User Input

            //* Just testin Some File Writer Functions
            // s[i] = Counter[i].Calculate(Basic_Pay, HRA);
            // buffer.write(s[i]);
            // if(i!=4){
            //     buffer.newLine();
            // }
            // buffer.flush();
            //* Just testin Some File Writer Functions
        }
        //* For loop to initiate Differrent Employee Objects
        // read.close();
        // buffer.close();
    }
}