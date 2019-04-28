import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class DecadeDecision
{
   private String album = "";
   private String decade;
   private int albumNum;
   
   public void decadeSelection()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Which decade would you like? Ex: (Type '1990s' for the 90s)");
      decade = keyboard.nextLine();
                   
      //Input validation for the decade question
      while (!decade.equals("1960s") && !decade.equals("1970s") && !decade.equals("1980s") && !decade.equals("1990s") && !decade.equals("2000s") && !decade.equals("2010s"))
      {
         //Common typo suggestions
         if (decade.equals("1960") || decade.equals("1970") || decade.equals("1980") || decade.equals("1990") || decade.equals("2000") || decade.equals("2010"))
         {
            System.out.println("Incorrect formating: add an s at the end of input. Ex: (1990s for the 90s)");
         }
         else if (decade.equals("60s") || decade.equals("70s") || decade.equals("80s") || decade.equals("90s") || decade.equals("00s") || decade.equals("10s"))
         {
            System.out.println("Please type the whole year. Ex: (1990s for the 90s)");
         }
         else
         {
            System.out.println("Not a valid input or an unsupported decade");
         }
          
         decade = keyboard.nextLine();
       }
         keyboard.close();
         decadeAlbum(decade);
   }
   
   public void decadeAlbum(String decade)
   {
      RockMusic rock = new RockMusic();
      Random rand = new Random();
      
      while (decade.equals("1960s") && !album.contains("(196"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
      while (decade.equals("1970s") && !album.contains("(197"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
      while (decade.equals("1980s") && !album.contains("(198"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
      while (decade.equals("1990s") && !album.contains("(199"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
      while (decade.equals("2000s") && !album.contains("200"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
      while (decade.equals("2010s") && !album.contains("(201"))
      {
         albumNum = rand.nextInt(300)+1;
         album = rock.getAlbum(albumNum);
      }
   }
   
   public String albumReturn()
   {
      return album;
   }
}