package repository;

import java.io.IOException;
import java.util.List;

import model.Question;

public interface QuestionsRepository {

	public List<Question> getAll() throws IOException;
}
