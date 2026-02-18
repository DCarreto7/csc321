//Dominic Carreto
//
//
//Java Code for Lab 6

import java.util.Scanner;
public class dcarreto6
{
    public static void main(String[] args)
    {
       	int x = 5;
	int y = 6;
        double c = 5;
        double v = 6;
        int total = 0;
        double dtotal = 0;
        total = x+y*x/y-x;
        dtotal = c+v*c/v-c;
        System.out.println("Numbers used x & c = 5 and y & v = 6");
        System.out.println("Arithmetic Evaluation #1: x+y*x/y-x");
        System.out.println("int total = " + total);
        System.out.println("double total = " + dtotal);

        total = -x-y/x*y+x;
        dtotal = -c-v/c*v+c;
        System.out.println("Arithmetic Evaluation #2: -x-y/x*y+x");
        System.out.println("int total = " + total);
        System.out.println("double total = " + dtotal);

        total = x+y-x/y;
        dtotal = c+v-c/v;
        System.out.println("Arithmetic Evaluation #3: x+y-x/y");
        System.out.println("int total = " + total);
        System.out.println("double total = " + dtotal);

        //Answer to question on Lab #6: on C it seems that the decimal number gets rounded while on java it does not
    }
}
