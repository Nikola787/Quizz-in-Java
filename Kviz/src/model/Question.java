package model;

import java.util.Arrays;

public class Question {
	
	private String questionText;
	private String correctAnswer;
	private String guessedAnswer;
	private String[] possibleAnswers;
	private int points;
	
	public Question() {
		possibleAnswers = new String[3];
	}
	
	public Question(String questionText, String correctAnswer, String[] possibleAnswers, int points) {
		super();
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
		this.points = points;
	}

	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getGuessedAnswer() {
		return guessedAnswer;
	}
	public void setGuessedAnswer(String guessedAnswer) {
		this.guessedAnswer = guessedAnswer;
	}
	public String[] getPossibleAnswers() {
		return possibleAnswers;
	}
	public void setPossibleAnswers(String[] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Question [questionText=" + questionText + ", correctAnswer=" + correctAnswer + ", guessedAnswer="
				+ guessedAnswer + ", possibleAnswers=" + Arrays.toString(possibleAnswers) + ", points=" + points + "]";
	}
	
	
}
