import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class AlbumSelector
{
   public static void main(String[] args)
   {  
      String album = "";
      String userChoice;
      
      GenreDecision genre = new GenreDecision();
      DecadeDecision decade = new DecadeDecision();
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Would like you an album by genre or decade?");
      userChoice = keyboard.nextLine();
      while(!userChoice.equals("genre") && !userChoice.equals("decade"))
      {
         System.out.println("Please enter either decade or genre.");   
         userChoice = keyboard.nextLine();
      }
      userChoice = userChoice.toLowerCase();
      
      
      if (userChoice.equals("genre")) //Responsible for album selection if the user wants an album from a genre
         {
            genre.genreSelection();      //Gets a specific genre from the user
            album = genre.albumReturn(); //Returns the selected album to be outputed
         }
         
      if (userChoice.equals("decade")) //Responsible for album selection if the user wants an album from a decade
         {
            decade.decadeSelection();     //Gets a specific decade from the user
            album = decade.albumReturn(); //Returns the selected album to be outputed
         }
         
      System.out.println("Listen to: " + album);
      keyboard.close();
   }
}
