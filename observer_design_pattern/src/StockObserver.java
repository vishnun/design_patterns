public class StockObserver implements Observer {

	private int observerId; // To track observers.
	private static int observerCount = 0; // To keep track of number of
											// observers.

	private int spacexPrice; // This particular observer is about prices.
								// Another can be about anything else.
	private int teslaPrice;

	private Subject stockGrabber = new StockGrabber(); // Need this to register
														// with the publisher
														// (subject)

	// Initialize stuff
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerCount;
		stockGrabber.register(this);
	}

	public void update(int teslaStockPrice, int spacexStockPrice) {

		// once notified, this is the action to perform. All observers have only
		// one task to do something when notified of some change.

		this.spacexPrice = spacexStockPrice;
		this.teslaPrice = teslaStockPrice;

		System.out.println("\n\nObserver:" + this.observerId);
		System.out.println("Tesla price observed: " + teslaPrice);
		System.out.println("SpaceX price observed: " + spacexPrice);
	}

}
