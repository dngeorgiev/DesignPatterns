package onlineFitnessTrain;

import java.util.ArrayList;
import java.util.List;

public class WorkingOutPerson implements Observable, TrainingPerson {

	private String _name;
	private List<Observer> _observers = new ArrayList<>();
	private String _currentExercise;
	private Boolean _isUp = false;
	
	public WorkingOutPerson(String name) {
		_name = name;
	}
	
	@Override
	public void subscribe(Observer observer) {
		_observers.add(observer);
		observer.setWorkingOutPerson(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		_observers.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for	(Observer observer: _observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return _currentExercise;
	}
	
	@Override
	public String toString() {
		return "Working Out Person " + _name;
	}
	
	@Override
	public void up() {
		System.out.println(this + " got up!");
		_isUp = true;
		_currentExercise = "Up";
		
		this.notifySubscribers();
	}
	
	@Override
	public void down() {
		System.out.println(this + " got down!");
		_isUp = false;
		_currentExercise = "Down";
		
		this.notifySubscribers();
	}
}
