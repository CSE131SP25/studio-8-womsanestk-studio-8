package studio8;

import support.cse131.NotYetImplementedException;
import java.util.Scanner;


public class Question {
	
	private String prompt;
	private String answer;
	private int points;
	
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 */
	public Question(String prompt, String answer, int points) {
		//throw new NotYetImplementedException();
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
		
	}
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO: Create a Question object of your own!
		Scanner in = new Scanner(System.in);
		Question q = new Question("what is a good question", "i dont know?", 20);
		q.displayPrompt();
		String givenAnswer = in.next();
		q.checkAnswer(givenAnswer);
	}
}
