//Dominic Carreto
//CSC 321 Midterm 2

#include <stdio.h>
#include <stdlib.h>

void printNameLoop(int loopNum)
{
    for(int i = 0; i < loopNum; i++)
    {
        printf("Dominic%d\n\n", loopNum);
    }
}

int main(void)
{
    int loopNum;
    printf("Enter a number: ");
    scanf("%d", &loopNum);
    printNameLoop(loopNum);
    return EXIT_SUCCESS;
}
