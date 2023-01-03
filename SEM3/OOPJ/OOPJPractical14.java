import java.util.*;

abstract class Deparment{
    public String University = "Uka Tarsadia University.";
    public String College = "C.G.P.I.T.";
    public abstract void SubjectList();
    public void Display(){
        SubjectList();
    }
}

class CE extends Deparment{
    String Subjects[] = {"Fundamentals Of Programming.","Fundamentals Of Programming.","Fundamentals Of Programming.","Fundamentals Of Programming.","Fundamentals Of Programming."};
    public void SubjectList(){
        System.out.println("Computer Engineering.");
        for(int i = 0; i<5; i++){
            System.out.println("Subject "+ (i+1) + " : " + Subjects[i]);
        }
    }
}

class EE extends Deparment{
    String Subjects[] = {"Fundamentals Of Electrical.","Fundamentals Of Electrical.","Fundamentals Of Electrical.","Fundamentals Of Electrical.","Fundamentals Of Electrical."};
    public void SubjectList(){
        System.out.println("Electrical Engineering.");
        for(int i = 0; i<5; i++){
            System.out.println("Subject "+ (i+1) + " : " + Subjects[i]);
        }
    }
}

class OOPJPractical14{
    public static void main(String [] args){
        CE ce = new CE();
        EE ee = new EE();
        ce.Display();
        ee.Display();
    }
}