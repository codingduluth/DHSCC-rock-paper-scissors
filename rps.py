# Steps needed to take to create the rock paper scissors app

# Create a variable of all the choices using a list 
# Ask for the user input (Assign to a variable)
# Choose a random input for the computer (Assign to a variable)

# Print both choices
# Check if they won by using if statements 

## SAMPLE OUTPUT ##
# Enter rock, paper, or scissors: rock

# You chose: rock
# Computer chose: scissors


## USEFUL INFORMATION ##
# Use .lower() to convert the characters of a string into lowercase
# random.choice() chooses a random value from the array

## Code goes here: 

import random

choices = ['rock', 'paper', 'scissors']

user_choice = input("Enter rock, paper, or scissors: ").lower() 
computer_choice = random.choice(choices)

print("\nYou chose: " + user_choice) 
print("Computer chose: " + computer_choice)

if user_choice == computer_choice:
    print("It's a tie!")
elif (user_choice == 'rock' and computer_choice == 'scissors') or \
     (user_choice == 'paper' and computer_choice == 'rock') or \
     (user_choice == 'scissors' and computer_choice == 'paper'):
    print("You win!")
else:
    print("You lose!")
