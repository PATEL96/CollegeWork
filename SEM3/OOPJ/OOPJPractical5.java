import java.util.Scanner;

class OOPJPractical5{
    static double Factorial(int n){
        if(n<=0){
            return 1;
        }
        return n * Factorial(n-1);
    }

    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int a;

        System.out.print("Enter Your Integer: ");
        a = read.nextInt();

        System.out.println("Factorial of " + a +" is: " + Factorial(a));
    }
}