import java.util.*;
public class SnakeAndLadderGame
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Snake and Ladder Simulator Game");
		int[][] snakesList = {{14,6},{45,19},{76,34},{94,80}};
		int[][] ladderList = {{9,26},{24,64},{50,62},{86,98}};
		int noOfRolls = 0, startPosition = 0, diceNumber = 0;
		System.out.println("The start position is: "+startPosition);
		int currentPosition = startPosition;
		diceNumber = (int) Math.ceil(Math.random()*6);
		System.out.println("The number on the dice is: "+diceNumber);
		currentPosition+=diceNumber;

		for(int i=0;i<4;i++)
		{
			if(currentPosition == snakesList[i][0])
			{
				currentPosition=snakesList[i][1];
				System.out.println("This position has a snake");
			}
			if(currentPosition == ladderList[i][0])
			{
				currentPosition=ladderList[i][1];
				System.out.println("This position has a ladder");
			}
		}
		if(currentPosition>100)
		{
			currentPosition-=diceNumber;
			System.out.println("No Play! You can't move for now!");
		}
	}
}