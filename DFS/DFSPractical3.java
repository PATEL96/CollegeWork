import java.util.Scanner;

class DFSPractical3{
    //* Declaring global Variables
    static Scanner read = new Scanner(System.in);
    static int MAX = 10;
    static int a[] = new int[MAX];
    static int Top = -1;
    //* Declaring global Variables

    //* PUSH Function For Stack
    static void Push(){
        int data;
        if(Top == MAX-1){
            System.out.println("!!Stack Overflow!!");
        } else {
            System.out.print("Enter the Element: ");
            data = read.nextInt();
            Top++;
            a[Top] = data;
        }
    }
    //* PUSH Function For Stack

    //* POP Function For Stack
    static void Pop(){
        if(Top==-1){
            System.out.println("!!Stack Underflow!!");
        } else {
            System.out.println("POP or DELETE Element: " + a[Top]);
            Top--;
        }
    }
    //* POP Function For Stack

    //* DISPLAY Function For Stack
    static void Display(){
        int i;
        if(Top>=0){
            System.out.print("Elements: ");
            for(i = Top; i>=0;i--){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("!!Stack is EMPTY!!");
        }
    }
    //* DISPLAY Function For Stack

    //* PEEP Function For Stack
    static void Peep(){
        if(Top<=-1){
            System.out.println("!!Stack is EMPTY!!");
        } else {
            System.out.println("The Element is: " + a[Top]);
        }
    }
    //* PEEP Function For Stack

    public static void main(String [] args){
        //* While loop Used So that the Program keeps Runnig and Stores Data
        while(true){

            int opt;
            System.out.println();
            System.out.println("1 ==> PUSH Element.");
            System.out.println("2 ==> POP Element.");
            System.out.println("3 ==> PEEP Element.");
            System.out.println("4 ==> DISPLAY Stack.");
            System.out.println("5 ==> Exit Program.");

            System.out.println();
            System.out.print("Enter your option: ");
            opt = read.nextInt();
            System.out.println();

            switch(opt){
                case 1:
                    Push();//* Function Call for PUSH
                    break;
                case 2:
                    Pop();//* Function Call for POP
                    break;
                case 3:
                    Peep();//* Function Call for PEEP
                    break;
                case 4:
                    Display();//* Function Call for DISPLAY
                    break;
                case 5:
                    System.out.println("Exiting Program!");
                    break;
                default:
                    System.out.println("!!Invalid Option!!");
                    break;
            }

            //* If Statement Used hre Defines the Smooth Exit of Program
            if(opt==5){
                break;
            }
        }
    }
}