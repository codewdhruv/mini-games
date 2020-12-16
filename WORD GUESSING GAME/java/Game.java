
import java.util.Scanner;
import java.util.Random;
public class Game
{
    String name;
    int tries;
    int guess;
    int level;
    
   void input()
   {
       Scanner obj=new Scanner(System.in);
       Random obj1=new Random();
       int a=obj1.nextInt(100);
      
       System.out.println("Enter the name");
       name=obj.next();
       System.out.println("Enter the level");
       tries=obj.nextInt();
       System.out.println("I may thinking of number between 1 to 100");
       if(tries==1 || tries<1)
       {
         level=1;
        }
        else if(tries==2)
        {
            level=2;
        }
        else
        {
        level=3;
        }
       int i=1;
       
    while(true)
    {
        System.out.println("Take a Guess");
        guess=obj.nextInt();
    if(guess>a)
    {
        System.out.println("The number is big");
    }
    else if(guess<a)
    {
        System.out.println("The number is small");
    }
    else
    {
        System.out.println("Congratulations");
        break;
    }
    
   i++;
   if(level==1)
   {
       
       if(i>=10)
       {
           System.out.println("you are out of tries");
           break;
        }
    
    }
    else if(level==2)
    {
    if(i>=8)
       {
           System.out.println("you are out of tries");
           break;
        }
    }
    else
    {
     if(i>=5)
       {
           System.out.println("you are out of tries");
           break;
        }
    }
        
            
  }
 }
  public static void main (String [] args)
  {
    Game G=new Game();
    G.input();
  }
}
