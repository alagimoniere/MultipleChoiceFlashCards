/* MultipleChoiceFlashCards.java
 * Author: Alyssa Lagimoniere
 * Submission Date: 2/13/15
 * 
 * Purpose: The purpose of this project is to present the user with
 * a quiz, of up to three questions depending on if they give valid
 * answers or not. It will then count the points recieved and give
 * you a grade at the end.
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Scanner;
public class MultipleChoiceFlashCards {

	public static void main(String[] args) {
		
		//Define scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Print welcome
		System.out.println("Welcome to CSCI 1301 Multiple Choice Flash Cards! \n");
		
		//Declare and define variables
		String questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		String choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		String choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		String choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		String choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		String answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		int score = 0;
		
		//Display question #1 and choices and ask for input
		System.out.println(questionAndChoices);
		System.out.print("Enter your answer (a-d): ");
		String userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);		
		
		//Determine if answer #1 is valid and correct
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
			if ((answer == choiceA) && userAnswer.equalsIgnoreCase("a"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 1 point(s)\n");
			else if ((answer == choiceB) && userAnswer.equalsIgnoreCase("b"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 1 point(s)\n");
			else if ((answer == choiceC) && userAnswer.equalsIgnoreCase("c"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 1 point(s)\n");
			else if ((answer == choiceD) && userAnswer.equalsIgnoreCase("d"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 1 point(s)\n");
			else
				System.out.println("Incorrect Answer!\nYour score: " + score + " out of 1 point(s)\n");
		} else { 
			System.out.println("Invalid answer.\nAn Answer must begin with a, A, b, B, c, C, d, or D.\nGame over!");
			System.exit(0);
		}
		
		//Re-declare variables
		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		
		//Display question #2 and choices and ask for input
		System.out.println(questionAndChoices);
		System.out.print("Enter your answer (a-d): ");
		userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);
				
		//Determine if answer #2 is valid and correct
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
			if ((answer == choiceA) && userAnswer.equalsIgnoreCase("a"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 2 point(s)\n");
			else if ((answer == choiceB) && userAnswer.equalsIgnoreCase("b"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 2 point(s)\n");
			else if ((answer == choiceC) && userAnswer.equalsIgnoreCase("c"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 2 point(s)\n");
			else if ((answer == choiceD) && userAnswer.equalsIgnoreCase("d"))
				System.out.println("Correct Answer!\nYour score: " + (score+= 1) + " out of 2 point(s)\n");
			else
				System.out.println("Incorrect Answer!\nYour score: " + score + " out of 2 point(s)\n");
		} else { 
			System.out.println("Invalid answer.\nAn Answer must begin with a, A, b, B, c, C, d, or D.\nGame over!");
			System.exit(0);
		}
		
		//Re-declare variables
				questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
				choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
				choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
				choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
				choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
				answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
				
		//Display question #3 and choices and ask for input
		System.out.println(questionAndChoices);
		System.out.print("Enter your answer (a-d): ");
		userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);
						
		//Determine if answer #3 is valid and correct
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
			if ((answer == choiceA) && userAnswer.equalsIgnoreCase("a"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 3 point(s)\n");
			else if ((answer == choiceB) && userAnswer.equalsIgnoreCase("b"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 3 point(s)\n");
			else if ((answer == choiceC) && userAnswer.equalsIgnoreCase("c"))
				System.out.println("Correct Answer!\nYour score: " + (score += 1) + " out of 3 point(s)\n");
			else if ((answer == choiceD) && userAnswer.equalsIgnoreCase("d"))
				System.out.println("Correct Answer!\nYour score: " + (score+= 1) + " out of 3 point(s)\n");
			else
				System.out.println("Incorrect Answer!\nYour score: " + score + " out of 3 point(s)\n");
		} else { 
			System.out.println("Invalid answer.\nAn Answer must begin with a, A, b, B, c, C, d, or D.\nGame over!");
			System.exit(0);
		}
		
		//Print final score
		System.out.println("Your final score: " + score + " out of 3 point(s)");
		if (score == 0 || score == 1)
			System.out.println("Your computer science wit needs sharpening.");
		else if (score == 2)
			System.out.println("Your computer science wit is sharp.");
		else
			System.out.println("Your computer wit is as sharp as Occam's razor.");
				
	}

}
