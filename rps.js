// Steps needed to create the rock-paper-scissors app

// Create a variable of all the choices using an array:
// const choices = ['rock', 'paper', 'scissors'];

// Ask for the user input (Assign to a variable)
// Choose a random input for the computer (Assign to a variable)

// Print both choices
// Check if they won by using if statements

const choices = ['rock', 'paper', 'scissors'];

let userChoice = prompt('Enter rock, paper, or scissors: ').toLowerCase();

let computerChoice = choices[Math.floor(Math.random() * choices.length)];

console.log('\nYou chose: ' + userChoice);
console.log('Computer chose: ' + computerChoice);

if (userChoice === computerChoice) {
  console.log("It's a tie!");
} else if (
  (userChoice === 'rock' && computerChoice === 'scissors') ||
  (userChoice === 'paper' && computerChoice === 'rock') ||
  (userChoice === 'scissors' && computerChoice === 'paper')
) {
  console.log('You win!');
} else {
  console.log('You lose!');
}
