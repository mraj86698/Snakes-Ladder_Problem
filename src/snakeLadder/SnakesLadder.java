package snakeLadder;

public class SnakesLadder {
	public static void main(String args[]) {
		System.out.println("Welcome to snake and ladder Game");
		int position = 0;
		System.out.println("Player starting Position is "+ position);
		int number = 1 + (int)(Math.random()* 6);
		System.out.println("After Rolling the dice i got "+ number);
		
		int option = (int) Math.floor(Math.random() * 3);
		if(option == 0) {
			System.out.println("No Play");
			position = position;
			System.out.println("Player Current Position is"+ position);
		}
			
			else if (option == 1) {
	            System.out.println("Player get Ladder");
	            position = position + number;
	            System.out.println("Player current position is " +position);
		}
			 else {
		            System.out.println("Player get Snake");
		            position = position - number;
		            if (position < 0) {
		            	position = 0;
		            }
		            System.out.println("Player current position is " + position);
		        }
	}
	

}
