import java.io.*;

public class Question1 {
    public static void main(String[] args) {
        try (BufferedReader  bfr = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bfw = new BufferedWriter(new FileWriter("output.txt"))){

            String data;
            while ((data = bfr.readLine()) != null) {
                bfw.write(data.toUpperCase());
            }
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}