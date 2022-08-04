import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner userInput = new Scanner(System.in);

        int inputtedNum = userInput.nextInt();

        if (inputtedNum < 5) {
            System.out.println("U has good fortune");
        } else {
            System.out.println("U has great luck");
        }
    }
}
