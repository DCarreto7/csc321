//CSC 321 Lab 11
//Dominic Carreto

#include <stdio.h>
#include <math.h>

double calcHypotenuse(double base, double height)
{
    double hypotenuse = sqrt(base * base + height * height);
    return hypotenuse;
}
int main()
{
    double base, height;
    printf("Enter the base of the triangle: ");
    scanf("%lf", &base);
    printf("Enter the height of the triangle: ");
    scanf("%lf", &height);
    double hypotenuse = calcHypotenuse(base, height);
    printf("The hypotenuse of the triangle is: %.2lf\n", hypotenuse);
}
