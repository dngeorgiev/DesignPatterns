package onlineFitnessTrain;

public interface Observable {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notifySubscribers();
	String getUpdate();
}
