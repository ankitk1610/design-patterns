package command.component;

public class Light {

	String info;

	public Light(String info) {
		super();
		this.info = info;
	}

	public void swtichOn() {
		System.out.println(info + " Light Switched On..");
	}

	public void swtichOff() {
		System.out.println(info + " Light Switched Off..");
	}

}
