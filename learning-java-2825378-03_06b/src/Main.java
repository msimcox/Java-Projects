import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Stop repeat? If so, answer yes");
            String userInput = input.next();
            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing new song!");
    }
}
