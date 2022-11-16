import java.io.*;

class OOPJPractical20{
    public static void main(String [] args) throws IOException{
        FileWriter fw = new FileWriter("LOCATION OF YOUR FILE.");
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader("LOCATION OF YOUR FILE.");
        BufferedReader br = new BufferedReader(fr);

        String s;
        int counter = 0;
        while((s = br.readLine()) != null){
            System.out.println("Reading Files...");
            bw.write((counter+1)+ " " + s + "\n");
            counter++;
        }
        System.out.println("Done!!");
        bw.close();
        br.close();
    }
}