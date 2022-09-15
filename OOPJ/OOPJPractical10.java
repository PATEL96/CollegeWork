import java.util.Scanner;

class OOPJPractical10 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        int opt;
        float pi = 22/7;

        while(true){
            System.out.println("1 ==> Find Area of Square");
            System.out.println("2 ==> Find Area of Rectangle");
            System.out.println("3 ==> Find Area of Circle");
            System.out.println("4 ==> Exit Program.");
            System.out.print("Enter Option: ");
            opt = read.nextInt();

            switch(opt){
                case 1:
                    int side;
                    System.out.print("Enter the Length Of Side Of Square: ");
                    side = read.nextInt();
                    System.out.println(ShapeArea.Area(side));
                    break;
                case 2:
                    float length, breadth;
                    System.out.print("Enter the Length Of Reactangle: ");
                    length = read.nextFloat();
                    System.out.print("Enter the Breadth Of Reactangle: ");
                    breadth = read.nextFloat();
                    System.out.println(ShapeArea.Area(length, breadth));
                    break;
                case 3:
                    float radius;
                    System.out.print("Enter the Radius of Circle: ");
                    radius = read.nextFloat();
                    System.out.println(ShapeArea.Area(radius, pi));
                    break;
                case 4:
                    System.out.println("Exiting Program....");
                    break;
            }
            if(opt>=4){
                break;
            }
        }
    }
}