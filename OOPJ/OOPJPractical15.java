import java.util.*;

interface Animal{
    public void Food();
    public void Sound();
}

class Sparrow implements Animal{
    public void Food(){
        System.out.println("Insects.");
    }

    public void Sound(){
        System.out.println("Chirps.");
    }
}

class Peacock implements Animal{
    public void Food(){
        System.out.println("Insects.");
    }

    public void Sound(){
        System.out.println("Chirps.");
    }
}

class OOPJPractical15{
    public static void main(String [] args){
        Sparrow sparrow = new Sparrow();
        Peacock peacock =new Peacock();
        
        System.out.println("Sparrow.");
        System.out.print("Eats: ");
        sparrow.Food();
        System.out.print("Sounds: ");
        sparrow.Sound();

        System.out.println("Peacock.");
        System.out.print("Eats: ");
        peacock.Food();
        System.out.print("Sounds: ");
        peacock.Sound();
    }
}