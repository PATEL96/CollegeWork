import java.util.Scanner;

class DFSPractical4{
    static Scanner read = new Scanner(System.in);
    static int MAX = 10;
    static int a[] = new int[MAX];
    static int Front = -1;
    static int Rear = -1;
    static int deleteIndex = 0;

    static void Display() {
        int i;
        if(Front == -1 || Rear == -1 || deleteIndex == MAX || deleteIndex > Rear) {
            System.out.println("!!Queue Empty!!");
        } else {
            for(i = deleteIndex;i<=Rear; i++){
                System.out.print(a[i] + " ");    
            }
            System.out.println();
        }
    }

    static void QInsert() {
        int data;
        Front = deleteIndex;
        if(Rear >= MAX -1){
            System.out.println("!!Queue Overflow!!");
        } else {
            Rear++;
            System.out.print("Enter Element To Insert: ");
            data = read.nextInt();
            a[Rear] = data;
            Display();
        }
    }

    static void QDelete() {
        if(deleteIndex == MAX || deleteIndex > Rear){
            System.out.println("!!Queue Underflow!!");
            Front = -1;
            Rear = -1;
            deleteIndex = 0;
        } else {
            System.out.println("Deleted Item: " + a[deleteIndex]);
            deleteIndex++;
            Display();
        }
    }

    public static void  main(String [] args) {
        int opt;

        while(true){
            System.out.println("1 ==> Insert Element.");
            System.out.println("2 ==> Delete Element.");
            System.out.println("3 ==> Exit Program.");
            System.out.print("Enter Option: ");
            opt = read.nextInt();

            switch(opt) {
                case 1:
                    QInsert();
                    break;
                case 2:
                    QDelete();
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("!!Invalid Option");
                    break;
            }
            if(opt>=3){
                break;
            }
        }
    }
}