import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class RockMusic
{
   private String rockAlbum = null;
   final int ROCK_ALBUMS = 335;  //Number of rock albums
   private int num;              //Line number the file is stopped at
   
   public String getAlbum()
   {
      File file = new File("rMusic.txt");
      Random rand = new Random();
      num = rand.nextInt(ROCK_ALBUMS)+1;                   
      
      try
      {
         Scanner rockFile = new Scanner(file);
         
         for (int i = 0; i < num; i++)
         {
            rockAlbum = rockFile.nextLine();
         }
         
         rockFile.close();
      }   
      catch(FileNotFoundException e)
		{
         System.out.println("Error! File cannot be found");
         rockAlbum = "Error!";
      }
      return rockAlbum;
   }
}
