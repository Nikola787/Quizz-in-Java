package service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Question;
import repository.QuestionsRepository;
import repository.impl.QuestionsRepositoryImpl;
import service.QuestionService;

public class QuestionServiceImpl implements QuestionService {
	
	private QuestionsRepository questionRepository;
	
	public QuestionServiceImpl() {
		this.questionRepository = new QuestionsRepositoryImpl();
	}

	@Override
	public List<Question> getSessionQuestions() throws IOException {
		
		final int numberOfQuestions = 3;
		List<Question> allQuestions = this.questionRepository.getAll();
		List<Question> chosenQuestions = new ArrayList<Question>(numberOfQuestions);
		Random random = new Random();
		
		for (int i = 0; i < numberOfQuestions; i++) {
			int index = random.nextInt(allQuestions.size());
			chosenQuestions.add(allQuestions.get(index));
			allQuestions.remove(index);
		}
		return chosenQuestions;
	}

	@Override
	public int calculatePoints(List<Question> questions) {
		int points = 0;
		for (Question question : questions) {
			if(question.getCorrectAnswer().equals(question.getGuessedAnswer())) {
				points += question.getPoints();
			}
		}
		return points;
	}

}
