import java.util.*;
class Player
{
	int noOfRolls;
	int currentPosition;
	int diceNumber ;
	Player()
	{
		noOfRolls = 0; currentPosition = 0; diceNumber = 0;
	}
	public boolean findPosition(int[][] snakesList,int[][] ladderList)
	{
		noOfRolls++;
		diceNumber = (int) Math.ceil(Math.random()*6);
		currentPosition+=diceNumber;
		if(currentPosition>100)
		{
			currentPosition-=diceNumber;
			System.out.println("No Play! Out of Bounds! You can't move for now");
			return false;
		}
		System.out.println("The number on the dice is: "+diceNumber);
		System.out.println("The current position is: "+currentPosition);
		if(currentPosition == 100)
		{
			return true;
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
		return false;
	}
}
public class SnakeAndLadderGame
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Snake and Ladder Simulator Game");
		int startPosition = 0;
		int[][] snakesList = {{14,6},{45,19},{76,34},{94,80}};
		int[][] ladderList = {{9,26},{24,64},{50,62},{86,98}};
		System.out.println("The start position is: "+startPosition);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players:");
		n = sc.nextInt();
		int winningRolls = 0;
		Player[] obj = new Player[n];
		for(int i = 0; i < obj.length ; i++)
		{
			obj[i] = new Player();
		}
		for(int i=0;i<n;i++)
			System.out.println(obj[i].noOfRolls);
		int flag = 0;
		while(flag == 0)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println("Player "+(i+1)+"'s turn");
				if(obj[i].findPosition(snakesList,ladderList))
				{
					System.out.println("Player "+(i+1)+" is the winner");
					winningRolls = obj[i].noOfRolls;
					flag = 1;	
					break;
				}
			}
		}
		System.out.println("The number of moves in which the game was won is: "+winningRolls);
	}
}