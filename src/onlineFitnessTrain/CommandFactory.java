package onlineFitnessTrain;

public class CommandFactory {
	public Command createCommand(String name, TrainingPerson trainingPerson) {
		if (name == "Up") {
			return new UpCommand(trainingPerson);
		}
		if (name == "Down") {
			return new DownCommand(trainingPerson);
		}
		
		System.out.println("No command exists with name - " + name);
		
		return null;
	}
}
