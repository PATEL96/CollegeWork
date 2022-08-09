import java.util.Scanner;

class OOPJPractical3{
    static int power(int base, int exponent){
		int power = 1;
		
		for(int i = 1; i<=exponent;i++){
			power = power * base;
		}
		
		return power;
	}
	static boolean isTrue(int n){
		int temp, digits = 0, last=0, sum=0;
		
		temp = n;
		while(temp>0){
			temp = temp/10;
			digits++;
		}
		
		temp = n;
		while(temp>0){
			last = temp%10;
			sum += power(last, digits);
			temp = temp/10;
		}
		
		if(n==sum){
			return true;
		} else{
			return false;
		}
	}
	
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int a;
		
		System.out.print("Enter Limit: ");
		a = read.nextInt();
		
		System.out.println("All Amstrong Numbers upto "+ a + "is");
		for(int i=0; i<=a; i++){
			if(isTrue(i)){
				System.out.print(i + ",");
			}
		}
		System.out.println();
	}
}