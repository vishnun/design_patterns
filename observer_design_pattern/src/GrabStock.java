public class GrabStock {

	// The main class demonstrating observer pattern.

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setTeslaPrice(100);
		stockGrabber.setSpaceXPrice(101);

		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.unregister(observer1); // If you comment this line,
											// observer1 will be notified by the
											// following two price updates. You
											// can see that in the output.
		stockGrabber.setTeslaPrice(110);
		stockGrabber.setSpaceXPrice(111);
	}
}
