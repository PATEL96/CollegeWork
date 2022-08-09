import java.util.Scanner;

class OOPJPractical6{
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        int n;
        float temp = 0;

        // Taking Marks as User Input
        System.out.print("Length Of Student List: ");
        n = read.nextInt();
        float Marks[] = new float[n];

        for(int i = 0;i<n;i++){
            System.out.println();
            System.out.print("Marks of Student "+(i+1)+" : ");
            Marks[i] = read.nextFloat();
            System.out.println();
        }
        // Taking Marks as User Input

        // Interchanging The Marks according to the Requirement
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(Marks[j]>Marks[i]){
                    temp = Marks[i];
                    Marks[i] = Marks[j];
                    Marks[j] = temp;
                }
            }
        }
        // Interchanging The Marks according to the Requirement

        // Showing Output of the Descending Order
        for(int i = 0;i<n;i++){
            System.out.println((i+1) + " ==> " + Marks[i]);
        }
        // Showing Output of the Descending Order
    }
}