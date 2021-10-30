package gui.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;

import gui.frame.GameWindow;
import model.Question;
import service.QuestionService;
import service.impl.QuestionServiceImpl;

public class GameWindowController {

	private GameWindow frame;
	private List<Question> questions;
	private QuestionService questionService;
	private int currentQuestion = 0;
	
	public GameWindowController() throws IOException {
		questionService = new QuestionServiceImpl();
		questions = questionService.getSessionQuestions();
	}
	
	public void showGameWindow() {
		if(frame == null) {
			frame = new GameWindow();
		}
		frame.setLocationRelativeTo(null);
		setActionListeners();
		showQuestion();
		frame.setVisible(true);
	}
	
	private void setActionListeners() {
		frame.getBtnAnswer1().addActionListener(e -> answerPicked((JButton)e.getSource()));
		frame.getBtnAnswer2().addActionListener(e -> answerPicked((JButton)e.getSource()));
		frame.getBtnAnswer3().addActionListener(e -> answerPicked((JButton)e.getSource()));
		frame.getBtnAnswer4().addActionListener(e -> answerPicked((JButton)e.getSource()));
	}
	
	private void showQuestion() {
		frame.getTxtAreaQuestionText().setText(questions.get(currentQuestion).getQuestionText());
		List<String> answers = new ArrayList<String>(4);
		for (String possibleAnswer : questions.get(currentQuestion).getPossibleAnswers()) {
			answers.add(possibleAnswer);
		}
		answers.add(questions.get(currentQuestion).getCorrectAnswer());
		Collections.shuffle(answers);
		showAnswers(answers);
	}
	
	private void showAnswers(List<String> answers) {
		frame.getBtnAnswer1().setText(answers.get(0));
		frame.getBtnAnswer2().setText(answers.get(1));
		frame.getBtnAnswer3().setText(answers.get(2));
		frame.getBtnAnswer4().setText(answers.get(3));
	}
	
	private void answerPicked(JButton chosenAnswerButton) {
		String answerPicked = chosenAnswerButton.getText();
		questions.get(currentQuestion).setGuessedAnswer(answerPicked);
		++currentQuestion;
		if(currentQuestion < this.questions.size()) 
			this.showQuestion();
		else {
			int points = this.questionService.calculatePoints(questions);
			new ResultWindowController().showResultWindow(points);
			frame.dispose();
		}
	}
	
}
