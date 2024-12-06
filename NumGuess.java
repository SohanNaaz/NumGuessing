    
import java.util.Random;
import java.util.Scanner;
public class NumGuess {

public static void main(String[] args) {
    Random rand= new Random();
    int randNumber=rand.nextInt(100) + 1;
    // System.out.println("randomnumber is" + randNumber);

    int tryCount=0;

    while(true){
    System.out.println("Enter your guess(1-100):");
    Scanner scanner=new Scanner(System.in);
    int playerGuess=scanner.nextInt();

    tryCount++;
    if(playerGuess==randNumber)
    {
        System.out.println("Correct You WON!!");
        System.out.println("it took you " + tryCount + " tries");
        break;
    }
    else if(randNumber < playerGuess)
    {
        System.out.println("nope the number is higher.guess again");
    }
    else{
        System.out.println("nope the number is lower.guess again");

    }
}
}
}
