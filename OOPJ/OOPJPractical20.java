import java.io.*;

class OOPJPractical20{
    public static void main(String [] args) throws IOException{
        FileWriter fw = new FileWriter("/Volumes/RAJ/CollegeWork/OOPJ/File2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader("/Volumes/RAJ/CollegeWork/OOPJ/File1.txt");
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