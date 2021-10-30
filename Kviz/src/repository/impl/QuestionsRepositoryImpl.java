package repository.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import model.Question;
import repository.QuestionsRepository;

public class QuestionsRepositoryImpl implements QuestionsRepository {

	@Override
	public List<Question> getAll() throws IOException {
		List<Question> questions = new LinkedList<Question>();
		
		int i = 0;
		
		BufferedReader in = new BufferedReader(new FileReader("data/questions.txt"));
		
		boolean endOfFile = false;
		String questionText = "", correctAnswer = "";
		int points;
		String[] possibleAnswers = null;
		
		while(!endOfFile) {
			
			String line = in.readLine();
			++i;
			
			if(line == null) {
				endOfFile = true;
			} else {
				switch (i%6) {
				case 1:
					questionText = line;
					break;
				case 2:
					correctAnswer = line;
					break;
				case 3:
					possibleAnswers = new String[3];
					possibleAnswers[0] = line;
					break;
				case 4:
					possibleAnswers[1] = line;
					break;
				case 5:
					possibleAnswers[2] = line;
					break;
				case 0:
					points = Integer.parseInt(line);
					Question q = new Question(questionText, correctAnswer, possibleAnswers, points);
					questions.add(q);
					break;
				}
			}
		}
		in.close();
		return questions;
	}

}
