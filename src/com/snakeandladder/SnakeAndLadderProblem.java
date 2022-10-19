//UC7 Game with two players and report who wins the game
package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {

        int SnakeArray[] = {47, 62, 97};
        int LadderArray[] = {9, 57, 20};
        int i = 0;
        String player1 = "Player1";
        String player2 = "Player2";

        System.out.println("Welcome to the Game of SNAKE & LADDER");
        System.out.println("Starting Position of Player1 and Player2 is 0");

        int count1 = getCount(player1, SnakeArray, LadderArray);
        int count2 = getCount(player2, SnakeArray, LadderArray);

        System.out.println("--------------Player1 reached position 100 in : "+count1+" dice rolls--------------");
        System.out.println("--------------Player2 reached position 100 in : "+count2+" dice rolls--------------");

        if (count1 > count2) {
            System.out.println("\n************** HOORAY...! Player2 IS THE WINNER **************");
        } else if (count2 > count1) {
            System.out.println("\n************** HOORAY...! Player1 IS THE WINNER **************");
        } else {
            System.out.println("Match is Draw..!");
        }
    }
    public static int getCount(String playerName, int [] SnakeArray, int [] LadderArray){
        int diceRoll = 0;
        int TotalNoOfDiceRoll = 0;
        int playerPosition;
        Random random = new Random();
        System.out.println("\n************** "+playerName+" **************\n");
        for (playerPosition = 1; playerPosition <= 100; playerPosition++) {
            diceRoll =  (random.nextInt(6) + 1);

            System.out.println("Dice Number =" + " " + diceRoll);
            playerPosition = playerPosition + diceRoll;
            playerPosition = playerPosition-1;

            System.out.println("Current Position =" + " " + playerPosition);
            TotalNoOfDiceRoll++;

            if (playerPosition == 100) {
                System.out.println("CONGRATULATION!! YOU WON THE GAME.");
            }
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
        }        System.out.println("Number of Times The Dice was rolled to Win the Game =" + TotalNoOfDiceRoll);

        return TotalNoOfDiceRoll;
    }
}
