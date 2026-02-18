//Dominic Carreto
//CSC-321
//Lab #6

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
   	int y = 6;
    	double c = 5;
    	double v = 6;
    	int total = 0;
    	double dtotal = 0;

    	total = x+y*x/y-x;
    	dtotal = c+v*c/v-c;

    	printf("Numbers used x & c = 5 and y & v = 6\n");
    	printf("Arithmetic Evaluation #1: x+y*x/y-x\n");
    	printf("int total = %d \n", total);
    	printf("double total = %lf \n", dtotal);

    	total = -x-y/x*y+x;
    	dtotal = -c-v/c*v+c;
    	printf("Arithmetic Evaluation #2: -x-y/x*y+x\n");
    	printf("int total = %d \n", total);
    	printf("double total = %lf \n", dtotal);

    	total = x+y-x/y;
    	dtotal = c+v-c/v;
    	printf("Arithmetic Evaluation #3: x+y-x/y\n");
    	printf("int total = %d \n", total);
    	printf("double total = %lf \n", dtotal);

    	//Answer to question on Lab #6: on C it seems that the decimal number gets rounded while on java it does not

    return EXIT_SUCCESS;
}
