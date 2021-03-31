package onlineFitnessTrain;

public class Spectator implements Observer, TrainingPerson {
	
	private Boolean _isUp;
	private String _name;
	private Observable _workingOutPerson;

	public Spectator(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public Observable getWorkingOutPerson() {
		return _workingOutPerson;
	}
	
	public Boolean getIsUp() {
		return _isUp;
	}
	
	@Override
	public void update() {
		if (_workingOutPerson == null) {
			System.out.println(_name + " has no working out person set.");
			return;
		}
		String currentExercise = _workingOutPerson.getUpdate();
		
		if (currentExercise == "Up") {
			UpCommand upCommand = new UpCommand(this);
			upCommand.execute();
		} else if (currentExercise == "Down") {
			DownCommand downCommand = new DownCommand(this);
			downCommand.execute();
		}
	}

	@Override
	public void setWorkingOutPerson(Observable workingOutPerson) {
		_workingOutPerson = workingOutPerson;
	}
	
	@Override
	public void up() {
		System.out.println(this + " got up!");
		_isUp = true;
	}
	
	@Override
	public void down() {
		System.out.println(this + " got down!");
		_isUp = false;
	}
	
}
