package singleton;

/**
 * 
 * @author ankit
 *@since June 6th, 2020
 *
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance = null;

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
