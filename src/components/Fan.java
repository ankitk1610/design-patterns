package components;

public class Fan {

	String info;

	public Fan(String info) {
		super();
		this.info = info;
	}

	public void switchOn() {
		System.out.println(info + " Fan switched on..");
	}

	public void switchOff() {
		System.out.println(info + " Fan switched off..");
	}
}
