#Dominic Carreto
#Lab 12 for CSC 321

import math

def calulate_rectanglearea(base, height):
    return base * height
def calulate_circlearea(radius):
    return math.pi * radius * radius

base = float(input("Enter the base for the rectangle : "))
height = float(input("Enter the height for the rectangle : "))
rectangleArea = calulate_rectanglearea(base, height)
print("The area of the rectangle is: %.2f" % rectangleArea)
radius = float(input("Enter the radius for the circle : "))
circleArea = calulate_circlearea(radius)
print("The area of the circle is: %.2f" % circleArea)
