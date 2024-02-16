package game;
import java.util.*;

public class GuessTheWord {
	private boolean play=true;
	private Word randomWord=new Word();
	private Scanner input=new Scanner(System.in);
	private int rounds=10;
	char lastRound;
	public void start() {	
		do {
			showWord();
			getInput();
			checkInput();
			
		}while(play);
	}
	
	void showWord() {
		System.out.println("You have "+rounds+" tries left");
		System.out.println(randomWord);
	}
	void getInput() {
		System.out.println("Enter a letter to guess the Word: ");
		String userGuess=input.nextLine();
		lastRound=userGuess.charAt(0);
			
	}
	void checkInput() {
		boolean GuessedRight=randomWord.guess(lastRound);
		if(GuessedRight) {
		if(randomWord.isGuessedRight()) {
			System.out.println("Congrats! you won");
			System.out.println("The word is: " + randomWord);
			play=false;
			
		}
	}
		else {
			rounds--;
			if(rounds==0) {
				System.out.println("Game Over");
				play=false;
			}
		}
	}
	public void end() {
		
		input.close();
		
	}

}
