//Dominic Carreto
//Lab #10

import java.util.Scanner;

public class dcarreto10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input radius: ");
		int radius = keyboard.nextInt();
		System.out.println("Input height: ");
		int height = keyboard.nextInt();
		System.out.printf("The volume is %f%n", volume(radius, height));
	}
	static double volume(int radius, int height)
	{
		return Math.PI * Math.pow(radius,2) * height;
	}	
}
