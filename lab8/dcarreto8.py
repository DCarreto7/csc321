#Dominic Carreto
#Lab 8

print("Guess the number on top of my head!")
userInput = int(input("Choose a number between 0 - 9: "))
while(userInput != 7):
    if(userInput < 7):
        print("Incorrect. The number is higher.")
    elif(userInput > 7):
        print("Incorrect. The number is lower.")
    userInput = int(input("Try again and choose a number between 0 - 9: "))
print("Correct You Win! The number was 7!")

for i in range(9):
    print("How do astronauts have a party in space?... They planet!")

counter = 0
while(counter < 5):
    print("My favorite food are Hamburgers.")
    counter += 1
