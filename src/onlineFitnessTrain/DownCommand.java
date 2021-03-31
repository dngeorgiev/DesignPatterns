package onlineFitnessTrain;

public class DownCommand implements Command {

	private TrainingPerson _trainingPerson;
	
	public DownCommand(TrainingPerson trainingPerson) {
		_trainingPerson = trainingPerson;
	}
	
	@Override
	public void execute() {
		_trainingPerson.down();
	}
}
