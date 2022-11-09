import java.util.*;
import java.util.regex.*;

class OOPJPractical18{
    public static boolean isValid(String s) {
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }

    public static void main(String[] args) {
        String number;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Any Phone No. : ");
        number = read.nextLine();

        if (isValid(number)){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}