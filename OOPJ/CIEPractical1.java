import java.util.Scanner;

class CIEPractical1{

    //* Checking whether Given Input is PallinDrome or Not
	static boolean isPallinDrome(String n){
		String temp = "";
		int len = n.length();
		for(int i = len-1;i>=0;i--){
			temp  = temp + n.charAt(i);
		}
		
		if(n.equals(temp)){
			return true;
		} else {
			return false;
		}
	}
    //* Checking whether Given Input is PallinDrome or Not

	public static void main(String [] args){
		Scanner read = new Scanner(System.in);
		int limit;
		
		System.out.print("Enter your Limit: ");
		limit = read.nextInt();
		
        //* Printing Series of PallinDrome Numbers 
		for(int i = 0;i<limit;i++){
			String str = Integer.toString(i);
			if(isPallinDrome(str)){
				System.out.print(i+ ", ");
			}
		}
        //* Printing Series of PallinDrome Numbers
        
		System.out.println();
	}
}