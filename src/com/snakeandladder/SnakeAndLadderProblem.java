package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderProblem {


    public static void main(String[] args) {
        int player_Position = 0;
        int i = 0;
        Random rand = new Random();
        while (player_Position != 100)
        {
            ++i;
            int diceRoll = rand.nextInt(1, 7);
            int snakeLadder = rand.nextInt(1,3);
            switch (snakeLadder)
            {
                case 1:
                    System.out.println("\nGreat...! Player moved by :  " + diceRoll);
                    player_Position += diceRoll;
                    System.out.println("Player Position is: " + player_Position);
                    break;
                case 2:
                    player_Position -= diceRoll;
                    if (player_Position < 0)
                    {
                        player_Position = 0;
                        System.out.println("\nOhh...! Player moved down to " +diceRoll);
                        System.out.println("\nOhh...! Player has to restart from position: " + player_Position);
                    }
                    System.out.println("\nOhh...! Player moved down to " +diceRoll);
                    System.out.println("Player position is: "+player_Position);
                    break;
                default:
                    player_Position += diceRoll;
                    System.out.println("Player position is: " + player_Position);
                    break;
            }
        }

    }
}
