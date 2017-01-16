public interface Subject {

	// A generic enough interface for any class to act like a publisher. It has
	// methods that can be used to manage observers.

	public void register(Observer o);

	public void unregister(Observer o);

	public void notifyObservers();
}
