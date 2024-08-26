import java.util.Random;
import java.util.Scanner;


public class RandomNumber {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        Random rand = new Random();
       System.out.println("Enter a number:");
       int number=sc.nextInt();
       int numberRandom=rand.nextInt(100)+1;
       if(number==numberRandom)
       {
           System.out.println("you guessed right");
       }
       else
       {
           System.out.println("You guessed wrong. The correct number is "+numberRandom);
       }
    }
}