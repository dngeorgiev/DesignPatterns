package onlineFitnessTrain;

public class OnSiteSpectator extends Spectator {

	private Boolean _hasMask;
	private CommandFactory _commandFactory;

	public OnSiteSpectator(String name, Boolean hasMask) {
		super(name);
		
		_hasMask = hasMask;
	}
	
	@Override
	public void update() {
		if (this.getWorkingOutPerson() == null) {
			System.out.println(this + " has no working out person set.");
			return;
		}
		if (!_hasMask) {
			System.out.println(this + " has no mask on, so he can't follow exercise :(.");
			return;
		}
		String currentExercise = this.getWorkingOutPerson().getUpdate();
		
		Command command = _commandFactory.createCommand(currentExercise, this);
		command.execute();
	}
	
	@Override
	public String toString() {
		return this.getName() + " (On site)";
	}

}
