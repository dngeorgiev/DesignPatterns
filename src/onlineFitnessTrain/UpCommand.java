package onlineFitnessTrain;

public class UpCommand implements Command {
	
	private TrainingPerson _trainingPerson;
	
	public UpCommand(TrainingPerson trainingPerson) {
		_trainingPerson = trainingPerson;
	}
	
	@Override
	public void execute() {
		_trainingPerson.up();
	}
}
