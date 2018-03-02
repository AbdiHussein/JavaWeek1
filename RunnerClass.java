import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		
		
		int[][] map = new int[6][6];
		map[3][3] = 1;
		map[2][5] = 9;
	
		
		while (true) {
		
			for (int i=0; i<map.length; i++) {
				for (int j =0; j < map.length; j++) {
					
					System.out.print(map[i][j]);
				}
				System.out.println(" ");
			}
		
		String outputMessage = "Enter the direction, north, east, south, west?";
		Scanner s = new Scanner(System.in);
		System.out.println(outputMessage);
		
		int positionX =3;
		int positionY=3;
		String input = s.nextLine();
		switch(input) {
			case "east":
				map[positionX + 1][positionY] = 1;
				map[positionX][positionY] = 0;
				break;
			case "west":
				map[positionX -1][positionY] = 1;
				map[positionX][positionY] = 0;
				break;
			case "north":
				map[positionX][positionY + 1] = 1;
				map[positionX][positionY] = 0;
				break;
			case "south":
				map[positionX][positionY - 1] = 1;
				map[positionX][positionY] = 0;
				break;
			default:
				System.out.print("Incorrect entry");
				
		}			
				
				
				
				
				
				
				
				
				
		}
		}
		
	}				
					
			
		
			
			
		
		
		
		
		
		
		
		
	
	
				
	



