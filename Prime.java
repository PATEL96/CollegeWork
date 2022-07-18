import java.util.Scanner;
class Prime{
	public static void main(String []args){
		int i,j,n,flag = 0;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any Integer: ");
		n = read.nextInt();
		for(i = 0;i<n;i++){
			for(j = 2;j<500;j++){
				if(n%j==0){
					flag++;
					break;
				}
			}
			if(flag==0){
				System.out.println(i + " is Prime Number");
			}
		}
	}
}
