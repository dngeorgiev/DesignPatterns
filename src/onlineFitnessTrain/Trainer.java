package onlineFitnessTrain;

public class Trainer implements Observer {

	private Command _exercise;
	private String _name;
	private Observable _workingOutPerson;

	public Trainer(String name) {
		_name = name;
	}
	
	@Override
	public void update() {
		// Trainer has nothing to do
//		if (_workingOutPerson == null) {
//			System.out.println(_name + " has no working out person set.");
//			return;
//		}
		//String currentExercise = _workingOutPerson.getUpdate();
		//System.out.println(_name + " updated with " + currentExercise);
	}

	@Override
	public void setWorkingOutPerson(Observable workingOutPerson) {
		_workingOutPerson = workingOutPerson;
	}
	
	@Override
	public String toString() {
		return "Trainer " + _name;
	}
	
	public void setExercise(Command command) {
		_exercise = command;
	}
	
	public void workingOutPersonExecuteCommand() {
		System.out.println(this + " told working out person to execute command.");
		
		_exercise.execute();
	}
}
