package snakeLadder;

public class SnakesLadder {
	static final int WinningPosition = 100;

	public static void main(String args[]) {
		System.out.println("Welcome to snake and ladder Game");
		int position = 0;
		int n;
		System.out.println("Player starting Position is "+ position);
		System.out.println("Rolls the dice to get number  ");
		int i = 0;
		
		while (position != WinningPosition) {
		int number = 1 + (int)(Math.random()* 6);
		int option = (int) Math.floor(Math.random() * 3);
		
		switch (option) {
        case 1:
            
            System.out.println("Dice " + number);
            
		if(option == 0) {
			System.out.println("No Play");
			position = position;
			System.out.println("Player Current Position is"+ position);
		}
			
			else if (option == 1) {
	            System.out.println("Player get the Ladder");
	            if (position < WinningPosition) {
	            position = position + number;
	            }else {
	            	position = position - number;
	            }
	            System.out.println("Player current position is " +position);
		}
			 else {
		            System.out.println("Player Bite the  Snake");
		            position = position - number;
		            if (position < 0) 
		            	position = 0;
		            
		            System.out.println("Player current position is " + position);
		        }
		break;
        case 2:
            System.out.println("exit");
            
        case 3:
            System.out.println("Invalid input");
            break;
	}
		i++;
		}
		System.out.println("Player Position is " + position);
        System.out.println("Total Moves = " + i);
	
	}
}
