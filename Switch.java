import java.util.Scanner;

class Switch{
	static int Sum(int n){
		if(n<=0){
			return 0;
		}
		return n+Sum(n-1);
	}
	
	static void Even(int n){
		for(int i = 1;i<=n;i++){
			if(i%2==0){
				System.out.print(i+",");
			}
		}
	}
	
	static void Odd(int n){
		for(int i = 1;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+",");
			}
		}
	}
	
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		String operator;
		int a;
		System.out.print("Enter any Integer: ");
		a = read.nextInt();
		System.out.println("Enter any Operator from Below");
		System.out.print("Add, Average, Even, Odd: ");
		operator = read.next();
		
		switch(operator){
			case "Add":
				System.out.println(Sum(a));
				break;
			case "Average":
				System.out.println(Sum(a)/a);
				break;
			case "Even":
				Even(a);
				break;
			case "Odd":
				Odd(a);
				break;
			default:
				System.out.println("Select from Above Operators!!");
				break;
		}
	}
}
