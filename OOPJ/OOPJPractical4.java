import java.util.Scanner;

class OOPJPractical4{
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
		System.out.println("Enter any Operator from Below");
		System.out.print("Sum, Average, Even, Odd: ");
		operator = read.next();
		System.out.print("Enter any Integer: ");
		a = read.nextInt();
		read.close();
		
		switch(operator){
			case "Sum":
				System.out.println(Sum(a));
				break;
			case "Average":
				float sum = Sum(a);
				float temp = a;
				float Average = sum/temp;
				System.out.println(Average);
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
