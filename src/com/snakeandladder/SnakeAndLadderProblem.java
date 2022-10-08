package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderProblem {


    public static void main(String[] args) {
        int start_Position = 0;
        int player_Position = 0;
        Random random = new Random();
        System.out.println("Starting Position of the Player1 is : "+start_Position+"\n");

        int dice_Rolls = (random.nextInt(6)+1);
        System.out.println("The Player rolls the die and gets a number : "+dice_Rolls+"\n");

        int option = (int) Math.floor(Math.random()*3 %3);
        player_Position += dice_Rolls;
        switch (option)

        {
            case 0 :
                System.out.println("No play condition, Player at same position \n");
                break;
            case 1 :
                player_Position += dice_Rolls;
                System.out.println("Great...! Player moved by : "+dice_Rolls+"\n");
                System.out.println("Player current position is : "+player_Position);
                break;
            case 2 :
                player_Position -= dice_Rolls;
                System.out.println("Ohh...! Player moved down to : "+dice_Rolls+"\n");
                System.out.println("Player current position is : "+player_Position);
                break;
        }


    }
}
