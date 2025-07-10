package File;

import java.io.*;

public class Main extends Object{

    // how to write a file using java
    // FileWriter = Good for small or medium-sized text files
    // BufferedWriter = Better performance for large amounts of text
    // PrintWriter = Best for structured data, like reports or logs
    // FileOutputStream = Best for binary files (e.g., image, audio files)

    public static void main(String[] args) {
        String a = "manoj";
        String b = "manoj";

        if(a.equals(b)){
            System.out.println("true");
        }
        try {
            FileWriter writer = new FileWriter("test.txt");
            // Write table header
            // writer.write("hwllo");

            System.out.println("written to file successfully.");


        } catch (FileNotFoundException e){
            System.out.println("Could not Locate file");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        String filePath="D:\\code\\JavaCore\\table.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
}
