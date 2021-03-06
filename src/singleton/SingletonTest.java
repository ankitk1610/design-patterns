package singleton;

/**
 * 
 * @author ankit
 *@since June 6th, 2020
 *
 */

public class SingletonTest {
public static void main(String[] args) {
	
	Singleton singleton1 = Singleton.getInstance();
	
	Singleton singleton2 = Singleton.getInstance();
	
	System.out.println("HashCode for Singelton1: " + singleton1.hashCode());
	System.out.println("HashCode for Singelton2: " + singleton2.hashCode());
	System.out.println( "Are both same class : "+ singleton1.equals(singleton2));
}
}
