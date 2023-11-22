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
		while(currentPosition<=100)
		{
			diceNumber = (int) Math.ceil(Math.random()*6);
			currentPosition+=diceNumber;
			System.out.println("The current position is: "+currentPosition);
			if(currentPosition == 100)
			{
				System.out.println("Congratulations you have won");
				break;
			}
			for(int i=0;i<4;i++)
			{
				if(currentPosition == snakesList[i][0])
				{
					currentPosition=snakesList[i][1];
					System.out.println("There was a snake here, the current position is: "+currentPosition);
				}
				if(currentPosition == ladderList[i][0])
				{
					currentPosition=ladderList[i][1];
					System.out.println("There was a ladder here, the current position is: "+currentPosition);
				}
			}
			if(currentPosition>100)
			{
				currentPosition-=diceNumber;
				System.out.println("No Play! You can't move for now");
			}
		}
	}
}