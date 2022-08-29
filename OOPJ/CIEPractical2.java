import java.util.Scanner;

class CIEPractical2{
	static int num;
	static Scanner read = new Scanner(System.in);
	
	public static int Factorial(int n){
		if(n <= 1){
			return 1;
		}
		else {
			return n*Factorial(n-1);
		}
	}
	
	public static boolean IsPeterson(int n){
		int temp, lastDigit, sum = 0;
		temp = n;
		
		while(temp > 0){
			lastDigit = temp % 10;
			sum += Factorial(lastDigit);
			temp /= 10;
		}
		
		if(sum == n){
			return true;
		}
		else return false;
	}
	
	public static void main(String args[]){
		System.out.print("Enter the limit: ");
		int limit = read.nextInt();
		for(int i = 0; i < limit; i++) {
			if(IsPeterson(i)) {
				System.out.println(i+" ");
			}
		}
	}
}