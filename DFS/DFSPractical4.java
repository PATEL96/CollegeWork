import java.util.Scanner;

class DFSPractical4{
    static Scanner read = new Scanner(System.in);
    public static void main(String [] args){
        int elements,temp;
        System.out.print("Enter Total No. of Elements: ");
        elements = read.nextInt();

        int a[] = new int[elements];

        for(int i = 0;i<elements;i++){
            System.out.print("Enter Element " + (i+1) + ": ");
            a[i] = read.nextInt();
        }

        //Insertion Sort Method

        for(int i = 1 ; i<=(elements-1);i++){
            for(int j = i;j>0 && a[j-1] > a[j];j--){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }

        //Insertion Sort Method

        System.out.print("After Insertion Sort: ");
        for(int i = 0;i < elements; i++){
            System.out.print(a[i] + " ");
        }
    }
}