package singleton;
/**
 * 
 * @author ankit
 *@since June 6th, 2020
 *
 */


public class ThreadSafeSingletonTest {

	public static void main(String[] args) {
		
		//NOT USING THREADS TO CREATE
		
		ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();

		ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();

		System.out.println("HashCode for Singelton1: " + singleton1.hashCode());
		System.out.println("HashCode for Singelton2: " + singleton2.hashCode());
		System.out.println("Are both same class : " + singleton1.equals(singleton2));
	}
}
