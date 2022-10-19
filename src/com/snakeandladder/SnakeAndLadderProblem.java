//UC1 and Uc2 and UC3 combined
package com.snakeandladder;
import java.util.Random;
public class SnakeAndLadderProblem {
    {
        int playerPosition = 1;
        int diceRoll = 0;
        int SnakeArray[] = { 47, 62, 97 };
        int LadderArray[] = { 2, 57, 20 };

        System.out.println("Welcome to the Game of SNAKE & LADDER");
        System.out.println("Starting Position of the Player is 0");

        Random random = new Random();
        diceRoll = (random.nextInt(6)+1);
        System.out.println("Dice Number =" + " " + diceRoll);
        playerPosition = playerPosition + diceRoll;
        playerPosition = playerPosition - 1;

        System.out.println("Current Position =" + " " + playerPosition);

        if (diceRoll == 0) {
            playerPosition = playerPosition - diceRoll;
            System.out.println("You have to stay on the same position!!");
        }
        if (playerPosition == SnakeArray[0]) {
            playerPosition = 5;
            System.out.println("OOPS...IT'S A SNAKE !");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == SnakeArray[1]) {
            playerPosition = 37;
            System.out.println("OOPS...IT'S A SNAKE !");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == SnakeArray[2]) {
            playerPosition = 32;
            System.out.println("OOPS...IT'S A SNAKE !");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[0]) {
            playerPosition = 44;
            System.out.println("HURRAY...! YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[1]) {
            playerPosition = 79;
            System.out.println("HURRAY...! YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[2]) {
            playerPosition = 98;
            System.out.println("HURRAY...! YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition > 100) {
            playerPosition = playerPosition - diceRoll;
            System.out.println("YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
        }
    }
}