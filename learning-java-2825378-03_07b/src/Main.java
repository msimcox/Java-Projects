import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "Is my fav color r, g or b?";
        String choiceOne = "r";
        String choiceTwo = "g";
        String choiceThree = "b";

        String correctAnswer = choiceTwo;

        Scanner input = new Scanner(System.in);

        // Write a print statement asking the question
        System.out.println(question);
       
        String userInput = input.next();

        // Have the user input an answer
        
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        if (userInput == correctAnswer) {
       
        // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("grats");
        }
        // If the user's input does not match the correctAnswer...
        else {
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        System.out.println("nope, it was" + correctAnswer);
  
    }
        

    }

}
