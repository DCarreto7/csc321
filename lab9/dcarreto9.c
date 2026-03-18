// Dominic Carreto
// Lab 9

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    srand(time(NULL));
    int userGuess = 0;
    int randNumber = rand() % 20 + 1;
    //random number between 1 - 20
    printf("Guess a number between 1 and 20:\n");
    scanf("%d", &userGuess);
    while (userGuess < 1 || userGuess > 20)
    {
        printf("You input a number that is out of range (1-20) re-enter a valid number.\n");
        scanf("%d", &userGuess);
    }
    while(userGuess != randNumber)
    {
        if(randNumber > userGuess)
        {
            printf("Too Low!\n");
        }
        else
        {
            printf("Too High!\n");
        }
        printf("Guess again:\n");
        scanf("%d", &userGuess);
    }
    for (int i = 0; i < userGuess ; i++)
    {
        printf("You won and guessed the number correctly!\n");
    }
    return EXIT_SUCCESS;
}
