package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("Do you listen to music");
		
				// 2.  Ask the user a question 
		
		
				// 3.  Use an if statement to check if their answer is correct
		if (input.equals("yes")) {
		
				// 4.  if the user's answer was correct, add one to their score 
		score=score+1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String input1 = JOptionPane.showInputDialog("Do you play video games");
			
		if (input1.equals("yes")) {	
		score=score+1;	
		}
		
		String input2 = JOptionPane.showInputDialog("Do you walk to school");
		if (input2.equals("yes")) {
			score=score+1;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your score is "+score);
		
	}
}
