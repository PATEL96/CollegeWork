import java.util.Scanner;

class OOPJPractical3_2{
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
		
		System.out.print("Enter Any Integer: ");
		a = read.nextInt();
		
        if(isTrue(a)){
            System.out.println(a + " is Amstrong Number");
        } else {
            System.out.println(a + " is not Amstrong Number");
        }
	}
}