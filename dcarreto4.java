//Dominic Carreto
//
//
//Java Code for Lab 4

import java.util.Scanner;
public class dcarreto3
{
	public static void main(String[] args)
    	{
        	System.out.print("Menu for 4 choices that will display text select 1 - 4: ");
        	Scanner input = new Scanner(System.in);
        	int userInt = input.nextInt();
        	if(userInt == 1)
        	{
        	    	System.out.println("What shoes do ninjas wear.... Sneakers!");
        	}
        	if(userInt == 2)
        	{
            		System.out.println("What does a house wear... Address!");
        	}
        	if(userInt == 3)
        	{
            		System.out.println("Why did the mushroom go to the party?... because he was a fungi!");
        	}
        	if(userInt == 4)
        	{
        	    	System.out.println("What do you give to cure a sick lemon?... Lemon-aid!");
        	}
        	else
        	{
            	return;
        	}
    	}
}
