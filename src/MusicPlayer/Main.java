package MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // How to PLAY AUDIO with Java(.wav, .au, .aiff)

        String filePath = "music.wav";
        File file = new File(filePath);
        try(Scanner sc = new Scanner(System.in);

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response="";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response=sc.next().toUpperCase();

                switch (response){
                    case "P"-> clip.start();
                    case "S"->clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"->clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("This is unsupported file");
        }
        catch (LineUnavailableException e){
            System.out.println("unable to access file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
