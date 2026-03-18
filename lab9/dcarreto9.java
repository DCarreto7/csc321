//Dominic Carreto
//Java Code for Lab 9

import java.util.Scanner;
import java.util.Random;

public class dcarreto9
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = rand.nextInt(1, 21);
        System.out.println("Guess a number between 1 and 20:");
        int userGuess = keyboard.nextInt();
        while(userGuess < 1 || userGuess > 20)
        {
            System.out.println("You input a number that is out of range (1-20) re-enter a valid number.");
            userGuess = keyboard.nextInt();
        }
        while(userGuess != randNumber)
        {
            if(userGuess > randNumber)
            {
                System.out.println("Too high!");
            }
            else
            {
                System.out.println("Too low!");
            }
            System.out.println("Guess again:");
            userGuess = keyboard.nextInt();
        }
        for (int i = 0; i < userGuess ; i++)
        {
            System.out.println("You won and guessed the number correctly!");
        }
    }
}
