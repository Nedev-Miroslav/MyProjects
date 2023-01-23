import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(1, 101);

        while (true) {
            System.out.print("Guess the number between 1 - 100: ");
            String playerInput = scanner.next();
            int playerNumber;


            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber < 1 || playerNumber > 100) {
                    System.out.println("Invalid number!");
                }
                if (playerNumber == computerNumber) {
                    System.out.println("Yes, you guessed it!");
                    break;
                } else if (playerNumber > computerNumber && playerNumber <= 100) {
                    System.out.println("Too High!");
                } else if (playerNumber < computerNumber && playerNumber >= 0) {
                    System.out.println("Too Low!");
                }

            } else {
                System.out.println("Invalid input!");
            }


        }
    }
}