import java.util.Scanner;

public class Map {
	int playerPositionX = 2;
	int playerPositionY = 3;
	int treasurePositionX = 2;
	int treasurePositionY = 5;
	int [][] map = new int[6][6];
	

	
	public void playerMovement(String input) {
		int loopCheck = 0;
		
		while (loopCheck == 0) {
			for (int i=0 ; i< map.length; i++) {
				for(int j=0; j < map.length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println("");
			}System.out.println(" ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter north, east, south or west");
			input = sc.nextLine();
		switch(input) {
		case "north":
			map[playerPositionX-1][playerPositionY] = 1;
			map[playerPositionX][playerPositionY] = 0;
			playerPositionX++;
			break;
		case "east":
			map[playerPositionX][playerPositionY+1] = 1;
			map[playerPositionX][playerPositionY] = 0;
			playerPositionY++;
			break;
		case "south":
			map[playerPositionX+1][playerPositionY] = 1;
			map[playerPositionX][playerPositionY] = 0;
			playerPositionX--;
			break;
		case "west":
			map[playerPositionX][playerPositionY-1] = 1;
			map[playerPositionX][playerPositionY] = 0;
			playerPositionY--;
			break;
		default:
			System.out.println("Incorrect entry");
			
		}
		System.out.println("Dial: "+ compass(playerPositionX, playerPositionY, treasurePositionX, treasurePositionY));
		
		if (playerPositionX == treasurePositionX && playerPositionY == treasurePositionY) {
			System.out.println("You have found the treasure");
			loopCheck = 1;
		}
	}
	
	
	}
	
	public double compass(int playerPositionX, int playerPositionY, int treasurePositionX, int treasurePositionY) {
	 int a;
	 int b;
	 if(treasurePositionX > this.playerPositionX) {
		 a = treasurePositionX - this.playerPositionX; 
	 }
	 else {
		 a = this.playerPositionX - treasurePositionX;		 
	 }
	 if (treasurePositionY > this.playerPositionY) {
		b = treasurePositionY - this.playerPositionY;
	 }
	 else {
		 b = treasurePositionY - this.playerPositionY; 
	 }
	 return Math.sqrt((a*a) + (b*b));
	}
}


