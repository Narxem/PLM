package lessons.recursion.cons;


import java.io.IOException;

import plm.core.model.lesson.Lesson;
import plm.universe.BrokenWorldFileException;

public class Main extends Lesson {

	@Override
	protected void loadExercises() throws IOException, BrokenWorldFileException {
		addExercise(new Length(this));
		addExercise(new IsMember(this));
		addExercise(new Occurrence(this));
		
		// The next ones are using cons or ::
		addExercise(new PlusOne(this));		
		// Some exercises are missing here
		addExercise(new Remove(this));		
	}

}