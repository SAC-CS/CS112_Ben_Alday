
import java.util.Scanner;
import java.util.Random;

public class Game 
{
	 public static void main(String args[])
	  {
	    Scanner input = new Scanner(System.in);
	    Random choice = new Random();
	    
	    int userChoice;
	    int computerChoice = choice.nextInt(3) + 1;
	    
	    System.out.print("Type 1 For Rock, 2 For Paper, And 3 For Scissors Then Press Enter: ");
	    userChoice = input.nextInt();
	    
	   
	    if (userChoice == computerChoice)
	    {
	      System.out.print("Draw ");
	    }
	    
	   
	    else if (userChoice == 1)
	     {
	      if (userChoice == 1 && computerChoice == 2)
	      {
	        System.out.print("Computer Picked Paper, You Lose ");
	      }
	      else
	      {
	        System.out.print("Computer Picked Scissors, You Win ");
	      }  
	     }
	   
	    else if (userChoice == 2)
	     {
	      if (userChoice == 2 && computerChoice ==  3)
	      {
	        System.out.print("Computer Picked Scissors, You Lose ");
	      }
	      else
	      {
	        System.out.print("Computer Picked Rock, You Win ");
	      }  
	     }
	   
	   else if (userChoice == 3)
	    {
	      if (userChoice == 3 && computerChoice == 1)
	      {
	        System.out.print("Computer Picked Rock, You Lose ");
	      }
	     else
	     {
	        System.out.print("Computer Picked Paper, You Win ");
	     }  
	    }    
	    	    
	    System.out.print("Thank You For Playing");
	  }
}
	 
