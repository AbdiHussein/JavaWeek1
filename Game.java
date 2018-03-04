import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Map m = new Map();
		m.map[m.playerPositionX][m.playerPositionY] = 1;
		m.map[m.treasurePositionX][m.treasurePositionY] = 2;
		
		for (int i=0 ; i< m.map.length; i++) {
			for(int j=0; j < m.map.length; j++) {
				System.out.print(m.map[i][j]);
			}
			System.out.println("");
		}System.out.println(" ");

		String input = "";
		
		m.playerMovement(input);
		
		
		
		
		
		

	}

}
