//Dominic Carreto
//CSC 321 Midterm
import java.util.Scanner;
public class dcarretomidterm
{
    public static void main(String[] args)
    {
        int myNumber = 14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 10 - 20: ");
        int userNumber = scanner.nextInt();
        while(userNumber != myNumber)
        {
            if (userNumber < 10 || userNumber > 20)
            {
                System.out.println("Invalid input, enter a number between 10 - 20: ");
            }
            else if (userNumber > myNumber)
            {
                System.out.println("Incorrect! Try again, your guess is too high (10 - 20): ");
            }
            else
            {
                System.out.println("Incorrect! Try again, your guess is too low (10 - 20): ");
            }
            userNumber = scanner.nextInt();
        }
        System.out.println("Your Guess is correct! The number was " + myNumber + ".");
    }
}
