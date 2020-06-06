package singleton;

/**
 * 
 * @author ankit
 *@since June 6th, 2020
 *
 */

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}
}
