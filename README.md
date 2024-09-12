# Number Guessing Game

A simple Java-based console game where the user attempts to guess a randomly generated number within a specified range.

## Features
- Random number generation
- User input for guessing the number
- Feedback after each guess (higher/lower)
- Count of attempts made by the user
- Option to replay the game

## How to Play
1. The game generates a random number within a predefined range (e.g., 1-100).
2. You will be prompted to guess the number.
3. After each guess, the game will tell you whether your guess is too low, too high, or correct.
4. The game continues until you guess the correct number.
5. You will be shown the total number of attempts taken to guess the number.

## Getting Started

### Prerequisites
- You need to have Java installed on your machine.
- Any IDE (like IntelliJ IDEA, Eclipse) or a simple text editor can be used for coding.

### Installation and Setup
1. Download and install Java from the [official site](https://www.oracle.com/java/technologies/javase-downloads.html) if it's not already installed.
2. Clone or download the source code.
   ```bash
   git clone https://github.com/your-username/number-guessing-game.git
   ```
3. Navigate to the project directory.
   ```bash
   cd number-guessing-game
   ```

### Running the Game
1. Compile the program using the following command:
   ```bash
   javac NumberGuessingGame.java
   ```
2. Run the program:
   ```bash
   java NumberGuessingGame
   ```

### Example Gameplay
```
Welcome to the Number Guessing Game!
I have picked a number between 1 and 100. Try to guess it!

Enter your guess: 50
Too low! Try again.

Enter your guess: 75
Too high! Try again.

Enter your guess: 60
Correct! You've guessed the number in 3 attempts.
```

## Built With
- Java - The programming language used
