import java.util.*;

//* Creating Parent Class
class Student{
	int Enrollment_No, Exam_No;
	String Name;
	Scanner read = new Scanner(System.in);
	
	void getDetails(){
		System.out.print("Enter Name of Student: ");
		Name = read.next();
		System.out.print("Enter Enrollment NO. of Student: ");
		Enrollment_No = read.nextInt();
		System.out.print("Enter Exam No. of Student: ");
		Exam_No = read.nextInt();
	}
}
//* Creating Parent Class

//* Creating Child class Inheriting Parent Functions
class Exam extends Student{
	//* Using Super Keyword To call Values from Parent Class
    Exam(){
		super();
	}
    //* Using Super Keyword To call Values from Parent Class
	Scanner read = new Scanner(System.in);
	float Marks1, Marks2, Marks3, Result;
	
	void getMarks(){
        System.out.println();
		super.getDetails();
		System.out.print("Enter Marks of 1st Subject out of 10: ");
		Marks1 = read.nextFloat();
		System.out.print("Enter Marks of 2nd Subject out of 10: ");
		Marks2 = read.nextFloat();
		System.out.print("Enter Marks of 3rd Subject out of 10: ");
		Marks3 = read.nextFloat();
		
		Result = ((Marks1 + Marks2 + Marks3)*100)/30;
	}
	
	void Display(){
        System.out.println();
		System.out.println(super.Name + " got " + Result + "% in Exam");
	}
}
//* Creating Child class Inheriting Parent Functions

class OOPJPractical13{
	public static void main(String [] args){
		Scanner read = new Scanner(System.in);
		int opt, MAX;
		System.out.print("Enter No. of Students: ");
		MAX = read.nextInt();
		Exam List[] = new Exam[MAX];
		
		while(true){
			System.out.println();
			System.out.println("1 ==> Enter Details.");
			System.out.println("2 ==> Display Details.");
			System.out.println("3 ==> Exit Program.");
			System.out.print("Enter Option: ");
			opt = read.nextInt();
			
			switch(opt){
				case 1:
					for(int i = 0; i < MAX; i++){
						List[i] = new Exam();
						List[i].getMarks();
					}
					break;
				case 2:
					for(int i = 0; i < MAX; i++){
						List[i].Display();
					}
					break;
				case 3:
					System.out.println("Exiting Program...");
					break;
				default:
					System.out.println("Invalid Option.");
					break;
			}
			if(opt == 3){
				break;
			}
		}
	}
}