package com.snakeandladder;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        int position = 0;
        int position2 = 0;
        int i = 0;
        Random rand = new Random();
        while (position != 100 && position2 != 100)
        {

            ++i;
            int diceRoll = rand.nextInt(1,7);
            int diceRoll2 = rand.nextInt(1,7);
            int snakeLadder = ThreadLocalRandom.current().nextInt(1,3);
            int snakeLadder2 = ThreadLocalRandom.current().nextInt(1,3);
            switch (snakeLadder)
            {
                case 1:
                    System.out.println("\nGreat...! Player moved by :  " + diceRoll);
                    position += diceRoll;
                    System.out.println("the  present position of 1st person  is " + position);
                    break;
                case 2:
                    System.out.println("\nOhh...! Player moved down to " + diceRoll);
                    position -= diceRoll;
                    if (position < 0)
                    {
                        position = 0;
                        System.out.println("\nOhh...! Player moved down to " +diceRoll);
                        System.out.println("\nOhh...! Player has to restart from position: " + position);
                    }
                    System.out.println("\nOhh...! Player moved down to " +diceRoll);
                    System.out.println("the  present position of 1st person  is " + position);
                    break;
                default:
                    position += 0;
                    System.out.println("Player position is: " + position);
                    break;
            }
            switch (snakeLadder2)
            {
                case 1:
                    System.out.println("\nGreat...! Player moved by :  " + diceRoll2);
                    position2 += diceRoll2;
                    System.out.println("the  present position of 2nd person  is " + position2);
                    break;
                case 2:
                    System.out.println("\nOhh...! Player moved down to: " + diceRoll2);
                    position2 -= diceRoll2;
                    if (position2 < 0)
                    {
                        position2 = 0;
                        System.out.println("\nOhh...! Player moved down to " +diceRoll);
                        System.out.println("\nOhh...! Player has to restart from position: " + position);
                    }
                    System.out.println("\nOhh...! Player moved down to " +diceRoll);
                    System.out.println("the  present position of 1st person  is " + position);
                    System.out.println("the  present position of 2nd person  is " + position2);
                    break;
                default:
                    position2 += 0;
                    System.out.println("Player position is: " + position2);
                    break;
            }
            System.out.println("\nthe points of 1 person is " + position);
            System.out.println("the points of 2 person is " + position2);
        }

        if (position == 100)
        {
            System.out.println("\nHooray...! Player1 is the Winner");
        }
        else
        {
            System.out.println("\nHooray...! Player2 is the Winner");
        }


    }
}
