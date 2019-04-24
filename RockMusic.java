import java.io.*;
import java.util.Scanner;

public class RockMusic
{
   String rockAlbum = null;
   public String getAlbum(int num)
   {
      File file = new File("rMusic.txt");                   
      
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
