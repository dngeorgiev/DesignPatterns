package onlineFitnessTrain;

public class OnlineFitnessTrainMain {

	public static void main(String[] args) {
		WorkingOutPerson workingOutPerson = new WorkingOutPerson("Dani Nedelchev");
		
		Trainer trainer = new Trainer("Ivan Ivanov");
		trainer.setWorkingOutPerson(workingOutPerson);
		
		CommandFactory commandFactory = new CommandFactory();
		
		Command upCommand = commandFactory.createCommand("Up", workingOutPerson);
		Command downCommand = commandFactory.createCommand("Down", workingOutPerson);
		
		Observer onlineSpectator1 = new OnlineSpectator("Ivanka Ivankova", "92.212.45.36", "Twitch.TV");
		Observer onlineSpectator2 = new OnlineSpectator("Petyr Petrov", "95.122.88.34", "YouTube");
		Observer onlineSpectator3 = new OnlineSpectator("Ivanka Ivankova", "Twitch.TV");
		
		workingOutPerson.subscribe(trainer);
		workingOutPerson.subscribe(onlineSpectator1);
		workingOutPerson.subscribe(onlineSpectator2);
		workingOutPerson.subscribe(onlineSpectator3);
		
		trainer.setExercise(upCommand);
		trainer.workingOutPersonExecuteCommand();
		
		trainer.setExercise(downCommand);
		trainer.workingOutPersonExecuteCommand();
		
		// EXTRA
		Observer onSiteSpectator = new OnSiteSpectator("Georgi Georgiev", false);
		
		workingOutPerson.subscribe(onSiteSpectator);
		
		trainer.setExercise(upCommand);
		trainer.workingOutPersonExecuteCommand();
		
		trainer.setExercise(downCommand);
		trainer.workingOutPersonExecuteCommand();
	}

}
