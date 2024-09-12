//Main objective is to make the computer choose a choice at random and then compare it to your input. To do this you must do the following: 

//Make sure to add these variables to your code: 

//NOTE: THESE WILL ALREADY BE ADDED TO YOUR CODE IN CODEHS
// import java.util.Random;
// import java.util.Scanner;

// Scanner console = new Scanner(System.in);
// Random random = new Random();

//Create an array of strings. (An array is just a list): String[] choices = {"rock", "paper", "scissors"};
//Ask for input

//Get the computer choice by using: choices[random.nextInt(choices.length)]

//Compare strings with VARIABLE_NAME.equals(WHAT IT SHOULD EQUAL TO) 
//Comparing these strings will give you a boolean that you can use in the if statements to check if the students won or did not

import java.util.Scanner;
import java.util.Random;

public class rsp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random(); //Random is a built in function that allows the computer to choose something at random

        // Establish Variables
        
        // Array to store the choices
        String[] choices = {"rock", "paper", "scissors"}; //This makes a list of choices (This is an Array, this will be used later on)
        String userChoice; 
        String computerChoice;
        
        // Get user input
        System.out.print("Enter rock, paper, or scissors: ");
        userChoice = console.nextLine().toLowerCase(); //This gets the string and makes it lowercase then assigns it to userChoice
        
        // Get computer's choice
        computerChoice = choices[random.nextInt(choices.length)]; // Randomly selects "rock", "paper", or "scissors" from the choices array for the computer
        
        // Show choices
        System.out.println("\nYou chose: " + userChoice); // \n creates a new line in the terminal. 
        System.out.println("Computer chose: " + computerChoice);
        
        // Determine the winner
        if (userChoice.equals(computerChoice)) { // VARIABLE1.equals(VARIABLE2) is similar to 0 == 0 >> True. The only difference is that it compares two strings together.
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        console.close();
    }
}
