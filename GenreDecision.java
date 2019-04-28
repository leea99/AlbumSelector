import java.io.*;
import java.util.Random;

public class GenreDecision
{
   private String album = "";
   private String genre;
   private int albumNum;
   
   public void genreSelection()
   {
      System.out.println("Which genre would you like? Currently only rock");
      genre = keyboard.nextLine();
      
      RockMusic rock = new RockMusic();
      Random rand = new Random();
      
      albumNum = rand.nextInt(300)+1;
      album = rock.getAlbum(albumNum);
   }
   public String albumReturn()
   {
      return album;
   }
}