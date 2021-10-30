package service;

import java.io.IOException;
import java.util.List;

import model.Question;

public interface QuestionService {
	
	public List<Question> getSessionQuestions() throws IOException;
	public int calculatePoints(List<Question> questions);

}
