public interface Observer {
	// This is an interface for a class that acts as an observer.

	// Note: the parameters need to be named specific to the class that
	// implements this observer.
	// It's done here for understanding only. Ideally, any class implementing
	// this
	// can be notified by a publisher(subject) with 2 parameters.

	public void update(int teslaStockPrice, int spacexStockPrice);
}
