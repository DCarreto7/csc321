//Dominic Carreto
//CSC-321
//Lab #5

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int w = 25;
    	char x = 'E';
    	float y = 6.43;
    	double z = 9.34;

    	printf("%d, %p\n", w, &w);
    	printf("%c, %p\n", x, &x);
    	printf("%f, %p\n", y, &y);
    	printf("%f, %p\n\n", z, &z);
	
        if(w != 25)
        {
        	int e = 1;
        }
//      printf("printing w = %d \n", e);

	int array[10] = {5,10,15,20,25,30,35,40,45,50};
	int i=0;
	for(i=0; i<10; i++)
	{
        	printf("array[%d] = %d \n",i, array[i]);
		printf("array[%d] address = %p \n",i, &array[i]);
    	}

	return EXIT_SUCCESS;
}
