//The Player rolls the die to get a number between 1 - 6...
package com.snakeandladder;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        int dice_roll = ((int) (Math.random()*(6))+1);
//        Random rnd = new Random();
//        int dice_roll = rnd.nextInt(1, 7);

                System.out.println("Dice Number is: "+dice_roll);
    }
}
