import java.util.Scanner;

class OOPJPractical9{
    public static void main(String[] args){
        Timec init0 = new Timec();
        Timec initCons = new Timec(00,00,00);
        Timec t1 = new Timec(8,55,45);
        Timec t2 = new Timec(4,45,22);
        Timec result = t1.addTo(t2);
        result.displayTime();
    }
}