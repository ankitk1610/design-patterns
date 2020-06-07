package adapter;

public class USBPlayer implements USB {

	String type;

	@Override
	public void signal() {
		System.out.println(type + " Playing through USB Player");
	}

}
