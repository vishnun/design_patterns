import java.util.ArrayList;

public class StockGrabber implements Subject {

	// Class that acts as a subject or publisher. It's responsibility is to
	// notify the observers.
	// Once the action (updating price in this case) is done, it has to update
	// the observers.
	// In short, it manages the observers subscribed to it.

	private ArrayList<Observer> observers;
	private int teslaPrice;
	private int spacexPrice;

	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	public void register(Observer o) {
		observers.add(o);
	}

	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		System.out.println("\nDeleting observer: " + index + 1);
		observers.remove(index);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(teslaPrice, spacexPrice);
		}
	}

	public void setSpaceXPrice(int spacexStockPrice) {
		this.spacexPrice = spacexStockPrice;
		notifyObservers();
	}

	public void setTeslaPrice(int teslaStockPrice) {
		this.teslaPrice = teslaStockPrice;
		notifyObservers();
	}

}
