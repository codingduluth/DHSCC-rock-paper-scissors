//Main objective is to make the computer choose a choice at random and then compare it to your input. To do this you must do the following: 

//Make sure to add these variables to your code: 


// import java.util.Random;
// import java.util.Scanner;

// Scanner console = new Scanner(System.in);
// Random random = new Random();

//Create an array of strings. (An array is just a list): String[] choices = {"rock", "paper", "scissors"};
//Ask for input

//Get the computer choice by using: choices[random.nextInt(choices.length)]

//Compare strings with VARIABLE_NAME.equals("WHAT IT SHOULD EQUAL TO") 
//Comparing these strings will give you a boolean that you can use in the if statements to check if the students won or did not

import java.util.Random;
import java.util.Scanner;

public class rsp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        // Array to store the choices
        String[] choices = {"rock", "paper", "scissors"}; //This makes a list of choices
        
        // Get user input
        
        System.out.print("Enter rock, paper, or scissors: ");
        String userChoice = console.nextLine().toLowerCase(); //This gets the string and makes it lowercase
        
        // Get computer's choice
        String computerChoice = choices[random.nextInt(choices.length)]; // Randomly selects "rock", "paper", or "scissors" from the choices array for the computer
        
        // Show choices
        System.out.println("\nYou chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        
        // Determine the winner
        if (userChoice.equals(computerChoice)) {
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
