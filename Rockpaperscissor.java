import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
    
        String[] rps = {"R", "P", "S"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        
        String playerMove;

        while (true) {
            System.out.println("Please enter your move R,P OR S(*Use Capital Letters)");
            playerMove = scanner.nextLine();
            if(playerMove.equals("R")|| playerMove.equals("P")||playerMove.equals("S")){
              break;
        }
        System.out.println(playerMove + "is not a Valid Move");
    }
        System.out.println("Computer played:" + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie");
         }
        else if (playerMove.equals("R")) {
            if (computerMove.equals("P")){
                System.out.println("you Lose");
            }
            else if (computerMove.equals("S"))
            System.out.println("You win");
        
        }
    
       else if (playerMove.equals("P")) {
        if (computerMove.equals("R")){
            System.out.println("You Win");
        }
        else if (computerMove.equals("S"))
        System.out.println("You Lose");
    }
    else if (playerMove.equals("S")) {
        if (computerMove.equals("P")){
            System.out.println("You Win");
        }
        else if (computerMove.equals("R"))
        System.out.println("You Lose");
    }
    
    System.out.println("Play Again? (Y/N)");
    String playAgain = scanner.nextLine();

    if (!playAgain.equals("Y")) {
        System.out.println("Thank you for playing");
        break;
        
    }
    scanner.close();
}}
}
