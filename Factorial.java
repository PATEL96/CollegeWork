import java.util.Scanner;

class Factorial{
	static int Fact(int n){
		if(n<=0){
			return 1;
		}
		return n*Fact(n-1);
	}
	
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int a;
		
		System.out.print("Enter any Integer: ");
		a = read.nextInt();
		
		System.out.println("Factorial of "+a+" is: " + Fact(a));
	}
}
