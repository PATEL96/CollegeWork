import java.lang.*;

class OOPJPractical17{

    static void StringIndexOutOfBoundsExceptionTest(String test, int len){
        try {
            System.out.println(test.charAt(len));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception.");
        }
    }

    static void NullPointerExceptionTest(String test){
        try {
            System.out.println(test.charAt(0));
        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception.");
        }
    }

    static void NumberFormatExceptionTest(String test){
        try {
            System.out.println(Integer.parseInt(test));
        } catch (NumberFormatException e){
            System.out.println("Number Format Exception.");
        }
    }

    public static void main (String [] args){
        String test1 = "Raj D. Patel";
        String test2 = null;
        String test3 = "PATEL96";
        int len1 = test1.length();
        StringIndexOutOfBoundsExceptionTest(test1, len1);
        NullPointerExceptionTest(test2);
        NumberFormatExceptionTest(test3);
    }
}