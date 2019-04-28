import java.io.*;
import java.util.Scanner;

public class GenreDecision
{  
   private String album = "";
   private String genre;
   private int albumNum;
   
   public void genreSelection()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Which genre would you like? Currently only rock");
      genre = keyboard.nextLine();
      
      RockMusic rock = new RockMusic();
      
      album = rock.getAlbum();
   }
   public String albumReturn()
   {
      return album;
   }
}
